import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int cont = 1;

        System.out.println("digite 10 numeros:");
        

    while (cont <= 10) {
        System.out.println("numero" + cont + ":");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            pares++;

        } else {
            impares++;
        }

        cont++;
    }

    System.out.println("\nQuantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

    }
}
