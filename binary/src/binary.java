public class binary {
    public static  int bin(int[] arr,int target){
        int start=0,end=arr.length-1;
        boolean asc=false;
        if(arr[start]<arr[end]){
            asc=true;
        }
        while(start<=end){
            int mid=(start+end)/2;
            if(asc) {
                if (target > arr[mid]) {
                    start = mid + 1;

                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else
                    return mid;
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;

                } else if (target < arr[mid]) {
                    start= mid +1;
                } else
                    return mid;
            }
        }
        return  -1;
    }
}
