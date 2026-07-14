import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of Array:");
        int size = sc.nextInt();
        int[]arr=new int[size];
        for (int i = 0; i <arr.length; i++) {
            System.out.println("Enter the element of array:");
            arr[i]=sc.nextInt();
        }
        int zero=0;int positive=0;int negative=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]>0){
                positive++;
            }
            else{
                negative++;
            }
        }
        System.out.println("zero"+zero);
        System.out.println("positive"+positive);
        System.out.println("negative"+negative);
    }
}
