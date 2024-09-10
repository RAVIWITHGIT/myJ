/* *********************************************** Type Conversion *********************************
type conversion mean we can convert int value to float value

==> validation of type conversion
1.type compatible --> mean we can convert int to float because both are number ,but we can not do this like int to string

2. destination type > source type --> we can convert large size data type to low size data type , mean we can convert int to float but can not convert float to int

table which provide information about this
byte->short->int->float->long->double
 */

import java.util.*;

public class typeConversion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //**********we can not store float value in int
        // int number = sc.nextFloat();
        // System.out.println(number);

        //**********we can  store int value in float
        float myNumber = sc.nextInt();
        System.out.println(myNumber);

    }

}