import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Exercício: Manipulação de Variáveis e Operadores");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        int idade30 = idade + 30;

        System.out.print("Digite sua altura em metros: ");
        double alturaMetros = scanner.nextDouble();
        double alturaCentimetros = alturaMetros * 100;
        System.out.println(" ");

        System.out.println("Olá, " + nome + "! Em 30 anos, você terá " + idade30 + " anos. ");
        System.out.println("Sua altura em centímetros é: " + alturaCentimetros + " cm.");
        scanner.close();
    }
}