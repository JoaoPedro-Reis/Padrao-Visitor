public class Alimento implements Produto {

    private int codigo;
    private String nome;
    private float preco;
    private String validade;

    public Alimento(int codigo, String nome, float preco, String validade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public String getValidade() {
        return validade;
    }

    public String aceitar(Visitor visitor) {
        return visitor.visitarAlimento(this);
    }

}