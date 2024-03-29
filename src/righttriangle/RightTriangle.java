// Sajid Ahmed
// To compute the length of the hypotenuse of a right triangle
// given the lengths of the sides
package righttriangle;

/**
 *
 * @author Sajid Ahmed
 */
import java.util.Scanner;
public class RightTriangle {

    public static void main(String[] args) {
        double side1, side2; // lengths of the sides of a right triangle
        double hypotenuse; // length of the hypotenuse
        Scanner scan = new Scanner (System.in);
        // Get the lengths of the sides as input
        System.out.print("Please enter the lengths of the two sides of "
                + "a right triangle (seperate by a blank space): ");
        side1 = scan.nextDouble();
        side2 = scan.nextDouble();
        // Compute the length of the hypotenuse
        hypotenuse = Math.sqrt (Math.pow(side1, 2) + Math.pow(side2, 2));
        // Print the result
        System.out.println("The length of the hypotenuse of the "
                + "right triangle is: " + hypotenuse);
    }
    
}
