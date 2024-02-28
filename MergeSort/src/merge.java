import java.util.Arrays;

public class merge {
    public static int[] sort(int[] arr){
        if(arr.length==1){
            return arr;

        }
        int mid= arr.length/2;
        int[] left=sort(Arrays.copyOfRange(arr,0,mid));
        int[] right=sort(Arrays.copyOfRange(arr,mid,arr.length));
        return mergesort(left,right);
    }
  public static int[] mergesort(int[] first,int[] second){
        int[] joined =new int[first.length+ second.length];
        int i=0,k=0,j=0;

        while ((i< first.length && j< second.length)){
            if(first[i]<second[j]){
                joined[k++]=first[i++];
            }
            else
                joined[k++]=second[j++];
        }
        while(i< first.length){
            joined[k++]=first[i++];
        }
        while (j< second.length){
            joined[k++]=second[j++];
        }
        return joined;


    }
    public static void sortinplace(int[] arr,int start,int end){
        if(end-start==1){
            return;

        }
        int mid= start+end/2;
        sortinplace(arr,start,mid);
        sortinplace(arr,mid,end);
         mergesortinplace(arr,start,mid,end);
    }
    public static void mergesortinplace(int[] arr,int start,int mid,int end){
        int[] joined =new int[start+end];
        int i=start,k=0,j=mid;

        while ((i< mid && j< end)){
            if(arr[i]<arr[j]){
                joined[k++]=arr[i++];
            }
            else
                joined[k++]=arr[j++];
        }
        while(i< start){
            joined[k++]=arr[i++];
        }
        while (j< end){
            joined[k++]=arr[j++];
        }
        for ( k = 0; k < joined.length; i++) {
            arr[start+k] =joined[k]    ;

        }


    }
}
