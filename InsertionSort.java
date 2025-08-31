public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,6,8,3,1,6};

        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>temp){

                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = temp;

        }
        for (int num : arr) {
            System.out.print(num + " ");            
        }
    }
    
}
