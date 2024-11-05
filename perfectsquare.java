import java.util.Scanner;
public class perfectsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        double b=Math.sqrt(a);
        if(a==(b*b)){
            System.out.println("perfect Square");
    }
    else{
        System.out.println("not perfect Square");
    }
}
}
