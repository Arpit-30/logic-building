
import java.util.Scanner;

public class average{
    public static void main(String[] args) {
        int i,sum=0;
        double ave=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(i=0;i<arr.length;i++){
            System.out.println("enter the number");
            arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        ave=(double)sum/arr.length;
        System.out.println("the sum is "+sum);
        System.out.println("the average is "+ave);
    }
}