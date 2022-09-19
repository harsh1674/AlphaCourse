public class palindrome {

    public static void Palind(int n) {
        int palinNum = 0;
        int num = n;


        while(n > 0){
        int lastDigit = n % 10;
        palinNum = palinNum * 10 + lastDigit;

        n = n / 10;
        }
        if(palinNum == num){
            System.out.println(num + " is a Palindrome Number");
        }
        else{
            System.out.println(num + " is not a Palindrome Number");
        }
    }
    public static void main(String[] args) {
        Palind(1234321);
    }
}
