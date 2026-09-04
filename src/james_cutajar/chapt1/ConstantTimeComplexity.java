package james_cutajar.chapt1;

public class ConstantTimeComplexity {
    private double circleCircumference(int radius) {
        return 2.0 * Math.PI * radius;
    }
    public double getCircumference(int radius) {
        return circleCircumference(radius);
    }
    public static void main(String[] args) {
        ConstantTimeComplexity constantTime = new ConstantTimeComplexity();

        System.out.println(constantTime.getCircumference(5));
    }
}
