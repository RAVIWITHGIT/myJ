
public class StringPractice {

    // Question1:Count how many times lowercase vowels occurred in a String entered
    // by the user
    public static int countVowels(String str) {
        Character arr[] = { 'a', 'e', 'i', 'o', 'u' };
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == str.charAt(i)) {
                    count++;
                }
            }
        }
        return count;

    }

    // Question 2 :What will be the output of the following code?
    public static void output() {
        String str = "ShradhaDidi";
        String str1 = "ApnaCollege";
        String str2 = "ShradhaDidi";
        System.out.println(str.equals(str1) + " " + str.equals(str2));
    }

    public static void output2() {
        String str = "ApnaCollege".replace("l", "");
        System.out.println(str);
    }

    public static boolean checkAnagrams(String str, String str2) {
        if (str.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            String convertStr = String.valueOf(ch);
            if (!str2.contains(convertStr)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int result = countVowels("ravi lakshakar");
        // System.out.println(result);
        // output();
        // output2();
        boolean getResult = checkAnagrams("race", "care");
        if (getResult) {
            System.out.println("Strings is Anagrams");
        } else {
            System.out.println("String is not Anagrams");
        }
    }
}