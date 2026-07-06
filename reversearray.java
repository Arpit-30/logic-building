
import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(i=0;i<arr.length;i++){
            System.out.println("enter the number");
            arr[i]=sc.nextInt();
        }
        for(i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
