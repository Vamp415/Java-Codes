public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 10;
        long binary = convertDecimalToBinary(decimal);
        System.out.println("Decimal to Binary: " + binary);
    }
    
    public static long convertDecimalToBinary(int decimal) {
        long binaryNumber = 0;
        int remainder, i = 1;
        while (decimal != 0) {
            remainder = decimal % 2;
            decimal /= 2;
            binaryNumber += remainder * i;
            i *= 10;
        }
        return binaryNumber;
    }
}
