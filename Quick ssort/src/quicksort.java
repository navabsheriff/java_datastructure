public class quicksort {
    public static  void quick(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int start =low;
        int end=high;
        int mid=(start+end)/2;
        int pivot=arr[mid];
        while(start<=end){
            while(pivot>arr[start]){
                start++;
            }
            while (pivot <arr[end]) {
                end--;

            }
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        quick(arr, low, end);
        quick(arr,start,high);


    }

}
