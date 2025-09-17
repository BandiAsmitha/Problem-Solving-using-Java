import java.util.*;
class Main
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int n=sc.nextInt();
        int i=3,s;
        System.out.printf("%d\t%d\t", x, y);
        while(i<=n){
            s=x+y;
            x=y;
            y=s;
            System.out.printf("%d\t",s);
            i+=1;
        }
    }
}
