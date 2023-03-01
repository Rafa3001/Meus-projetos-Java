package com.exemplo;

import java.util.Scanner;

public class main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double num1, num2, resultado;
      char operador;

      System.out.print("Digite o primeiro número: ");
      num1 = input.nextDouble();

      System.out.print("Digite o segundo número: ");
      num2 = input.nextDouble();

      System.out.print("Digite o operador (+, -, *, /): ");
      operador = input.next().charAt(0);

      switch (operador) {
         case '+':
            resultado = num1 + num2;
            break;

         case '-':
            resultado = num1 - num2;
            break;

         case '*':
            resultado = num1 * num2;
            break;

         case '/':
            resultado = num1 / num2;
            break;

         default:
            System.out.println("Operador inválido");
            return;
      }

      System.out.println(num1 + " " + operador + " " + num2 + " = " + resultado);
   }
}
