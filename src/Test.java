
public class Test {
    public static void main(String[] args) {
        int radius = 5;
        double area;
        if (radius >= 0) {
            area = (double) radius * radius * Math.PI;
            System.out.println("The area for the circle of radius " +
                    radius + " is " + area);
        }
    }
}
