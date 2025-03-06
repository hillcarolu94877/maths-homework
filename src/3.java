public class MathHomework {
    public static int solveEquation(int a, int b, int c) {
        if (a == 0 && b == 0 && c == 0) {
            return -1; // Error
        }
        if (a == 0) {
            return -2; // Line is not a linear equation
        }
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return -3; // No real solutions
        } else {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        }
    }
}
