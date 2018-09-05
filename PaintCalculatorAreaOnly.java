import cs1.Keyboard;
import java.util.Scanner;

public class PaintCalculatorAreaOnly
{
	public static void main(String[] args)
	{

		int length = 0, width = 0, height = 0, doors = 0, windows = 0, surfaceArea = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Length: ");
		length = input.nextInt();
		System.out.print("Width: ");
		width = input.nextInt();
		System.out.print("Height: ");
		height = input.nextInt();
		System.out.print("Number of doors: ");
		doors = input.nextInt();
		System.out.print("Number of windows: ");
		windows = input.nextInt();

		surfaceArea = (2 * length * height) + (2 * width * height) - (doors * 21) - (windows * 12);

		System.out.println(" ");
		System.out.println("Total Square feet: " + surfaceArea + " square feet");

	}
}