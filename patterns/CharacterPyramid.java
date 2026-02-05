import java.util.Scanner;

public class CharacterPyramid{
    public void ptn(int n){
        char chars = 'A';
        if(n<=0){
            System.out.println("Enter a positive number");
            return;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(chars);
                chars++;
            }
        System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        CharacterPyramid obj = new CharacterPyramid();
        obj.ptn(n);
        sc.close();
    }
}