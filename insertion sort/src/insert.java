public class insert {
    public  static void sort(int arr[]){
        for(int i=1;i< arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
                else{
                    break;
                }
            }
        }
    }
}
