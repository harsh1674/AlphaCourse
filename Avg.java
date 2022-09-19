import java.util.Scanner;

public class Avg {

    public static float avgthree(float a, float b, float c){
        float avr= (a+b+c)/3;
        return avr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextInt();
        float y = sc.nextInt();
        float z = sc.nextInt();

        System.out.println("Average is "+ avgthree(x, y, z) );

    }
}
