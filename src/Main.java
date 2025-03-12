import com.VerificarAprovacao;
import com.VerificarIdade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota. ");
        float notaDigitada = sc.nextFloat();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        VerificarAprovacao verificarAprovacao = new VerificarAprovacao(notaDigitada);
        VerificarIdade verificarIdade = new VerificarIdade(idade);

        String resultadoFinal = verificarAprovacao.verificarNota(notaDigitada);
        String isMaior = verificarIdade.verificarMaioridade(idade);
        System.out.println("Seu resultado final é: " + resultadoFinal);
        System.out.println(isMaior);


    }
}
