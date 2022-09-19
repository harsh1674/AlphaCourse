import java.util.*;
public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();

        int prod = product(a, b);
        System.out.println("Product is " + prod);
    }

    public static int product(int x, int y){
        int multi = x * y;
        return multi;
    }
}
