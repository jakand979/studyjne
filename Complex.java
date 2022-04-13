public class Complex {
    private final double realPart;
    private final double imagPart;
    private static int numberOfInstances;
    public Complex(double realPart, double imagPart) {
        this.realPart = realPart;
        this.imagPart = imagPart;
    }
    public void displayComplex() {
        numberOfInstances += 1;
        if(numberOfInstances == 1) {
            System.out.println("x1 = " + realPart + "-" + imagPart + "i");
        }
        else {
            System.out.println("x2 = " + realPart + "+" + imagPart + "i");
        }
    }
}
