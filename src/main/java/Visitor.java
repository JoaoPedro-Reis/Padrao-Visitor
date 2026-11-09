public interface Visitor {

    String visitarLivro(Livro livro);
    String visitarEletronico(Eletronico eletronico);
    String visitarAlimento(Alimento alimento);

}