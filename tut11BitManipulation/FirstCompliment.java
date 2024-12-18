package tut11BitManipulation;

/* *********************************************** One's compliment *******************************
1.if you find ones compliment of any number then use this symbol ~
2.this symbol convert 0 to 1 and 1 to 0
3. if one's compliment have 1 in left side then result in negative 

here we find One's compliment of 5 
-:first 5 --> 00000101 then ~ convert --> 11111010; but in left side of one's compliment of 5 (11111010) is 1
-:so 11111010 convert to 00000101 and then add 1 = 00000110 
-: 00000110 is 6 , but get -6

*/

public class FirstCompliment {
    public static void main(String args[]) {
        System.out.println(~5);
    }
}
