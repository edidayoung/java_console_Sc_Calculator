package scientific;

import java.util.Scanner;



public class Scientific_Calc {

    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_RESET = "\u001B[0m";

    int a , b;
    Scanner sc = new Scanner(System.in);

    int power() {
        System.out.println("Enter any two numbers for Power: ");
        a = sc.nextInt();
        b = sc.nextInt();
        return ((int) Math.pow(a, b));
    }

    int square() {
        System.out.println("Enter any number to find its Square: ");
        a = sc.nextInt();
        return (a * a);
    }

    int cube() {
        System.out.println("Enter any number to find its Cube: ");
        a = sc.nextInt();
        return (a * a * a);
    }

    int square_root() {
        System.out.println("Enter any number to find its Square-Root: ");
        a = sc.nextInt();
        return ((int) Math.sqrt(a));
    }

    void round() {
        System.out.println("Enter a number to Round-up: ");
        double value = sc.nextDouble();
        double roundValue = Math.round(value);
        System.out.println(TEXT_YELLOW + "Rounding of " + value + " = " + roundValue + TEXT_RESET);
        System.out.println();
        System.out.println("Continue if You wish to do another Calculation or"+TEXT_CYAN + " Press 10 "+TEXT_RESET+ "to Exit Calculator");
        scientific();

    }

    void ceiling() {
        System.out.println("Enter a number to Ceil: ");
        double value = sc.nextDouble();
        double ceilValue = Math.ceil(value);
        System.out.println(TEXT_YELLOW + "Ceiling of " + value + " = " + ceilValue + TEXT_RESET);
        System.out.println();
        System.out.println("Continue if You wish to do another Calculation or"+TEXT_CYAN + " Press 10 "+TEXT_RESET+ "to Exit Calculator");
        scientific();
    }

    void floor() {
        System.out.println("Enter a number to Floor: ");
        double value = sc.nextDouble();
        double floorValue = Math.floor(value);
        System.out.println(TEXT_YELLOW +"Flooring of " + value + " = " + floorValue + TEXT_RESET);
        System.out.println();
        System.out.println("Continue if You wish to do another Calculation or"+TEXT_CYAN + " Press 10 "+TEXT_RESET+ "to Exit Calculator");
        scientific();
    }

    int minimum() {
        System.out.println("Enter two numbers to find the Minimum Value: ");
        a = sc.nextInt();
        b = sc.nextInt();
        return (Math.min(a, b));
    }

    int maximum() {
        System.out.println("Enter two numbers to find the Maximum Value: ");
        a = sc.nextInt();
        b = sc.nextInt();
        return (Math.max(a, b));
    }

    void scientific(){
        System.out.println();
        System.out.println(TEXT_CYAN+"This is the Scientific Calculator."+ TEXT_RESET);
        try {
            System.out.println("1. Power");
            System.out.println("2. Square");
            System.out.println("3. Cube");
            System.out.println("4. Square root");
            System.out.println("5. Round");
            System.out.println("6. Ceiling");
            System.out.println("7. Floor");
            System.out.println("8. Minimum Value");
            System.out.println("9. Maximum Value");
            System.out.println("10. Exit Calculator");
            System.out.println(TEXT_CYAN+"Choose your operation: "+ TEXT_RESET);
            int choose = sc.nextInt();
            int ans;
                switch (choose) {
                    case 1 -> {
                        ans = power();
                        System.out.println(TEXT_YELLOW + a + " raised to the Power of " + b + " is = " + ans + TEXT_RESET);
                        System.out.println();
                        System.out.println("Continue if You wish to do another Calculation or" + TEXT_CYAN + " Press 10 " + TEXT_RESET + "to Exit Calculator");
                        scientific();
                    }

                    case 2 -> {
                        ans = square();
                        System.out.println(TEXT_YELLOW + "The Square of " + a + " is = " + ans + TEXT_RESET);
                        System.out.println();
                        System.out.println("Continue if You wish to do another Calculation or" + TEXT_CYAN + " Press 10 " + TEXT_RESET + "to Exit Calculator");
                        scientific();
                    }
                    case 3 -> {
                        ans = cube();
                        System.out.println(TEXT_YELLOW + "The Cube of " + a + " is = " + ans + TEXT_RESET);
                        System.out.println();
                        System.out.println("Continue if You wish to do another Calculation or" + TEXT_CYAN + " Press 10 " + TEXT_RESET + "to Exit Calculator");
                        scientific();
                    }
                    case 4 -> {
                        ans = square_root();
                        System.out.println(TEXT_YELLOW + "The Square-root of " + a + " is = " + ans + TEXT_RESET);
                        System.out.println();
                        System.out.println("Continue if You wish to do another Calculation or" + TEXT_CYAN + " Press 10 " + TEXT_RESET + "to Exit Calculator");
                        scientific();
                    }
                    case 5 -> round();
                    case 6 -> ceiling();
                    case 7 -> floor();
                    case 8 -> {
                        ans = minimum();
                        System.out.println(TEXT_YELLOW + "The minimum value between " + a + " and " + b + " is = " + ans + TEXT_RESET);
                        System.out.println();
                        System.out.println("Continue if You wish to do another Calculation or" + TEXT_CYAN + " Press 10 " + TEXT_RESET + "to Exit Calculator");
                        scientific();
                    }
                    case 9 -> {
                        ans = maximum();
                        System.out.println(TEXT_YELLOW + "The maximum value between " + a + " and " + b + " is = " + ans + TEXT_RESET);
                        System.out.println();
                        System.out.println("Continue if You wish to do another Calculation or" + TEXT_CYAN + " Press 10 " + TEXT_RESET + "to Exit Calculator");
                        scientific();
                    }
                    case 10 -> {
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
                        scientific();
                    }
                }

            }catch(Exception e){
                System.out.println(TEXT_RED + "BAD EXPRESSION, TRY AGAIN!!" + TEXT_RESET);
                System.out.println(TEXT_RED + "_____________________________" + TEXT_RESET);
                System.out.println();
            }

    }
}
