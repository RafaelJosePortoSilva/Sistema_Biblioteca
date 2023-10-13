package Obj;

import java.io.BufferedReader;
import java.io.FileReader;

public class Database {

    private Livro[] livros;
    private String diretorio;

    public Database(String diretorio){
        this.diretorio = diretorio;
    }

    public Livro[] load_data(){

        try (BufferedReader leitor = new BufferedReader(new FileReader(diretorio))){
            while ((linha = leitor.readLine()) != null){

                String[] colunas = linha.split(',');


            } // end while
        } // end try

    }



} // end Database
