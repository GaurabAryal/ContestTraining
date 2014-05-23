
import java.util.*;

public class cdrom {
    public static String fixit(int nMax, String sS){
        int nL = nMax-sS.length();
        String nFin = "";
        for (int i = 0; i < nL; i++){
            nFin+="0";
        }
        nFin+=sS;
        System.out.println(nL);
        return nFin;
    }
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int nMax = sin.nextInt();
        int nFiles = sin.nextInt(), nComb, nSum, nLarge = 0;
        int arnFiles[] = new int[nFiles];
        for (int i = 0; i < nFiles; i++) {
            arnFiles[i] = sin.nextInt();
        }
        nComb = (int) Math.pow(2, nFiles) - 1;
        String sS;
        for (int i = 0; i < nComb; i++) {
            nSum = 0;
            sS = Integer.toBinaryString(i);
            sS = fixit(nFiles, sS);
            for (int j = 0; j < sS.length(); j++) {
                if (sS.charAt(j) == '1') {
                    nSum += arnFiles[j];
                }
            }
            if (nSum > nLarge && nSum <= nMax) {
                nLarge = nSum;
            }
        }
        System.out.println(nLarge);
    }

}
