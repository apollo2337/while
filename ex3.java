import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int num = sc.nextInt();
        int cont = 1;
        while (cont<=num) {
            System.out.println(cont + 1);
            cont += 2;
        }
    }
}
