public class linear {
    public  static  int find(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return  i;
        }



        return -1 ;

    }
    public  static  boolean contail(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return  (arr[i]==target)
                ;
        }



        return false;

    }
    public  static  int find(String str,char target){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target)
                return  i;
        }
        return -1;
    }
    public  static  int[] find(int arr[][],int target){
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target)
                    return new int[] {i,j} ;
            }
        }


        return new int[]{-1,-1} ;

    }
}
