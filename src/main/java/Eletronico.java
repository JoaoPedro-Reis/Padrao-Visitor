public class Eletronico implements Produto {

    private int codigo;
    private String nome;
    private float preco;
    private int garantiaMeses;

    public Eletronico(int codigo, String nome, float preco, int garantiaMeses) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.garantiaMeses = garantiaMeses;
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

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public String aceitar(Visitor visitor) {
        return visitor.visitarEletronico(this);
    }

}