public class k0902 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int i2 = 9;
        for( int i = 0; i<arr.length; i++){
            arr[i]=i2;
            i2=i2-1;
        }
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}