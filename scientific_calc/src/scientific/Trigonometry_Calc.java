package scientific;

import java.util.Scanner;

public class Trigonometry_Calc {

    Scanner sc = new Scanner(System.in);

    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_RESET = "\u001B[0m";

    void trigonometry() {
        System.out.println();
        System.out.println(TEXT_CYAN+"This is the Trigonometric Calculator."+ TEXT_RESET);
        try {
            System.out.println("1. Sine");
            System.out.println("2. Cosine");
            System.out.println("3. Tangent");
            System.out.println("4. aSine");
            System.out.println("5. aCos");
            System.out.println("6. aTan");
            System.out.println("7. Exit Calculator");
            System.out.println(TEXT_CYAN+"Choose your operation: "+ TEXT_RESET);
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter an angle in degrees to calculate Sine: ");

                    // use scanner to read the console input
                    Scanner scan = new Scanner(System.in);

                    // Assign the user to String variable
                    String sc = scan.nextLine();

                    // convert the string input to double
                    double value = Double.parseDouble(sc);
                    // convert the value to radians
                    double valueRadians = Math.toRadians(value);

                    // get the tangent of the angle
                    double sineValue = Math.cos(valueRadians);
                    System.out.println(TEXT_YELLOW+"Sin " + sc + " is = " + sineValue + TEXT_RESET);
                    System.out.println();
                    System.out.println("Continue if you wish to do another calculation or" + TEXT_CYAN + " Press 7" + TEXT_RESET + " to Exit Calculator");
                    trigonometry();


                }
                case 2 -> {
                    System.out.print("Enter an angle in degrees to calculate Cosine: ");

                    // use scanner to read the console input
                    Scanner scan = new Scanner(System.in);

                    // Assign the user to String variable
                    String sc = scan.nextLine();

                    // convert the string input to double
                    double value = Double.parseDouble(sc);
                    // convert the value to radians
                    double valueRadians = Math.toRadians(value);

                    // get the tangent of the angle
                    double cosineValue = Math.cos(valueRadians);
                    System.out.println(TEXT_YELLOW + "Cos " + sc + " is = " + cosineValue + TEXT_RESET);
                    System.out.println();
                    System.out.println("Continue if you wish to do another calculation or" + TEXT_CYAN + " Press 7" + TEXT_RESET + " to Exit Calculator");
                    trigonometry();

                }
                case 3 -> {
                    System.out.print("Enter an angle in degrees to calculate Tangent: ");

                    // use scanner to read the console input
                    Scanner scan = new Scanner(System.in);

                    // Assign the user to String variable
                    String sc = scan.nextLine();

                    // convert the string input to double
                    double value = Double.parseDouble(sc);
                    // convert the value to radians
                    double valueRadians = Math.toRadians(value);

                    // get the tangent of the angle
                    double tangentValue = Math.tan(valueRadians);
                    System.out.println(TEXT_YELLOW + "Tan " + sc + " is = " + tangentValue + TEXT_RESET);
                    System.out.println();
                    System.out.println("Continue if you wish to do another calculation or" + TEXT_CYAN + " Press 7" + TEXT_RESET + " to Exit Calculator");
                    trigonometry();

                }
                case 4 -> {
                    System.out.print("Enter an angle in degrees to calculate for InverseSine: ");

                    // use scanner to read the console input
                    Scanner scan = new Scanner(System.in);

                    // Assign the user to String variable
                    String sc = scan.nextLine();

                    // convert the string input to double
                    double value = Double.parseDouble(sc);
                    // convert the value to radians
                    double valueRadians = Math.toRadians(value);

                    // get the tangent of the angle
                    double inverseSineValue = Math.asin(valueRadians);
                    System.out.println(TEXT_YELLOW + "aSin(Inverse sine of ) " + sc + " is = " + inverseSineValue + TEXT_RESET);
                    System.out.println();
                    System.out.println("Continue if you wish to do another calculation or" + TEXT_CYAN + " Press 7" + TEXT_RESET + " to Exit Calculator");
                    trigonometry();
                }
                case 5 -> {
                    System.out.print("Enter an angle in degrees to calculate for InverseCos: ");

                    // use scanner to read the console input
                    Scanner scan = new Scanner(System.in);

                    // Assign the user to String variable
                    String sc = scan.nextLine();

                    // convert the string input to double
                    double value = Double.parseDouble(sc);
                    // convert the value to radians
                    double valueRadians = Math.toRadians(value);

                    // get the tangent of the angle
                    double inverseCosineValue = Math.acos(valueRadians);
                    System.out.println(TEXT_YELLOW + "aCos(Inverse cosine) of " + sc + " is = " + inverseCosineValue + TEXT_RESET);
                    System.out.println();
                    System.out.println("Continue if you wish to do another calculation or" + TEXT_CYAN + " Press 7" + TEXT_RESET + " to Exit Calculator");
                    trigonometry();
                }
                case 6 -> {
                    System.out.print("Enter an angle in degrees to calculate Tangent: ");

                    // use scanner to read the console input
                    Scanner scan = new Scanner(System.in);

                    // Assign the user to String variable
                    String sc = scan.nextLine();

                    // convert the string input to double
                    double value = Double.parseDouble(sc);
                    // convert the value to radians
                    double valueRadians = Math.toRadians(value);

                    // get the tangent of the angle
                    double inverseTangentValue = Math.atan(valueRadians);
                    System.out.println(TEXT_YELLOW + "aTan(Inverse tangent) of " + sc + " is = " + inverseTangentValue + TEXT_RESET);
                    System.out.println();
                    System.out.println("Continue if you wish to do another calculation or" + TEXT_CYAN + " Press 7" + TEXT_RESET + " to Exit Calculator");
                    trigonometry();
                }
                case 7 -> {
                    System.out.println(TEXT_YELLOW + "Now Exiting Calculator..." + TEXT_RESET);
                    System.out.println(TEXT_YELLOW + "Please wait...." + TEXT_RESET);
                    System.out.println();
                    System.out.println(TEXT_CYAN + "...Exit Successful!!" + TEXT_RESET);
                    System.exit(0);
                }
                default -> {
                    System.out.println(TEXT_RED + "SORRY INPUT OUT OF RANGE, PLEASE TRY AGAIN!!!" + TEXT_RESET);
                    System.out.println(TEXT_RED + "______________________________________________" + TEXT_RESET);
                    System.out.println();
                    trigonometry();
                }
            }
        }catch(Exception e){
            System.out.println(TEXT_RED + "BAD EXPRESSION, TRY AGAIN!!" + TEXT_RESET);
            System.out.println(TEXT_RED + "_____________________________"+ TEXT_RESET);
            System.out.println();

        }
    }
}


