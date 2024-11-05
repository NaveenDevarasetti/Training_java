
import java.util.Scanner;

public class count {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array size: ");
        int size=sc.nextInt();
        int[] num=new int[size];
        System.out.println("enter array elements: ");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        
