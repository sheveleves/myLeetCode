package shevelev;


public class PlusOne

{
    public static int[] plusOne(int[] digits) {
        int i = digits.length;
        if (i == 1) {
            if (digits[0] == 9) {
                return new int[] {1,0};
            }
            else {
                digits[0]++;
                return digits;
            }
        }
        int num = digits[i - 1];
        if (num == 9) {
            int[] newArr = new int[i-1];
            System.arraycopy(digits, 0, newArr, 0, i - 1);
            int[] chArr = plusOne(newArr);
            int[] resArr = new int[chArr.length + 1];
            System.arraycopy(chArr, 0, resArr, 0, chArr.length);
            resArr[resArr.length - 1] = 0;
            return resArr;
        }
        digits[i - 1] = digits[i - 1] + 1;
        return digits;
    }
}
