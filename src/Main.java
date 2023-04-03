// Import the Scanner util.
import java.util.Scanner;
// Import the Math util.
import java.lang.Math;

/**
 * Calculates various attributes of a cone based on inputted radius and height.
 */
public class Main {

    /** Compiler constructor. */
	public static void main(String[] args) {
		// Instantiates the scanner object.
		Scanner scanner = new Scanner(System.in);

		// Requests the user to input a value for the radius.
		System.out.println("What is the radius of the cone?");
		// Assigns the input to the radius double.
		double radius = scanner.nextDouble();

		// Requests the user to input a value for the height.
		System.out.println("What is the height of the cone?");
		// Assigns the input to the height double.
		double height = scanner.nextDouble();

		/**
		* Formulas to calculate various attributes of a cone:
		* 
		* Slant Height: sqrt(radius^2 + height^2) 
		* Volume: pi/3 * radius^2 * height 
		* Surface Area: pi * radius * (radius + sqrt(radius^2 + height^2))
		*/
		// Outputs the slant height.
		System.out.println("Slant Height: " + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
		// Outputs the volume.
		System.out.println("Volume: " + Math.PI / 3 * Math.pow(radius, 2) * Math.pow(height, 2));
		// Outputs the surface area.
		System.out.println("Surface Area: " + Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2))));

		// Terminates the scanner runnable.
		scanner.close();
	}
}