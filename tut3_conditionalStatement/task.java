// Question1:Write a Java program to get a number from the user and print whether it is positive or negative

// import java.util.*;

// public class task{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number :");
//         int getNumber = sc.nextInt();
//         if(getNumber<0){
//             System.out.println("this number is negative");
//         }else{
//             System.out.println("this is positive number");
//         }
//     }
// }


// Question2:Finish the following code so that it printsYou have a fever if your temperature is above 100 and otherwise prints You don't have a fever

// public class task{
//     public static void main(String args[]){
//         double temp = 103.5;
//         if(temp>100){
//             System.out.println("you have a fever");
//         }else{
//             System.out.println("don't worry you have not a fever but take care");
//         }

//     }
// }


// Question3:Write a Java program to input week number(1-7) and print day of week name using switch case
// import java.util.*;

// public class task{
//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter week number :");
//         int weekNumber = sc.nextInt();
//         switch(weekNumber){
//             case 1:System.out.println("The Day is sunday");
//                     break;
//             case 2:System.out.println("The Day is monday");
//                     break;
//             case 3:System.out.println("The Day is tuesday");
//                     break;
//             case 4:System.out.println("The Day is wednesday");
//                     break;
//             case 5:System.out.println("The Day is thursday");
//                     break;
//             case 6:System.out.println("The Day is friday");
//                     break;
//             case 7:System.out.println("The Day is saturday");
//                     break;
//             default:System.out.println("enter valid week number");        
//         }
//     }
// }


// Question 4 :What will be the value of x & y in the following program
// public class task{
//     public static void main(String args[]){
//         int a = 63,b=36;
//         boolean x = (a<b)?true:false;
//         int y=(a>b)? a:b;
//         System.out.println(x);
//         System.out.println(y);
//     }
// }


// Question5:Write a Java program that takes a year from the user and print whether that year is a leap year or not.
// import java.util.*;

// public class task{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter year :");
//         int year = sc.nextInt();
//         if(year%4==0){
//             if(year%100!=0){
//                 if(year%400==0){
//                     System.out.println("this is leap year");
//                 }else{
//                     System.out.println("this is not leap year");
//                 }

//             }else{
//                 System.out.println("this is not leap year");
//             }
//         }else{
//             System.out.println("this is not leap year");
//         }
//     }
// }


// ********** second way to find leap year
import java.util.*;

public class task{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter year :");
        int year = sc.nextInt();
        boolean x = (year%4)==0;
        boolean y = (year%100)!=0;
        boolean z = ((year%100==0) && (year%400==0));

        if(x && (y||z)){
            System.out.println("this is leap year");
        }else{
            System.out.println("sorry this is not leap year ");
        }
    }
}
