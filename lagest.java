
import java.util.Scanner;

public class lagest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int size=sc.nextInt();
        int[] arr = new int[size];
        int i;
        for( i=0;i<arr.length;i++){
            System.out.println("enter the array:");
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    System.out.println("largest element is "+max);
    }
}
