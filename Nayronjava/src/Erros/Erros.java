package Erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Erros {

    public static void dividir(Scanner ler)
            throws InputMismatchException, ArithmeticException {

        System.out.println("Numero: ");
        int a = ler.nextInt();
        System.out.println("Divisor: ");
        int b = ler.nextInt();

        System.out.println(a / b);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean continua = true;

        do {

            try {
                dividir(ler);
                continua = false;
            } catch (InputMismatchException | ArithmeticException e1) {

                System.out.println("Numero Invalido");
                ler.nextLine();// descarta a entrada do usuario   
                e1.getMessage();
            } finally {
                System.out.println("Finally executado");
            }

        } while (continua);

    }

}
