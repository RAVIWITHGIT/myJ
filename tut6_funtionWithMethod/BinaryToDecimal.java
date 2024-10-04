/**************************** binary to decimal
 decimal     binary
 (0) -------> (0)
 (1) -------> (01)
 (2) -------> (10)
 (3) -------> (11)
 (4) -------> (100)
 (5) -------> (101)
 (6) -------> (110)
 (7) -------> (111)
 (8) -------> (1000)
 */



public class BinaryToDecimal{
    public static void decimalToBinary(int binary){
        int initialBinary = binary;
        int decimal = 0;
        int pow = 0;
        while(binary>0){
            int lastDegit = binary%10;
            decimal+=lastDegit*(int)Math.pow(2,pow);
            pow++;
            binary/=10;
        }
        System.out.println("decimal number of "+initialBinary+" is "+decimal);
    }


    public static void binaryToDecimal(int decimal){
        int binary = 0;
        int pow = 0;
        while(decimal>0){
            int remainder  = decimal%2;

            // *** first formula for find binary
            // binary = binary*10+remainder;

            // *** second formula for find binary
            binary = binary+remainder*(int)Math.pow(10,pow);
            pow++;
            decimal = decimal/2;
        }
        System.out.println(binary);
    }
    public static void main(String args[]){
        decimalToBinary(101);
        binaryToDecimal(15);
    }
}

