//***************************************************************
//Steven Smail
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;

public class Paint
{

    public static void main(String[] args)
    {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal

        //declare integers length, width, and height;
        int length, width, height;
        int doors, windows;

        //declare double totalSqFt;
        double totalSqFt;

        //declare double paintNeeded;
        double paintNeeded;

	    //declare and initialize Scanner object
            Scanner scan = new Scanner (System.in);

        //Prompt for and read in the length of the room
        System.out.print("Enter the length of the room (ft): ");
        length = scan.nextInt();

        //Prompt for and read in the width of the room
        System.out.print("Enter the width of the room (ft): ");
        width = scan.nextInt();

        //Prompt for and read in the height of the room
        System.out.print("Enter the height of the room (ft): ");
        height = scan.nextInt();

        System.out.print("Enter the number of doors: ");
        doors = scan.nextInt();

        System.out.print("Enter the number of windows: ");
        windows = scan.nextInt();

        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        totalSqFt = (2 * length * height) + (2 * width * height) -
        (20 * doors) - (15 * windows);

        //Compute the amount of paint needed
        paintNeeded = (totalSqFt / COVERAGE);

        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
        System.out.println("Length of the room: " + length + " ft ");
        System.out.println("Width of the room: " + width + " ft ");
        System.out.println("Height of the room: " + height + " ft ");
        System.out.println("Gallons of Paint Needed: " +
                            paintNeeded);
    }
}
