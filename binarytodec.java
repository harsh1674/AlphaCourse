public class binarytodec {
    

    public static void binToDec(int binNum) {
        int decNum = 0;
        int pow = 0;

        while(binNum > 0){
            int lastDig = binNum % 10;
            decNum = decNum + (lastDig  * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println(decNum);
    }
    public static void main(String[] args) {
        binToDec(100000101);
    }
}
