package scientific;

import java.util.*;

public class Exponential_Calc {

    Scanner sc = new Scanner(System.in);

    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_RESET = "\u001B[0m";

    void exponential() {
        System.out.println();
        System.out.println(TEXT_CYAN+"This is the Exponential Calculator."+ TEXT_RESET);
        try {
            System.out.println("1. Palindrome ");
            System.out.println("2. Armstrong Number ");
            System.out.println("3. Prime Number ");
            System.out.println("4. Average of Numbers ");
            System.out.println("5. GCD ");
            System.out.println("6. L.C.M");
            System.out.println("7. Exit Calculator");
            System.out.println(TEXT_CYAN+"Choose your operation: "+ TEXT_RESET);
            int choice = sc.nextInt();

            switch (choice) {
               case 1->{
                    System.out.println("Enter at least 3(three) digits to check Palindrome: ");
                    int num = sc.nextInt();
                    int r,sum=0;
                    int temp = num;
                    while(num > 0)
                    {
                        r = num%10;
                        sum = (sum*10)+r;
                        num = num/10;
                    }
                    if(temp==sum){
                        System.out.println(TEXT_YELLOW+temp+ " is a Palindrome Number."+ TEXT_RESET);
                    }else
                        System.out.println(TEXT_YELLOW+temp+ " is not a palindrome Number."+ TEXT_RESET);
                    System.out.println();
                    System.out.println("Continue if You wish to do another Calculation or" + TEXT_CYAN + " Press 7 " + TEXT_RESET + "to Exit Calculator");
                    exponential();
                    }

               case 2->{
                   int num, number, temp, total = 0;
                   System.out.println("Enter at Least a 3 Digit Number: ");
                   num =sc.nextInt();
                   number = num;
                   for(; number!=0; number /= 10){
                       temp = number % 10;
                       total = total + temp*temp*temp;
                   }
                   if(total== num)
                       System.out.println(TEXT_YELLOW+num+" is an Armstrong Number."+TEXT_RESET);
                   else
                       System.out.println(TEXT_YELLOW+num+" is not an Armstrong Number"+TEXT_RESET);
                    }

               case 3-> {
                    int temp;
                    boolean prime = true;
                    System.out.println("Enter any number You want to Check: ");
                    int num = sc.nextInt();
                    for(int i=2;i<=num/2;i++){
                        temp = num % i;
                        if (temp==0){
                            prime = false;
                            break;
                        }
                    }
                    if (prime)
                        System.out.println(TEXT_YELLOW+num+ " is a Prime Number."+ TEXT_RESET);
                    else
                        System.out.println(TEXT_YELLOW+num+ " is not a Prime Number."+ TEXT_RESET);
                    System.out.println();
                    System.out.println("Continue if You wish to do another Calculation or" + TEXT_CYAN + " Press 7 " + TEXT_RESET + "to Exit Calculator");
                    exponential();
                    }

               case 4->{
                    double num = 0;
                    double x = 1;
                   System.out.println("Input the n(number of n counts) you want to Calculate the Average: ");
                   int n = sc.nextInt();
                   while (x <= n){
                       System.out.println("Enter Number " + "("+ (int) x +")" + ":");
                       num += sc.nextInt();
                       x += 1;
                   }double avgn = (num/n);

                   System.out.println(TEXT_YELLOW+"Total Average is = "+avgn + TEXT_RESET);
                   System.out.println();
                   System.out.println("Continue if You wish to do another Calculation or" + TEXT_CYAN + " Press 7 " + TEXT_RESET + "to Exit Calculator");
                   exponential();
               }


               case 5->{
                    //gets user inputs num1
                    System.out.println("Enter the First Number: ");
                    int num1 = sc.nextInt();
                    //gets user input num2
                    System.out.println("Enter the Second Number: ");
                    int num2 = sc.nextInt();

                    while(num1 != num2){
                        if (num1>num2)
                            num1 -=num2;
                        else
                            num2-=num1;
                    }
                   //displaying result of numbers input(GCD found)
                   System.out.println(TEXT_YELLOW+"GCD of given numbers is: "+ num2 +"." + TEXT_RESET);
                   System.out.println();
                   System.out.println("Continue if You wish to do another Calculation or" + TEXT_CYAN + " Press 7 " + TEXT_RESET + "to Exit Calculator");
                   exponential();
                    }

               case 6->{
                    int a,b,max,step,lcm =0;
                    System.out.println("Enter first Number: ");
                    a = sc.nextInt();
                    System.out.println("Enter second Number: ");
                    b = sc.nextInt();

                    if (a > b) {
                        max = step = a;
                    }else{
                        max = step = b;
                    }

                    while(a!= 0){
                        if(max % a == 0 && max % b == 0){
                            lcm =max;
                            break;
                        }
                        max += step;
                    }
                    System.out.println(TEXT_YELLOW+"The L.C.M of "+a+" and "+b+" is "+lcm+ "." + TEXT_RESET);
                    System.out.println();
                    System.out.println("Continue if You wish to do another Calculation or" + TEXT_CYAN + " Press 7 " + TEXT_RESET + "to Exit Calculator");
                    exponential();
                    }

               case 7-> {
                    System.out.println(TEXT_YELLOW + "Now Exiting Calculator..." + TEXT_RESET);
                    System.out.println(TEXT_YELLOW + "Please wait...." + TEXT_RESET);
                    System.out.println();
                    System.out.println(TEXT_CYAN + "...Exit Successful!!" + TEXT_RESET);
                    System.exit(0);
                    }
               default-> {
                    System.out.println(TEXT_RED + "SORRY INPUT OUT OF RANGE, PLEASE TRY AGAIN!!!" + TEXT_RESET);
                    System.out.println(TEXT_RED + "______________________________________________" + TEXT_RESET);
                    System.out.println();
                    exponential();
                    }
                }




            }catch (Exception e){
            System.out.println(TEXT_RED + "BAD EXPRESSION, TRY AGAIN!!" + TEXT_RESET);
            System.out.println(TEXT_RED + "_____________________________" + TEXT_RESET);
            System.out.println();
        }

        }
    }

