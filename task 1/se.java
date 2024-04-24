public class se{
    public static int second(int arr[],int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i]>arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }}
        }
        return arr[n-2];
    }
    public static void main(String []argus){
        int arr[]={4,3,6,60,23};
        int n=arr.length;
        System.out.println("second largest element "+second(arr,5));
    }

}