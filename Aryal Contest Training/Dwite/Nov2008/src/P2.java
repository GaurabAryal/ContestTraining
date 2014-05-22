
import java.util.*;

public class P2 {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String sNum;
        int nBiggie = 0;
        for (int i = 0; i < 5; i++) {
            sNum = sin.nextLine();
            for (int j = 0; j < sNum.length(); j++) {
                if (Integer.parseInt(Character.toString(sNum.charAt(j))) > nBiggie) {
                    nBiggie = Integer.parseInt(Character.toString(sNum.charAt(j)));                 
                }
            }
            System.out.println(nBiggie);
            nBiggie = 0;
        }
    }

}
