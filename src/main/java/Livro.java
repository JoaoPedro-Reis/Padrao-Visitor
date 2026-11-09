public class Livro implements Produto {

    private int codigo;
    private String titulo;
    private float preco;
    private String autor;

    public Livro(int codigo, String titulo, float preco, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getPreco() {
        return preco;
    }

    public String getAutor() {
        return autor;
    }

    public String aceitar(Visitor visitor) {
        return visitor.visitarLivro(this);
    }

}