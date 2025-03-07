import java.util.Scanner;

public class Exercicio{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variáveis
        int idadeAtual, idadeFuturo;
        double alturaMetros, alturaCentimetros;
        
        //Título
        System.out.println(" ");
        System.out.println("Exercício: Manipulação de Variáveis e Operadores");
        System.out.println(" ");

        //Seu nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        //Sua idade
        System.out.print("Digite sua idade: ");
        idadeAtual = scanner.nextInt();
        idadeFuturo = 50 - idadeAtual;

        //Sua altura
        System.out.print("Digite sua altura em metros: ");
        alturaMetros = scanner.nextDouble();
        alturaCentimetros = alturaMetros * 100;
        System.out.println(" ");

        //Resposta
        System.out.println("Olá, " + nome + "! Em " + idadeFuturo + " anos, você terá 50 anos. ");
        System.out.print("Sua altura em centímetros é: " + alturaCentimetros + " cm.");
        scanner.close();
    }
}