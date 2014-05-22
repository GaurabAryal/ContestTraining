
import java.util.*;

public class S2 {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nQues = sin.nextInt();
        int nCount = 0;
        String sAns = "", sAnsG = "";
        for (int i = 0; i <= nQues * 2; i++) {
            if (i <= nQues) {
                sAns += sin.nextLine();
            } else {
                sAnsG += sin.nextLine();
            }
        }
        for (int i = 0; i < sAns.length(); i++) {
            if (sAns.charAt(i) == sAnsG.charAt(i)) {
                nCount++;
            }
        }
        System.out.println(nCount);
    }

}
