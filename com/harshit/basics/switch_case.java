package com.harshit.basics;

import java.util.Scanner;

public class switch_case {
    public static void main() {

          Scanner input = new Scanner(System.in);
//        System.out.println("Enter a sweet fruit");
//          String fruit = input.nextLine();
//
//          switch (fruit)
//          {
//              case "mango":
//                  System.out.println("King of fruits");
//                  break;
//              case "apple":
//                  System.out.println("keep the doctors away");
//                  break;
//              case "orange":
//                  System.out.println("Please enter a fruit name and not a colour");
//                  break;
//              case "papaya":
//                  System.out.println("Oo Great..a healthy choice");
//                  break;
//              default:
//                  System.out.println("Please Enter a integer or a complex irrational Number");
//          }


                                   // OR


//        switch (fruit)
//        {
//            case "mango" -> System.out.println("King of fruits");
//            case "apple" -> System.out.println("keep the doctors away");
//            case "orange" -> System.out.println("Please enter a fruit name and not a colour");
//            case "papaya" -> System.out.println("Oo Great..a healthy choice");
//            default -> System.out.println("Please Enter a integer or a complex irrational Number");
//        }



// Nested Switch :
        System.out.println("Enter the day");
          int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println("Enter the plan");
                String plan = input.next();
                switch (plan) {
                    case "party":
                        System.out.println("oho le bhaiya omfoo");
                        break;
                    case "home":
                        System.out.println("Not a bad idea");
                        break;
                    case "college":
                        System.out.println("2 Cr package boy");
                        break;
                    default:
                        System.out.println("Make some good plans baby");
                        break;
                }
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number , choose a correct number");
                break;
        }













    }
}
