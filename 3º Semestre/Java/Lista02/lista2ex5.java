import java.util.Scanner;

public class lista2ex5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = 0, b = 0, c = 0;
        do {
            System.out.print("Digite o valor do coeficiente A: ");
            a = sc.nextDouble();
            if(a == 0) {
                System.out.println("O coeficiente A deve ser diferente de zero!");
            }
        } while(a == 0);
        System.out.print("Digite o valor do coeficiente B: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor do coeficiente C: ");
        c = sc.nextDouble();
        sc.close();
        System.out.println("Delta:");
        System.out.println(calcularDelta(a, b, c));
        System.out.println("Raizes:");
        System.out.println(calcularRaizes(a, b, c));
    }
    private static double calcularDelta(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);
        return delta;
    }

    private static String calcularRaizes(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);
        if(delta < 0) {
            return String.format("As raizes sao complexas!");
        } else {
            double x1 = (-b + (Math.sqrt(delta))) / (2 * a);
            double x2 = (-b - (Math.sqrt(delta))) / (2 * a);
            return String.format("Raiz x\' = %.1f\n" +
                                 "Raiz x\" = %.1f", x1, x2);
        }
    }
    
}
