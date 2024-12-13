public class MyString {
    public static void shortestPath(String ar) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < ar.length(); i++) {
            char getchr = ar.charAt(i);
            if (getchr == 'W') {
                x--;
            } else if (getchr == 'E') {
                x++;
            } else if (getchr == 'N') {
                y++;
            } else {
                y--;
            }

        }

        double result = Math.sqrt((x * x) + (y * y));
        System.out.println(result);
    }

    public static void getSubstring(String str, int s, int e) {
        String subStr = "";
        for (int i = s; i < e; i++) {
            Character ch = str.charAt(i);
            subStr += ch;
        }
        System.out.println(subStr);
    }

    public static String Convert_Letter_To_UpperCase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // *********** use normal string
    // public static String stringCompression(String str) {
    // String newStr = "";
    // for (int i = 0; i < str.length(); i++) {
    // int count = 1;
    // Character ch = str.charAt(i);
    // while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
    // count++;
    // i++;
    // }
    // newStr += ch;
    // if (count > 1) {
    // newStr += count;
    // }

    // }
    // return newStr;
    // }

    // ******* use stringBuilder
    public static String stringCompression(String str) {
        // String newStr = "";
        StringBuilder newStr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            Character ch = str.charAt(i);
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(ch);
            if (count > 1) {
                // newStr += count;
                newStr.append(count);
            }

        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        /*
         * *** we can create string in two way
         * String mystr="hello";
         * String mystr2= new String("hello");
         */

        /*
         * ***************************** compare string ****************************
         * 
         * String v1="ravi";
         * String v2 ="ravi";
         * String v3= new String("ravi");
         * 
         * // here v1 and v2 indicate to same value
         * if(v1==v2){
         * System.out.println("v1 and v2 are equal");
         * }else{
         * System.out.println("v1 and v2 are not equal");
         * }
         * 
         * //here v3 creat string using new keyword, that's why v3 creat new string with
         * new memory address
         * if(v1==v3){
         * System.out.println("v1 and v3 are equal");
         * }else{
         * System.out.println("v1 and v3 are not equal");
         * }
         * 
         * //solution , you can use .equals() method , this method compare value
         * if(v1.equals(v3)){
         * System.out.println("v1 and v3 are equal");
         * }else{
         * System.out.println("v1 and v3 are not equal");
         * }
         */

        /*
         * ***********************************get sub string **************************
         * we can get sub string using 2 way
         * first is manually
         * second inbuilt substring(startingIndex, lastIndex);
         * 
         */
        // String str="ravi lakshakar";
        // getSubstring(str,1,4);

        /*
         * ***********************************compareTo() ***************************
         * string.compareTo(compareString);
         * 
         * 1.this method compare string lexicographically mean alphabetically
         * 2. this method return 3 type value
         * return 0 for equal
         * return -1 compare string is alphabetically larger
         * return 1 compare string is alphabetically less
         */

        // String fruits[]={"apple","mango","banana"};
        // String largestString=fruits[0];
        // for(int i=1;i<fruits.length;i++){
        // if(largestString.compareTo(fruits[i])<0){
        // largestString =fruits[i];
        // }
        // }
        // System.out.println(largestString);

        // ************************************** string builder
        // ***************************
        // string builder like as normal string , but when add something in string
        // builder this not creat copy change in original string
        // StringBuilder sb=new StringBuilder("ravi");
        // sb.append(" Lakshakar ");
        // System.out.println(sb);

        // for (char ch = 'a'; ch < 'z'; ch++) {
        // System.out.print(ch + " ");
        // }
        // System.out.println();
        // *** find string length --> .length();
        String direction = "WNEENESENNN";
        // ***** shortestPath(direction);

        // ******* convert string to UpperCase
        String str = "hello my name is ravi";
        String getResult = Convert_Letter_To_UpperCase(str);
        // System.out.println(getResult);

        /******************************************************************
         * String Compression ***************
         * 
         * 
         * if string look like --> aaabbccdd then show --> a3b2c2d2
         * if string look like --> abc then show --> abc , not a1b1c1 because here want
         * to compress
         * 
         */
        String compressString = stringCompression("aaabbccdd");
        System.out.println(compressString);

    }
}
