/*
  Created by jc429278 on 16/08/17.
 */

import java.util.Scanner;
public class BookstoreCredit
{
    public static void main(String args[]){
        String studentName;
        double gradeAverage;
        double credit;
        System.out.print("Enter name:" );
        studentName = getInput();
        System.out.print("Enter grade average:" );
        gradeAverage = Double.parseDouble(getInput());
        credit = computeCredit(gradeAverage);

        System.out.print(String.format("%s, You have $%.2f",studentName,credit));

    }
    private static double computeCredit(double grade){
        double total;
        int RATE = 10;
        total = grade * RATE;
        return total;
    }

    private static String getInput()
    {
        String userInput;
        Scanner input = new Scanner(System.in);
        userInput = input.nextLine();
        return userInput;
    }
}
