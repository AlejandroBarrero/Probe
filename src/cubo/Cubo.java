package cubo;
import java.util.Scanner;

public class Cubo {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double area, volumen, lado;
        System.out.print("Ingrese el lado del cubo: ");
        lado = lector.nextDouble();
        area = lado*lado*6;
        volumen = lado*lado*lado;
        System.out.println("El area del cubo es: "+area);
        System.out.println("El volumen del cubo es: "+volumen);     
    }
}
