import java.util.Scanner;
public class EcuacionCuadratica {
    private double a;
    private double b;
    private double c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminante() {
        return b * b - 4 * a * c;
    }

    public String getRaices() {
        double discriminante = getDiscriminante();

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return "La ecuacion tiene dos raices: " + raiz1 + " y " + raiz2;
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            return "La ecuacion tiene una raiz: " + raiz;
        } else {
            return "La ecuacion no tiene raices reales";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a=1,b=2.0,c=1;
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        System.out.println(ecuacion.getRaices());

        
    }
}
