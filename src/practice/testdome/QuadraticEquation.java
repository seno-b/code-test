package practice.testdome;


/**
 *
 *
 * Implement the function findRoots to find the roots of the quadratic equation: ax2 + bx + c = 0. If the equation has only one solution, the function should return that solution as both elements of the Roots. The equation will always have at least one solution.
 *
 * The roots of the quadratic equation can be found with the following formula: A quadratic equation.
 *
 * For example, the roots of the equation 2x2 + 10x + 8 = 0 are -1 and -4.
 *
 *
 * findRoots 함수를 구현하여 2 차 방정식의 근을 구합니다 : ax2 + bx + c = 0.
 *
 * 방정식에 하나의 해만있는 경우 함수는 해의 두 요소로 해를 반환해야합니다.
 * 방정식에는 항상 하나 이상의 해가 있습니다.
 *
 * 2 차 방정식의 근은 다음 공식으로 구할 수 있습니다. 2 차 방정식.
 *
 * 예를 들어, 방정식 2x2 + 10x + 8 = 0의 근은 -1과 -4입니다.
 */
public class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) {

        double root1 = 0, root2 = 0;

        double determinant = b * b - 4 * a * c;

        // condition for real and different roots
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
        }
        // Condition for real and equal roots
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);

            System.out.format("root1 = root2 = %.2f;", root1);
        }
        // If roots are not real
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }

        return new Roots(root1, root2);
    }

    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
}