package calculator;
import java.util.Scanner;

public class CalculadoraDeNotas {
	public class VerificadorAprovacao {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a primeira nota: ");
	        double nota1 = scanner.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double nota2 = scanner.nextDouble();

	        System.out.print("Digite a terceira nota: ");
	        double nota3 = scanner.nextDouble();

	        double media = (nota1 + nota2 + nota3) / 3;

	        System.out.println("Média das notas: " + media);

	        if (media >= 7.0) {
	            System.out.println("Aluno aprovado!");
	        } else {
	            System.out.println("Aluno reprovado.");
	        }

	        scanner.close();
	    }
	}
}
