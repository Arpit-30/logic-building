
import java.util.Scanner;

public class slargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        int[]arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the elements for array:");
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int second_largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){ 
                second_largest=largest;
                largest=arr[i];
            }
            else if(arr[i]!=largest && arr[i]>second_largest){
                    second_largest=arr[i];
            }
        }
        System.out.println("largest:"+largest);
        System.out.println("second largest number"+second_largest);
    }
}
