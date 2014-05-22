
import java.util.*;

public class S1 {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nTot = sin.nextInt(), nFir = sin.nextInt(), nSec = sin.nextInt(),
                nThird = sin.nextInt(), nCount = 0;
        while (nTot > 0) {
            nFir++;
            nTot--;
            nCount++;
            if (nTot > 0 && nFir % 35 == 0) {
                nTot += 30;
                nFir = 0;
            }
            nSec++;
            nTot--;
            nCount++;
            if (nTot > 0 && nSec % 100 == 0) {
                nTot += 60;
                nSec = 0;
            }
            nThird++;
            nTot--;
            nCount++;
            if (nTot > 0 && nThird % 10 == 0) {
                nTot += 9;
                nThird = 0;
            }
        }
        System.out.println(nCount);
    }
}
