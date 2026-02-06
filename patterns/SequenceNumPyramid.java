import java.util.Scanner;

public class SequenceNumPyramid{
    public void ptn(int n){
        int num=1;
        if(n<=0){
            System.out.println("Enter a positive number");
            return;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        SequenceNumPyramid obj = new SequenceNumPyramid();
        obj.ptn(n);
        sc.close();
    }
}
