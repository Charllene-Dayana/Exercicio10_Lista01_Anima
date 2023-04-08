
// Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double graus;
        double fahrenheit;
        Scanner teclado = new Scanner(System.in);
        System.out.println("qual o valor do graus celsius");
        graus = teclado.nextDouble();
        fahrenheit = graus = (graus * 9 / 5) + 32;
        System.out.println("o graus fahrenheit é " + fahrenheit);
        teclado.close();
    }

}
