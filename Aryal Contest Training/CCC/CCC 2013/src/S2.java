
import java.io.*;
import java.util.*;

public class S2 {

    static boolean isValid(int[] arnWs, int nIndex, int nMax) {
        int nSum = 0;
        for (int i = nIndex; i < (nIndex + 4); i++) {
            nSum += arnWs[i];
        }
        if (nSum <= nMax) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner(new FileReader("DATAIN.txt"));
        int nMax, nMaxRail, nCounter = 0, nIndex = 0;
        int[] arnWs;
        nMax = sin.nextInt();
        nMaxRail = sin.nextInt();
        arnWs = new int[nMaxRail];
        for (int j = 0; j < nMaxRail; j++) {
            arnWs[j] = sin.nextInt();
        }
        while ((nIndex + 4) <= nMaxRail) {
            if (isValid(arnWs, nIndex, nMax)) {
                nCounter++;
                if (nCounter == 1) {
                    nCounter = 4;
                }
            }
            System.out.println(nCounter);
            nIndex++;
        }
        if (nIndex == 0) {
            System.out.println(0);
        }
    }
}