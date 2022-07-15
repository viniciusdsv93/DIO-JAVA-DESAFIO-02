import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro parametro:");
    int primeiroNum = sc.nextInt();
    System.out.println("Digite o segundo parametro:");
    int segundoNum = sc.nextInt();

    try {
      contar(primeiroNum, segundoNum);
    }
    catch (ParametrosInvalidosException e) {
      System.out.println("O segundo parametro deve ser maior que o primeiro");
    }
  }

  public static void contar(int primeiroParam, int segundoParam) throws ParametrosInvalidosException {
    if (primeiroParam > segundoParam) {
      throw new ParametrosInvalidosException();
    }

    for (int i = primeiroParam; i < segundoParam; i++) {
      System.out.println("Imprimindo o numero " + i);
    }
  }
}
