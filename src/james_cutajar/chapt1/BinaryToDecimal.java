package james_cutajar.chapt1;


public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1001101";
        System.out.println("The answer is " + convertBinaryToDecimal(binary));


    }

    /**
     * Takes in a binary number as string and returns its corresponding decimal value
     * @param binary is the binary value you pass
     * @return a decimal corresponding value of the binary string
     */
    public static int convertBinaryToDecimal(String binary) {
        int decimal = 0;

        for(int i= binary.length() - 1; i >= 0; i--) {
            decimal += (int) binary.charAt(i) == '1' ? (int) Math.pow(2, binary.length() - (i + 1))  : 0;
        }
        return  decimal;
    }
}