package Obj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Database {

    private Livro[] livros;
    private String diretorio;

    public Database(String diretorio){
        this.diretorio = diretorio;
    }

    public Livro[] load_data(){

        String linha = "";
        String[] colunas;

        try (BufferedReader leitor = new BufferedReader(new FileReader(diretorio))){
            while ((linha = leitor.readLine()) != null){

                colunas = linha.split(",");

                // acessar dados da linha
                System.out.println(colunas);





            } // end while
        } // end try
        catch (IOException e) {
            throw new RuntimeException(e);
        } // end catch
        return new Livro[]{new Livro(1, "Livro")};
    }



} // end Database
