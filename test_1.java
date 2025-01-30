// Test Date 30/01/2025 (Amrit Sir)
// Input two nos from user, first static and second non static and print all
// the, print the sum of all the digits of the sum of all the prime values
// between these two numbers, until the final output comes into single digit.
// Input : 2 10
// int x=2, static int y=10
// Output : 6
// Explanation:
// 35 7 = 15 = 6

// import java.util.Scanner;

// class PrimeDigitSum {
//     int x;
//     static int y;

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         PrimeDigitSum obj = new PrimeDigitSum();

//         System.out.print("(x): ");
//         obj.x = scanner.nextInt();
//         System.out.print("(y): ");
//         y = scanner.nextInt();

//         int sum = 0;

//         for (int i = obj.x; i <= y; i++) {
//             if (isPrime(i)) {
//                 sum += i;
//             }
//         }

//         while (sum >= 10) {
//             sum = digitSum(sum);
//         }

//         System.out.println("Final sum: " + sum);
//         scanner.close();
//     }

//     static boolean isPrime(int n) {
//         if (n <= 1)
//             return false;
//         for (int i = 2; i * i <= n; i++) {
//             if (n % i == 0)
//                 return false;
//         }
//         return true;
//     }

//     static int digitSum(int n) {
//         int s = 0;
//         while (n > 0) {
//             s += n % 10;
//             n /= 10;
//         }
//         return s;
//     }
// }

// <==============================================================================================>

// Input three nos from user, one static, other non static and third final value
// print the sum of two numbers comes from :
// First: all the prime values between first and second
// Second: all the non prime values between second and third.
// Input :
// 2 10 20
// int x=2 static int y=10
// final int z=20
// Output :
// 8
// Explanation:
// 2-10 = 3 5 7 (3)
// 10-20 = 12 14 15 16 18 (5)
// Output : 8

import java.util.Scanner;

class PrimeNonPrimeSum {
    static int y;
    int x;
    final int z;

    PrimeNonPrimeSum(int z) {
        this.z = z;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (x): ");
        PrimeNonPrimeSum obj = new PrimeNonPrimeSum(scanner.nextInt());

        System.out.print("Enter the second number (y): ");
        y = scanner.nextInt();

        System.out.print("Enter the final number (z): ");
        obj.x = scanner.nextInt();

        int sum = 0;

        for (int i = obj.x; i <= y; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        for (int i = y + 1; i <= obj.z; i++) {
            if (!isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("The sum is: " + sum);
        scanner.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
