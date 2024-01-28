import java.util.Scanner;
import java.lang.Math;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = " ";
        double spice = 0.0;
        double spiceCalc = 0.0;
        double innerSpice = 0.0;
        System.out.println("You're Jane's friend!");
        System.out.println("What's your name?");
        name = input.nextLine();
        System.out.println("Enter a floating-point number:");
        spice = input.nextDouble();
        innerSpice = Math.sqrt(5)/Math.pow(spice,3.0);
        spiceCalc = (4.0/3) *Math.pow(2.0,innerSpice);
        System.out.println("Well "+name +","+" the spice value resulted in "+ spiceCalc);
        double convertedCalc = (int)(spiceCalc * 100)/100.0;
        System.out.println("And the converted value is " + convertedCalc);

    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        double wallArea = wallWidth * wallHeight;
        System.out.println("Wall area: "+ wallArea +" square feet");
        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        double paintNeed = gallonsPerCan/(squareFeetPerGallons/wallArea);
        double convertedCalc = (int)(paintNeed * 100)/100.00;
        System.out.print("Paint needed: ");
        System.out.printf("%.2f",convertedCalc);
        System.out.print(" gallons\n");


        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        double cans = Math.ceil(convertedCalc);
        System.out.println("Cans needed: " + (int)cans + " can(s)");
    }
}
