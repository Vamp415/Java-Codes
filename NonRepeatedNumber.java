public class NonRepeatedNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 4, 2};

        for (int i = 0; i < arr.length; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                System.out.println(arr[i]);
            }
        }
    }
}
