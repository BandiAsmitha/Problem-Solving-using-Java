public class Main
{
	public static void main(String[] args) {
	   int n=100;
	    for (int i=1;i<=n;i++){
	        if(prime(i)){
	            System.out.printf("%d\t",i);
	        }
	    }
		
	}
	public static boolean prime(int n){
	    if (n <= 1) {
            return false;
	    }
	    int c=0;
	    for(int i=1;i<=(int)Math.sqrt(n);i++){
	        if(n%i==0){
	            c+=1;
	             if(i!=n/i){
	                c+=1;
	            }
	        }
	        
	    }
	    if(c==2){
	       return true;
	    }
	    else{
	        return false;
	    }
	}
}
