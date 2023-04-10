import java.util.Scanner;
//Exercicio 03: Faça um Programa que peça dois números e imprima a soma.

class Main {
  public static void main(String[] args) {
  //Declaração de variáveis
int numero1;
int numero2;
int soma;
  //Fazendo a entrada de dados
Scanner teclado = new Scanner(System.in);
    System.out.println("Insira o primeiro numero: ");
    numero1 = teclado.nextInt();
    System.out.println("Insira o segundo numero: ");
    numero2 = teclado.nextInt();
  //Fazendo o calculo
    soma = numero1 + numero2;
  //Exibir a resposta ao usuário
    System.out.println(numero1 + " + " + numero2 + " = " + soma);
  }
}
