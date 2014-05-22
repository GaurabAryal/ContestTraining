
import java.util.*;

public class S1 {

    public static int prs(String sString) {
        return Integer.parseInt(sString);
    }

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nNum = Integer.parseInt(sin.nextLine());
        int nFor[] = new int[nNum], nBest, nInd = 0, nBest2;
        String arsComp[] = new String[nNum];
        String arsLine[] = null, sBest, sBest2;
        for (int i = 0; i < nNum; i++) {
            arsLine = sin.nextLine().split(" ");
            nFor[i] = ((2 * prs(arsLine[1])) + (3 * prs(arsLine[2])) + (3 * prs(arsLine[3])));
            arsComp[i] = arsLine[0];
        }
        nBest = nFor[0];
        sBest = arsComp[0];
        for (int i = 1; i < nFor.length; i++) {
            if (nBest < nFor[i]) {
                nBest = nFor[i];
                sBest = arsComp[i];
                nInd = i;
            }
        }
        nFor[nInd] = 0;
        sBest2 = arsComp[0];
        nBest2 = nFor[0];
        for (int i = 1; i < nFor.length; i++) {
            if (nBest2 < nFor[i]) {
                nBest2 = nFor[i];
                sBest2 = arsComp[i];
            }
        }
        if (nBest2 == nBest) {
            if (sBest.charAt(0) > sBest2.charAt(0)) {
                System.out.println(sBest + "\n" + sBest2);
            } else {
                System.out.println(sBest2 + "\n" + sBest);
            }
        } else {
            System.out.println(sBest + "\n" + sBest2);
        }
    }
}
