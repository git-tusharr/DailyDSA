
import java.util.Scanner;
class LinearSearch{

    public static int Ls(int arr[],int index,int key){

        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == key) {
            return index;
        }

        return Ls(arr, index+1, key);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of the array :");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("ENter elemnts of the array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to be searched :");
        int tar=sc.nextInt();

        int result=Ls(arr,0,tar);

        if (result == -1) {

            System.out.println("Element not found");
            
        }
        else{
            System.out.println("element found at index: "+ result);
        }

        sc.close();
        
    }
}