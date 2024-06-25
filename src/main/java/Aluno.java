public class Aluno{
  public String nome;
  public double nota1,nota2,nota3;
  public double nota = 0.0;

  public void calculoNota(){
    System.out.println();
    double nota = nota1 + nota2 + nota3;
    System.out.printf("FINAL GRADE = %.2f\n", nota);
    if (nota < 60){
      double missingPoints = 60 - nota;
      System.out.println("FAILED");
      System.out.printf("MISSING: %.2f POINTS", missingPoints);
    } else {
      System.out.println("PASS");
    }
  }
}