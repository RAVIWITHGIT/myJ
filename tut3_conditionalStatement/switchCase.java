import java.util.*;

public class switchCase
{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.print("enter first number :");
	    int a= sc.nextInt();
	    System.out.print("enter second number :");
	    int b=sc.nextInt();
	    System.out.print("enter operator :");
	    char symbol = sc.next().charAt(0);
	    switch(symbol){
	        case '+':System.out.println(a+b);
	                  break;
	        case '-':System.out.println(a-b);
	                  break;
	        case '*':System.out.println(a*b);
	                  break;
	        case '/':System.out.println(a/b);
	                  break;
	       default:System.out.println("wrong operator");           
	        
	    }
		
	}
}