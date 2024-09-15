/************************** Type promotion **************************
1. java automatically promotes each byte, short or char operand to int when evaluating an expression 
2. if one operand is long , float, double the whole expression is promoted to long, float or double respectively 
*/

/*******  1. java automatically promotes each byte, short or char operand to int when evaluating an expression 
when we perform mathematical operations , java converts byte , short ,and char to int
*/

// public class tut8{
//     public static void main(String args[]){

        //**value of a and b in int is 97 and 98 . you can check using (int)(b) and (int)(a)
        // char a = 'a';
        // char b = 'b';
        // System.out.println(b-a);    
        // System.out.println((int)(b));    
        // System.out.println((int)(a));

        //** */ here b and a convert in int when perform mathematical operation and store in char which is not possible
        // char a = 'a';
        // char b = 'b';
        // char c = char  b-a;
        // System.out.println(c);  
//     }
// }


/*2. if one operand is long , float, double the whole expression is promoted to long, float or double respectively 
if the data type is long then all data types will be converted to long. same will happen with float or double

 */

public class tut8{
    public static void main(String args[]){
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double result = a+b+c+d;
        System.out.println(result);

        // *** whole data convert to double and we can not store double data in int , so give error
        // int result2 = a+b+c+d;
        // System.out.println(result2);


        // byte b1 = 5;
        // byte a1 = b1*2;
        // System.out.println(a1);

        // byte b2 = 5;
        // byte a2 = (byte)(b2*2);
        // System.out.println(a2);
    }
}


