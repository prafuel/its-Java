
public class StringPalindrome {

    public static boolean isPalindrome(String str) {
        // System.out.println(str);
        StringBuilder str1 = new StringBuilder();

        for (int l = str.length() - 1; l >= 0; l--) {
            str1.append(str.charAt(l));
        }

        // System.out.println(str1);
        if (str1.toString().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean isPalindromeBetter(String str) {
        int l = 0;
        int r = str.length() - 1;

        boolean flag = true;

        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                flag = false;
                break;
            }
            l++;
            r--;

        }

        return flag;
    }

    public static boolean better(int x) {
        String s = Integer.toString(x);

        int left = 0;
        int right = s.length() - 1;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }
        return true;
    }

    public static boolean optimal(int x) {
        if (x < 0) {
            return false;
        } else {
            int sum = 0;
            int rem;
            int num = x;
            while (num != 0) {
                rem = num % 10;
                sum = (sum * 10) + rem;
                num = num / 10;
            }

            if (sum == x) {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "assa";
        // System.out.println(isPalindrome(str));
        // System.out.println(isPalindromeBetter(str));
        // System.out.println(better(-121));
        System.out.println(optimal(1213));
    }
}
