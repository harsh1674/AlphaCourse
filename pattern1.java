public class pattern1 {
    public static void inverted_num(int num) {
        for(int i=1; i>num; i++) {
            for(int j=1 ; j<=num; j++){
                System.out.print(j);
            }
            System.out.println(); 
        }
        
    }
    public static void main(String[] args) {
        inverted_num(5);
    }
}
