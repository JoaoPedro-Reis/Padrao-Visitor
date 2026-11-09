import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Carrinho {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    public String aceitar(Visitor visitor) {
        StringJoiner resultado = new StringJoiner("\n");
        for (Produto produto : produtos) {
            resultado.add(produto.aceitar(visitor));
        }
        return resultado.toString();
    }

}