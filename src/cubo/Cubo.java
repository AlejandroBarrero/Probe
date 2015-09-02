package cubo;
import java.util.Scanner;

public class Cubo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double lado;
        System.out.print("Ingrese el lado del cubo: ");
        lado = lector.nextDouble();
        System.out.println("El area del cubo es: "+(lado*lado*6));
        System.out.println("El volumen del cubo es: "+(lado*lado*lado));     
    }
}
