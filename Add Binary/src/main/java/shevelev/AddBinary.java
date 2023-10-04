package shevelev;


public class AddBinary {
    public static String addBinary(String a, String b) {
        int intA = a.length() - 1;
        int intB = b.length() - 1;
        char flagCar = '0';
        String res = "";
        String bigerStr = intA > intB ? a : b;

        while (intA >= 0 && intB >= 0) {
            if (a.charAt(intA) == b.charAt(intB)) {
                res = String.format("%c" + res, flagCar);
                flagCar = a.charAt(intA);
            } else {
                if (flagCar == '1') {
                    res = String.format("0" + res);
                } else {
                    res = String.format("1" + res);
                    flagCar = '0';
                }
            }
            intA--;
            intB--;
        }
        intA = Math.max(intA, intB);
        while (intA >= 0) {
            if (bigerStr.charAt(intA) == '1' && flagCar == '1') {
                res = String.format("0" + res);

            } else if (flagCar == '1') {
                res = String.format("1" + res);
                flagCar = '0';
            }
            else {
                res = String.format("%c" + res, bigerStr.charAt(intA));
                flagCar = '0';
            }
            intA--;
        }
        if (flagCar == '1') {
            res = String.format("1" + res);
        }
        return res;
    }
}
