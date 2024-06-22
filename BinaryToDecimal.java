public class BinaryToDecimal {
    public static void main(String[] args) {
        long binary = 1010;
        int decimal = convertBinaryToDecimal(binary);
        System.out.println("Binary to Decimal: " + decimal);
    }
    
    public static int convertBinaryToDecimal(long binary) {
        int decimalNumber = 0, i = 0;
        long remainder;
        while (binary != 0) {
            remainder = binary % 10;
            binary /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }
}
