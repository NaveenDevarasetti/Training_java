import java.util.Scanner;

public class sumevenindex {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size: ");
        int size=sc.nextInt();
        int[] num=new int[size];
        
        System.out.println("enter array elements: ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            if(num[i]%2==0){
                System.out.print(num[i]+" ");
            }
            else sum=sum+num[i];
            }
            System.out.println("\n "+sum);
    }
}