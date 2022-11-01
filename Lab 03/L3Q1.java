import java.util.Scanner;

public class L3Q1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 0;
        char operator = '+';

        System.out.print("Enter two integer numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.print("Enter the operand: ");
        operator = sc.next().charAt(0);

        System.out.printf("%d %c %d = %d\n", n1, operator, n2, calculate(n1, n2, operator));

        sc.close();
    }

    static int calculate(int n1, int n2, char operator) {

        switch (operator) {
            case '+': return n1 + n2; 
            case '-': return n1 - n2; 
            case '*': return n1 * n2;
            case '/': return n1 / n2;
            case '%': return n1 % n2;
            default: return 0;
        }
    }
}
