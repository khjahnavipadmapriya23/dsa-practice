import java.util.Scanner;
public class InvertedTriangle{
    public void ptn(int n){
        if(n<=0){
	        System.out.println("Enter a positive number");
	    return;
        }
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
        System.out.print("*");
        }
	    System.out.println();
        }
    }
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
        int n=sc.nextInt();
        InvertedTriangle obj = new InvertedTriangle();
        obj.ptn(n);
        sc.close();
    }
}