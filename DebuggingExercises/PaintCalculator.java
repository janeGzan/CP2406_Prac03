import java.util.Scanner;

/*
 Created by jc429278 on 16/08/17.
 */
public class PaintCalculator
{
    public static void main(String args[]) {
        double length = 15;
        double width = 20;
        double height = 10;

        //length = getInput("length");
        //width = getInput("width");
        //height = getInput("height");
        double area= calculateTotalArea(height, width, length);

        double gallon = calculateGallon(area);
        double cost = calculateCost(gallon);
        System.out.print(String.format("The cost of paint a %.0f-by-%.0f-foot room with %.0f-foot ceiling is $%.2f"
                , length, width, height, cost ));

    }

    private static double getInput(String type)
    {
        double userInput;
        System.out.print(String.format("Enter %s:", type));
        Scanner input = new Scanner(System.in);
        userInput = input.nextDouble();
        return userInput;
    }
    private static double calculateTotalArea(double h, double w, double l)
    {
        double area;
        area = ((h * w)+(h * l))*2;
        return area;
    }
    private static double calculateGallon(double a)
    {
        double numberOfGallons;
        double AREACOVERED = 350;
        numberOfGallons = a/AREACOVERED;
        numberOfGallons = Math.ceil(numberOfGallons);
        System.out.println(numberOfGallons);
        System.out.println(String.format("%.0f Gallons of paint needed", numberOfGallons));
        return numberOfGallons;
    }
    private static double calculateCost(double g)
    {
        double PRICE = 32.0;
        return g * PRICE;
    }

}

