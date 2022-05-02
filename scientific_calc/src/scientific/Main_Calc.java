package scientific;

import java.util.*;

public class Main_Calc {

    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_RESET = "\u001B[0m";

    /*************************************** Main Method ***************************************/

    public static void main(String[] args) {
            while (true) {
                try {
                    Scanner s = new Scanner(System.in);
                    System.out.println("1. Standard Calculator");
                    System.out.println("2. Scientific Calculator");
                    System.out.println("3. Trigonometric Calculator");
                    System.out.println("4. Exponential Calculator");
                    System.out.println("5. Exit Program");
                    System.out.println("Please Input an Option: ");
                    int choice = s.nextInt();
                    switch (choice) {
                        case 1 -> {
                            Standard_Calc standard = new Standard_Calc();
                            standard.standard();
                            System.out.println();
                        }
                        case 2 -> {
                            Scientific_Calc scientific = new Scientific_Calc();
                            scientific.scientific();
                            System.out.println();
                        }
                        case 3 -> {
                            Trigonometry_Calc trigonometry = new Trigonometry_Calc();
                            trigonometry.trigonometry();
                            System.out.println();
                        }
                        case 4 -> {
                            Exponential_Calc exponential = new Exponential_Calc();
                            exponential.exponential();
                            System.out.println();
                        }
                        case 5 -> {
                            System.out.println(TEXT_YELLOW + "Now Exiting Program..." + TEXT_RESET);
                            System.out.println(TEXT_YELLOW + "Please wait...." + TEXT_RESET);
                            System.out.println();
                            System.out.println(TEXT_CYAN + "...Exit Successful!!" + TEXT_RESET);
                            System.exit(0);
                        }
                        default -> {
                            System.out.println(TEXT_RED + "SORRY INPUT OUT OF RANGE, PLEASE TRY AGAIN!!!" + TEXT_RESET);
                            System.out.println(TEXT_RED + "______________________________________________" + TEXT_RESET);
                            System.out.println();
                        }
                    }
                } catch (Exception e) {
                    System.out.println(TEXT_RED + "SYNTAX ERROR!! CHOOSE A CALCULATOR OR" + TEXT_CYAN + " PRESS 5 " + TEXT_RESET +TEXT_RED+ "TO EXIT PROGRAM." + TEXT_RESET);
                    System.out.println();
                }
            }

        }


}


