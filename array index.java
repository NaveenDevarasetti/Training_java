import java.util.Scanner;

public class array {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] num=new int[size];
        int index=0,count=0;
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if(num[i]==x){
                index=i;
                count++;
                break;
            }
        }
        if(count>0) System.out.println(index);
        else System.out.println("element not found");
    }
} 
