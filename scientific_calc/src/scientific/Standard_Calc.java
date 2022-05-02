package scientific;//project package

import java.util.Scanner;//import scanners
//public class defined
public class Standard_Calc {
    //color codes
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_RESET = "\u001B[0m";

    //variables a , b  defined
    int a , b;
    Scanner sc = new Scanner(System.in);//sets up scanners
    //addition function created
    int addition() {
        //prints instruction to user
        System.out.println("Enter Two Numbers to Add :");
        //take in user input into variables a and b
        a = sc.nextInt();
        System.out.println("+");
        b = sc.nextInt();
        return (a + b);//returns result of a + b
    }
    //subtraction function created
    int subtraction() {
        //prints instruction to user
        System.out.println("Enter Two Numbers to Subtract :");
        //take in user input into variables a and b
        a = sc.nextInt();
        System.out.println("-");
        b = sc.nextInt();
        return (a - b);//returns result of a - b
    }

    int division() {
        //prints instruction to user
        System.out.println("Enter Two Numbers to Divide :");
        //take in user input into variables a and b
        a = sc.nextInt();
        System.out.println("/");
        b = sc.nextInt();
        return (a / b);//returns result of a / b
    }
    //multiplication function created
    int multiplication() {
        //prints instruction to user
        System.out.println("Enter Two Numbers to Multiply :");
        //take in user input into variables a and b
        a = sc.nextInt();
        System.out.println("*");
        b = sc.nextInt();
        return (a * b);//returns result of a * b
    }

    public void standard() {
        System.out.println();//Skip one line on console
        System.out.println(TEXT_CYAN+"This is the Standard Calculator."+ TEXT_RESET);
         try {//throws SomeException
                System.out.println("1. Addition");//Print Addition
                System.out.println("2. Subtraction");//Print Subtraction
                System.out.println("3. Division");//Print Division
                System.out.println("4. Multiply");//Print Multiply
                System.out.println("5. Exit Calculator");//Print Exit Calculator
                System.out.println(TEXT_CYAN+"Choose your operation: "+ TEXT_RESET);
                int choice = sc.nextInt();//local variable choice created

                int ans;
                //switch statement Starts
                switch (choice) {
                    case 1 -> {
                        ans = addition();
                        System.out.println(TEXT_YELLOW +a + " + " + b + " is = " + ans +TEXT_RESET);
                        System.out.println();
                        System.out.println("Continue if You Wish to do another Calculation or" + TEXT_CYAN +" Press 5" + TEXT_RESET +" to Exit Calculator");
                        standard();
                    }
                    case 2 -> {
                        ans = subtraction();
                        System.out.println(TEXT_YELLOW +a + " - " + b + " is = " + ans +TEXT_RESET);
                        System.out.println();
                        System.out.println("Continue if You wish to do another Calculation or"  + TEXT_CYAN +" Press 5" + TEXT_RESET +" to Exit Calculator");
                        standard();
                    }
                    case 3 -> {
                        ans = division();
                        System.out.println(TEXT_YELLOW +a + " / " + b + " is = " + ans +TEXT_RESET);
                        System.out.println();
                        System.out.println("Continue if You wish to do another Calculation or" + TEXT_CYAN +" Press 5" + TEXT_RESET +" to Exit Calculator");
                        standard();
                    }
                    case 4 -> {
                        ans = multiplication();
                        System.out.println(TEXT_YELLOW +a + " * " + b + " is = " + ans +TEXT_RESET);
                        System.out.println();
                        System.out.println("Continue if You wish to do another Calculation or" + TEXT_CYAN +" Press 5" + TEXT_RESET +" to Exit Calculator");
                        standard();
                    }
                    case 5 -> {
                        System.out.println(TEXT_YELLOW+ "Now Exiting Calculator..."+TEXT_RESET );
                        System.out.println(TEXT_YELLOW+"Please wait...."+TEXT_RESET);
                        System.out.println();
                        System.out.println(TEXT_CYAN + "...Exit Successful!!"+TEXT_RESET );
                        System.exit(0);
                    }
                    default -> {
                        System.out.println(TEXT_RED + "SORRY INPUT OUT OF RANGE, PLEASE TRY AGAIN!!!" + TEXT_RESET);
                        System.out.println(TEXT_RED + "______________________________________________"+ TEXT_RESET);
                        System.out.println();
                        standard();
                    }
                }//switch statement Ends

            } catch (Exception e) {//exception handling
                System.out.println(TEXT_RED + "WRONG INPUT, PLEASE TRY AGAIN!!" + TEXT_RESET); //prints on user exception with color RED
                System.out.println(TEXT_RED + "___________________________________________"+ TEXT_RESET);
                System.out.println();//skip one line on console
            }
        }
    }

