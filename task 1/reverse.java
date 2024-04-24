public class reverse {
    public static int[] revear(int arr[]) {
        int n = arr.length;
        int d[] = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = arr[n - 1 -i];
        }
        return d;
    }

    public static void main(String[] argus) {
        int arr[] = {3, 2, 5, 3, 64};
        int reversed[] = revear(arr);
        // Print the reversed array
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}
