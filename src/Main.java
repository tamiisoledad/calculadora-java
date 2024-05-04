import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inserte 2 numeros para realizar los calculos");
        
        Scanner scanner = new Scanner(System.in);
        
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        
        System.out.println("La respuesta de la suma es: ");
        System.out.println(suma(a, b));
        System.out.println("La respuesta de la resta es: ");
        System.out.println(resta(a, b));
        System.out.println("La respuesta de la multiplicacion es: ");
        System.out.println(multiplicacion(a, b));
        System.out.println("La respuesta de la division es: ");
        System.out.println(division(a, b));
    }
    
    public static int suma (int a, int b) {
    	return a + b;
    }
    
    public static int resta (int a, int b) {
    	return a - b;
    }
    
    public static int multiplicacion (int a, int b) {
    	return a * b;
    }
    
    public static int division (int a, int b) {
    	return a / b;
    }
}
