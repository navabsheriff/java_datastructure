public class sort {
    public static  void selectsort(int arr[]){
        for(int i=0;i< arr.length;i++){
           // int min=arr[i];
            int minindex=i;
            for(int j=i;j< arr.length;j++){
                if(arr[j]<arr[minindex]){

                    minindex=j;
                }
            }
            //swap
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;

        }
    }
}
