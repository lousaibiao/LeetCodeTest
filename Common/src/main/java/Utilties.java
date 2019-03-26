public class Utilties {
    public static void printDigits(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + ",");
        }
        System.out.println();
    }

    public static boolean arrayEquals(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) return true;
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) return false;
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

}
