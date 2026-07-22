import java.util.Scanner;

public class merge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int []arr=new int[size];
        int[]sec=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the elements of array1:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<sec.length;i++){
            System.out.println("enter the elements of array2:");
            sec[i]=sc.nextInt();
        }
        System.out.println("merge array");
        int [] merge=new int[arr.length+sec.length];
        for(int i=0;i<arr.length;i++){
            merge[i]=arr[i];
        }
        for(int i=0;i<sec.length;i++){
            merge[arr.length+i]=sec[i];
        }
        System.out.println("merged array");
        for(int i=0;i<merge.length;i++){
            System.out.println(merge[i]);
        }
    }
}
