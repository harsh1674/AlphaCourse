public class Lin_search {

    public static int search(String menu[], String key ) {
        for(int i=0; i<menu.length; i++) {
            if(menu[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        String menu[] = {"Dosa", "Noodles", "Samosa", "Frooti", "Manchurian"};
        String key = "Samsa";
        int index = search(menu, key);
        if(index == -1) {
            System.out.println("Not Found");
        }else {
            System.out.println("key is at index: " + index);
        }
    }
}