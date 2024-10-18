import java.util.Scanner;  // this is the package and we can access all the classes present in that package
public class Input {

    public static int printSum(int n){
        int sum = 0;
        for(int i = 1; i<=n; i+=2){
            sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(n);
        sc.close();
    }
    
}