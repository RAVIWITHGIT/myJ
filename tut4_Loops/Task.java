import java.util.*;

/*
how many time "hello world" print

public class Task
{
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
		    System.out.println("hello world");
		    i+=2;
		}
	}
}

*/

// public class Task{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int even = 0;
//         int odd = 0;
//         System.out.print("how many value you write :");
//         int rangeNumber = sc.nextInt();
//         while(rangeNumber!=0){
//             System.out.print("enter your number :");
//             int myNumber = sc.nextInt();
//             if(myNumber%2==0){
//                 even+=myNumber;
//             }else {
//                 odd+=myNumber;
//             }
//             rangeNumber--;
//         }
//         System.out.println("the sum of all even number is :"+even);
//         System.out.println("the sum of all odd number is :"+odd);
//     }
// }



// Question 3 :Write a program to find the factorial of any number entered by the user.
// public class Task{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number for find the factorial :");
//         int fNumber =sc.nextInt();
//         if(fNumber==0){
//             System.out.println(0);
//         }else{
//         for(int i=fNumber; i>=1; i--){
//             System.out.print(i+"*");
//         }
//         }
//     }
// }


// Question4:Write a program to print the multiplication table of a number N,entered by the user.
// public class Task{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter your desire table ");
//         int tableNumber = sc.nextInt();
//         for(int i=1; i<=10; i++){
//             System.out.println(tableNumber+"*"+i+"="+tableNumber*i);
//         }
//     }
// }


//Question5: What is wrong in the following program?
public class Task{
    public static void main(String args[]){
        for(int i=0;i<=5;i++){
            System.out.println("i = "+i);
        }
        System.out.println("i after the loop = "+ i );
    }
}



