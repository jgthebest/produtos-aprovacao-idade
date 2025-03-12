import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        float notaDigitada = sc.nextFloat();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite o código do produto: ");
        int codigoProduto = sc.nextInt();

        VerificarAprovacao verificarAprovacao = new VerificarAprovacao(notaDigitada);
        VerificarIdade verificarIdade = new VerificarIdade(idade);
        CategoriasDeProdutos categorizar = new CategoriasDeProdutos(codigoProduto);

        String resultadoFinal = verificarAprovacao.verificarNota(notaDigitada);
        String isMaior = verificarIdade.verificarMaioridade(idade);
        String categoria = categorizar.categorizando(codigoProduto);
        System.out.println("Seu resultado final é: " + resultadoFinal);
        System.out.println(isMaior);
        System.out.println(categoria);




    }
}
