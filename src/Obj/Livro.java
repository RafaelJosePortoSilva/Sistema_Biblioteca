package Obj;

public class Livro {

    private String codigo;
    private String titulo;
    private String autor;
    private int ano_publicacao;
    private String url_foto;


    public Livro(String codigo, String titulo) {
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

    public String getUrl_foto() {
        return url_foto;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }
}
