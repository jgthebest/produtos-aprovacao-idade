public class CategoriasDeProdutos {
    private int codigoProduto;
    private String mensagem;

    public CategoriasDeProdutos(int codigoProduto){
        this.codigoProduto = codigoProduto;
    }
    public String categorizando(int codigoProduto){
        switch (codigoProduto){
            case 1:
               mensagem = "Eletrônicos";
                break;
            case 2:
              mensagem = "Alimentos";
                break;
            case 3:
               mensagem = "Vestuário";
                break;
            case 4:
                mensagem = "Livros";
        }
        return mensagem;
    }
}
