
import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the elements for array");
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]!=largest&&arr[i]>second){
                second=arr[i];
            }
        }
        System.out.println("largest"+largest);
        System.out.println("second largest"+second);
    }
}
