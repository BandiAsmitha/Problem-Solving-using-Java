import java.util.*;
class PrimeNumber
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int c=0;
        for(int i=1;i<=(int)Math.sqrt(x);i++){
            if(x%i==0){
                c+=1;
                if(i!=x/i){
                    c+=1;
                }
            }
        }
        if(c==2){
           System.out.print("Prime"); 
        }
        else{
            System.out.print("Not Prime");
        }
    }
}
