
import java.util.*;
import java.io.*;

public class P3 {

    public static int assessB(int[] arnArray, int nBoS) {
        int nBoSNum = arnArray[0], nInd = 0;
        if (nBoS == 0) {
            for (int i = 0; i < arnArray.length; i++) {
                if (arnArray[i] > nBoSNum) {
                    nBoSNum = arnArray[i];
                    nInd = i;
                }
            }
        } else {
            for (int i = 0; i < arnArray.length; i++) {
                if (arnArray[i] < nBoSNum) {
                    nBoSNum = arnArray[i];
                    nInd = i;
                }
            }
        }
        return nInd;
    }

    public static void main(String[] args) throws IOException {
        Scanner fin = new Scanner(new FileReader("DATAIN3.txt"));
        int nPlayers = Integer.parseInt(fin.nextLine());
        String sFN, sLN;
        String[] arsFLname = new String[nPlayers];
        int[] arnG = new int[nPlayers];
        int[] arnA = new int[nPlayers];
        int[] arnPM = new int[nPlayers];
        int[] arnPIM = new int[nPlayers];
        int[] arnPPG = new int[nPlayers];
        for (int i = 0; i < nPlayers; i++) {
            fin.next();
            sLN = fin.next();
            sFN = fin.next();
            arsFLname[i] = sFN + " " + sLN;
            fin.nextInt();
            arnG[i] = fin.nextInt();
            arnA[i] = fin.nextInt();
            fin.nextInt();
            arnPM[i] = fin.nextInt();
            arnPIM[i] = fin.nextInt();
            arnPPG[i] = fin.nextInt();
            fin.nextInt();
        }
        System.out.println(arsFLname[assessB(arnG, 0)]);
        System.out.println(arsFLname[assessB(arnA, 0)]);
        System.out.println(arsFLname[assessB(arnPM, 1)]);
        System.out.println(arsFLname[assessB(arnPIM, 0)]);
        System.out.println(arsFLname[assessB(arnPPG, 0)]);
    }
}
