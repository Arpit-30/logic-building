
import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age");
        int age =sc.nextInt();
        if(age>=18){
            System.out.println("elegible"+age);
        }
        else{
            System.out.println("not elegible"+age);
        }
        sc.close();
    }
}
