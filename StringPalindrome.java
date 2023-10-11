


public class StringPalindrome {

    public static boolean isPalindrome(String str) {
        // System.out.println(str);
        StringBuilder str1 = new StringBuilder();

        for(int l = str.length()-1; l >= 0; l--) {
            str1.append(str.charAt(l));
        }

        // System.out.println(str1);
        if(str1.toString().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean isPalindromeBetter(String str) {
        int l = 0;
        int r = str.length()-1;

        boolean flag = true;

        while(l < r) {
            if(str.charAt(l) != str.charAt(r)) {
                flag = false;
                break;
            }
            l++;
            r--;

        }

        return flag;
    }

    public static void main(String[] args) {
        String str = "assa";
        // System.out.println(isPalindrome(str));
        System.out.println(isPalindromeBetter(str));
    }
}
