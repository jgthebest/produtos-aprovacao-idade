public class VerificarIdade {
    private int idade;
    private String mensagem;

    public VerificarIdade(int idade){
        this.idade = idade;
    }

    public String verificarMaioridade(int idade){
        if (idade >= 18){
            mensagem = "Você é maior de idade.";
        }
        else{
            mensagem = "Você é menor de idade.";
        }
        return mensagem;
    }
}
