package james_cutajar.chapt1;

public class OctalToDecimal {

    public static void main(String[] args) {
        String octal = "523";
        System.out.println("The answer is " + convertToDecimal(octal));
    }

    public static int convertToDecimal(String octal) {
        int decimal = 0;

        for(int i = 1; i <= octal.length(); i++) {
            int val = 0;
             switch (octal.charAt(octal.length() - i)) {
                 case '0': {
                     val = 0;
                     break;
                 }
                 case '1': {
                     val = 1;
                     break;
                 }
                 case '2': {
                     val = 2;
                     break;
                 }
                 case '3': {
                     val = 3;
                     break;
                 }
                 case '4': {
                     val = 4;
                     break;
                 }
                 case '5': {
                     val = 5;
                     break;
                 }
                 case '6': {
                     val = 6;
                     break;
                 }
                 case '7': {
                     val = 7;
                     break;
                 }


             }
            decimal += (int) (val * Math.pow(8, (i - 1)));

        }

        return decimal;
    }
}
