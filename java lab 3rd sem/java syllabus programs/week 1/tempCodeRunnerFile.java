import java.util.Scanner;

public class roots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Coefficient 'a' cannot be zero.");
            return;
        }
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Two real solutions: x1 = %.2f, x2 = %.2f%n", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("One real solution: x = %.2f%n", root);
        } else {
            System.out.println("No real solutions.");
        }
    }
}