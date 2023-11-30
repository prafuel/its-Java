public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int num = 0;
        for (int i = 0; i < digits.length; i++) {
            num = (num * 10) + digits[i];
            System.out.println(num);
        }
        num++;
        System.out.println(num);

        int temp = num;
        int n = 0;
        while (temp != 0) {
            n++;
            temp = temp / 10;
        }

        int[] ans = new int[n];
        for (int i = n - 1; i > -1; i--) {
            int rem = num % 10;
            ans[i] = rem;
            num = num / 10;
        }

        return ans;
    }

    public static int[] better(int[] arr) {
        int n = arr.length;
        int carry = 1;

        for (int i = n - 1; i > -1; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] ans = new int[n + 1];
            ans[0] = carry;
            System.arraycopy(arr, 0, ans, 1, n);
            return ans;
        } else {
            return arr;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

        // int[] ans = plusOne(arr);
        int[] ans = better(arr);

        for (int i : ans) {
            System.out.print("| " + i + "| ");
        }
    }
}
