package Obj;

public class Livro {

    private int codigo;
    private String titulo;
    private String autor;
    private int ano_publicacao;


    public Livro(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }

    public void setAnoPublicacao(int ano){
        this.ano_publicacao = ano;
    }
    public int getAnoPublicacao(){
        return ano_publicacao;
    }

    // METODOS


}
