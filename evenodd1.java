import java.util.Scanner;

public class evenodd1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size: ");
        int size=sc.nextInt();
        int[] num=new int[size];
        
        System.out.println("enter array elements: ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(num[i]%2!=0){
                System.out.print(num[i]+" ");
            }
        }
    }
}