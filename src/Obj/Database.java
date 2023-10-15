package Obj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Database {

    private String diretorio;

    public Database(String diretorio){
        this.diretorio = diretorio;
    }

    public Livro[] load_data(){

        String linha = "";
        String[] colunas = {};

        int  ano_publi;
        String codigo_,titulo_, autor_,url_foto_;


        boolean cabecalho = true;
        int count = 0;
        
        try (BufferedReader contador = new BufferedReader(new FileReader(diretorio))){
            while ((linha = contador.readLine()) != null){
                count++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Livro[] listaLivros = new Livro[count];
        int indice = 0;

        try (BufferedReader leitor = new BufferedReader(new FileReader(diretorio))){
            while ((linha = leitor.readLine()) != null){

                colunas = linha.split(",");
                System.out.println(colunas.length);

                if (colunas.length > 8) {continue;}

                // acessar dados da linha
                System.out.println(colunas);

                if (cabecalho == true){
                    cabecalho = false;
                    continue;
                }

                codigo_ = colunas[0];
                titulo_ = colunas[1];
                autor_ = colunas[2];
                ano_publi = Integer.parseInt(colunas[3]);
                url_foto_ = colunas[6];


                listaLivros[indice] = new Livro(codigo_, titulo_);
                listaLivros[indice].setAutor(autor_);
                listaLivros[indice].setAnoPublicacao(ano_publi);
                listaLivros[indice].setUrl_foto(url_foto_);
                indice++;


            } // end while
        } // end try
        catch (IOException e) {
            throw new RuntimeException(e);
        } // end catch

        return listaLivros;
    }



} // end Database
