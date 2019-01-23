/**
 * Write a class that has three overloaded static methods
 * for calculating the areas for circles, rectangles and
 * cylinders with the provided formulas.
 */
public class AreaClassProgram {

    public static class Area {

        // Calculate the area of a circle
        public static double getArea(double radius) {
            return Math.PI * radius * radius;
        }

        // Calculate the area of a rectangle
        public static double getArea(int length, int width) {
            return length * width;
        }

        // Calculate the area of a cylinder
        public static double getArea(double radius, double height) {
            return Math.PI * radius * radius * height;
        }
    }

    public static void main(String[] args) {

        // Area of a circle
        System.out.printf("The area of a circle with a "
                + "radius of 5.0 is %6.2f\n", Area.getArea(5.0));

        // Area of a rectangle
        System.out.printf("The area of a rectangle with a "
                        + "length of 5 and a width of 4 is %6.2f\n",
                Area.getArea(5, 4));

        // Area of cylinder
        System.out.printf("The area of a cylinder with a "
                        + "radius of 5.0 and a height " + "of 7.0 is %6.2f\n",
                Area.getArea(5.0, 7.0));
    }

}