import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Exercício: Manipulação de Variáveis e Operadores");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idadeAtual = scanner.nextInt();
        int idadeDaqui = 50 - idadeAtual;

        System.out.print("Digite sua altura em metros: ");
        double alturaMetros = scanner.nextDouble();
        double alturaCentimetros = alturaMetros * 100;
        System.out.println(" ");

        System.out.println("Olá, " + nome + "! Em " + idadeDaqui + " anos, você terá 50 anos. ");
        System.out.print("Sua altura em centímetros é: " + alturaCentimetros + " cm.");
        scanner.close();
    }
}