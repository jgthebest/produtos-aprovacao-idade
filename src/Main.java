import com.VerificarAprovacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota. ");
        int notaDigitada = sc.nextInt();

        VerificarAprovacao verificarAprovacao = new VerificarAprovacao(notaDigitada);

        String resultadoFinal = verificarAprovacao.verificarNota(notaDigitada);
        System.out.println("Seu resultado final é: " + resultadoFinal);

        sc.close();
    }
}
