public class QuadraticEquation {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Nieprawidlowa ilosc argumentow wejsciowych!");
            return;
        }
        double a;
        double b;
        double c;
        try{
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);
        }
        catch(NumberFormatException incorrectInput) {
            System.out.println("Nieprawidlowe dane wejsciowe!");
            return;
        }
        if(a == 0) {
            System.out.println("To nie jest rownanie kwadratowe!");
            return;
        }
        System.out.println("Parametry rownania kwadratowego postaci ax^2 + bx + c = 0");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        double delta = Math.pow(b,2) - (4 * a * c);
        System.out.println("delta = " + delta);
        if(delta < 0) {
            System.out.println("Brak pierwiastkow rzeczywistych rownania kwadratowego!");
            System.out.println("Wystepuja dwa pierwiastki zespolone rownania kwadratowego:");
            double deltaZesp = Math.sqrt(Math.abs(delta));
            double real = (-b)/(2 * a);
            double imag = (deltaZesp)/(2 * a);
            Complex x1 = new Complex(real,imag);
            Complex x2 = new Complex(real,imag);
            x1.displayComplex();
            x2.displayComplex();
        }
        else if(delta == 0) {
            System.out.println("Wystepuje jeden podwojny pierwiastek rzeczywisty rownania kwadratowego:");
            double x0 = (-b)/(2 * a);
            System.out.println("x0 = " + x0);
        }
        else {
            System.out.println("Wystepuja dwa pierwiastki rzeczywiste rownania kwadratowego:");
            double x1 = (-b - Math.sqrt(delta))/(2 * a);
            double x2 = (-b + Math.sqrt(delta))/(2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
