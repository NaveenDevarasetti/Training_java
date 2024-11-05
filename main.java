public class main{
    public static void main(String[] args) {
       int n=1234,rev=0,digit;
       While(n!=0){
        digit=n%10;
        rev=rev*10+digit;
        n=n/10;
    
       }
        system.out.println(rev);
    }
}