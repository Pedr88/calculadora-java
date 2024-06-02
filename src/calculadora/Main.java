package calculadora;

import static calculadora.MathFunctions.*;

import java.util.Scanner;

public class Main {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    boolean continuar = false;

    do {
      System.out.println("================================================================");
      System.out.println("Escolha uma das opções abaixo:");
      System.out.println("[+] Soma");
      System.out.println("[-] Subtração");
      System.out.println("[*] Multiplicação");
      System.out.println("[/] Divisão");
      String operacao = scan.next();

      System.out.println("Digite o primeiro número da operação que você deseja realizar: ");
      float num1 = scan.nextFloat();

      System.out.println("Digite o segundo número da operação que você deseja realizar: ");
      float num2 = scan.nextFloat();

      switch (operacao) {
        case "+":
          System.out.println(sum(num1, num2));
          break;
        case "-":
          System.out.println(subtracion(num1, num2));
          break;
        case "*":
          System.out.println(multiplication(num1, num2));
          break;
        case "/":
          System.out.println(division(num1, num2));
          break;
        default:
          System.out.println("Essa não é uma operação matemática válida!");
          break;
      }

      String reset;

      do {
        System.out.println("Deseja fazer outra operação matemática? [S/N]");
        reset = scan.next().toLowerCase();

        if (reset.equals("s")) {
          continuar = true;
        } else if (reset.equals("n")) {
          continuar = false;
        } else {
          System.out.println("Por favor, digite 'S' para sim ou 'N' para não.");
        }
      } while (!reset.equals("s") && !reset.equals("n"));

    } while (continuar);

    System.out.println("Obrigado por utilizar a calculadora!");
  }

}
