public class VerificarAprovacao {

    float nota;
    String resultado;

    public VerificarAprovacao(float nota){
        this.nota = nota;
    }
    public String verificarNota(float nota){
        if (nota >= 6){
            resultado = "Aprovado.";
        }
        else if (nota >= 5 && nota < 6){
            resultado = "Recuperação";
        }
        else{
            resultado = "Reprovado.";
        }
        return resultado;
    }
}
