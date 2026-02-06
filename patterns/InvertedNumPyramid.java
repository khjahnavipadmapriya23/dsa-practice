import java.util.Scanner;

public class InvertedNumPyramid {
    public void ptn(int n){
        if(n<=0){
            System.out.println("Enter a positive number");
            return;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        InvertedNumPyramid obj = new InvertedNumPyramid();
        obj.ptn(n);
        sc.close();
    }
}
