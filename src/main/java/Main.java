import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Aluno aluno = new Aluno();

    System.out.println("Digite o nome do aluno: ");
    aluno.nome = sc.nextLine();
    System.out.println("Digite a nota 1: ");
    aluno.nota1 = sc.nextDouble();
    System.out.println("Digite a nota 2: ");
    aluno.nota2 = sc.nextDouble();
    System.out.println("Digite a nota 3: ");
    aluno.nota3 = sc.nextDouble();

    aluno.calculoNota();
  }
}