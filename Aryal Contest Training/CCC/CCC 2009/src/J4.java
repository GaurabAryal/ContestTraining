
import java.util.*;

public class J4 {

    static String arsWords[] = {"WELCOME", "TO", "CCC", "GOOD", "LUCK", "TODAY"};
    static ArrayList<Integer> arlSt = new ArrayList<Integer>();
    static ArrayList<Integer> arlDCT = new ArrayList<Integer>();

    public static void wordPline(int nWid) {
        int i = 0, nCount = 0, nAccum = 0;
        while (i < arsWords.length) {
            nAccum += arsWords[i].length();
            if (nAccum < nWid) {
                if (i == arsWords.length) {
                    i++;
                } else {
                    nCount++;
                    i++;
                }
            }
            if (nAccum > nWid || i == arsWords.length) {
                if (i != arsWords.length) {
                    nAccum -= arsWords[i].length();
                }
                arlDCT.add(nAccum);
                arlSt.add(nCount);
                nAccum = 0;
                nCount = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nWid = sin.nextInt(), nInd = 0, nIndTemp = 0, j = 0;
        wordPline(nWid);
        for (int i = 0; i < arlSt.size(); i++) {
            if (i != 0) {
                nIndTemp += arlSt.get(i);
                nInd = nIndTemp;
            }
            for (; (arlDCT.get(i) + 1) <= nWid;) {
                if (nInd < (nIndTemp + arlSt.get(i)) - 1) {
                    arlDCT.set(i, arlDCT.get(i) + 1);
                    arsWords[nInd] += ".";
                    nInd++;
                } else {
                    nInd = nIndTemp;
                }
            }
        }
        for (int i = 0; i < arlSt.size(); i++) {
            nIndTemp = j;
            for (; j < (nIndTemp + arlSt.get(i)); j++) {
                System.out.print(arsWords[j]);
            }
            System.out.println();
        }

    }
}
