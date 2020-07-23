/**
 * Created by KPS on 7/23/2020.
 */
public class Main {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,10,10};
        boolean tenTrue = false;
        boolean twentyTrue = false;
        for (int i = 0 ; i < arrays.length-1 ; i++){
            if ((arrays[i] & arrays[i+1]) == 10){
                tenTrue = true;
            }
            if ((arrays[i] & arrays[i+1]) == 20){
                twentyTrue = true;
            }

        }
        System.out.println("ten:"+tenTrue);
        System.out.println("twenty " +twentyTrue);
    }
}
