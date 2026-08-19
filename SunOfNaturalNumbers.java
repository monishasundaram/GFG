import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int sum = 0;
        while(n!=0){
            sum = sum+n;
            n--;
        }
        System.out.print(sum);
        return;
    }
}
