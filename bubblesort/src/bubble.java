public class bubble {
    public static void sort(int arr[]){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[i]<arr[j+1]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
