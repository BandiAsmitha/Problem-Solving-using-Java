import java.util.*;
class Main
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b!=0){
            int c=b;
            b=a%b;
            a=c;
        }
        System.out.print(a);
    }
}
