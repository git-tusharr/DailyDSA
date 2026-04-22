public class MoveZeros{
    public static void moveZeroes(int[] arr){
        int j=0;//postiion of next non zero
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                //then swap arr[i] and arr[j]

                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                j++;
            }
        }
    }

    public static void main(String args[]){
        int arr[]={0,2,5,8,9};

        moveZeroes(arr);

        for(int num:arr){
            System.out.println(num + " ");
        }
    }
}