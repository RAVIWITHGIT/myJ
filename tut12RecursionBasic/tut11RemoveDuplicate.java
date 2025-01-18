
/* ******************************************* Remove Duplicate in a String ****************************
1. here String present in small alphabet letter
2. base case 0 to n
3. work
  a. every index are representing every alphabet in array; 
  b. first we set index value manually which is zero , after that we find index using String character - 'a'
  c. 'b'-'a' -->   98(ASCII Value of b)-97(ASCII Value of a) ==1 , so find boolean value on 1 array index , that value is true or false
  d. if array boolean value is true on  index , mean index which was represented alphabet already present in this array
  e. if array boolean value is not true on index , mean index which was represented alphabet not present in this array 
  f. set true value on index and add character in new string which find from string 

 
 */

public class tut11RemoveDuplicate {
    public static void RemoveDuplicate(String str, int index, StringBuilder newStr, boolean map[]) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        // work
        char currChar = str.charAt(index);
        if (map[currChar - 'a'] == true) {
            RemoveDuplicate(str, index + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            RemoveDuplicate(str, index + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String args[]) {
        String str = "appnnacollege";
        RemoveDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
