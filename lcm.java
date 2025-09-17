import java.util.*;
class Main
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=x;
        int b=y;
        while(b!=0){
            int c=b;
            b=a%b;
            a=c;
        }
        System.out.print((x*y)/a);
    }
}
