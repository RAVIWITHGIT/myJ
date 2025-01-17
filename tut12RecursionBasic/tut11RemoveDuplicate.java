
/* ******************************************* Remove Duplicate in a String ****************************
1. here String present in small alphabet letter
2. base case 0 to n
3. 
 
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
