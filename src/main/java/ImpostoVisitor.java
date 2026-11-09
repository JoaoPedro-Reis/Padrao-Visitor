public class ImpostoVisitor implements Visitor {

    public String calcular(Produto produto) {
        return produto.aceitar(this);
    }

    @Override
    public String visitarLivro(Livro livro) {
        float imposto = 0; // livros sao isentos de imposto
        return "Imposto do Livro '" + livro.getTitulo() + "': R$ " + imposto;
    }

    @Override
    public String visitarEletronico(Eletronico eletronico) {
        float imposto = eletronico.getPreco() * 20 / 100; // 20%
        return "Imposto do Eletronico '" + eletronico.getNome() + "': R$ " + imposto;
    }

    @Override
    public String visitarAlimento(Alimento alimento) {
        float imposto = alimento.getPreco() * 5 / 100; // 5%
        return "Imposto do Alimento '" + alimento.getNome() + "': R$ " + imposto;
    }
}