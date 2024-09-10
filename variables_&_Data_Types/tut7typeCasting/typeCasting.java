/* *********************************** Type Casting / narrowing / explicit ***************************
here we discuss how to convert larg size data type in low size data type


 */



import java.util.*;

public class typeCasting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float number = 99.99f;
        int marks = (int) number;
        System.out.println(marks);

        char ch = 'a';
        int myint = ch;
        System.out.println(myint);

    }
}