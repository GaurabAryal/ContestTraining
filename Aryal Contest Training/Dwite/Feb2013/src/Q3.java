/*Gaurab Aryal*/

import java.util.*;
import java.io.*;

public class Q3 {

    public static boolean isOut(int nSize, int ndK, int ndK2, int k) {
        if (ndK < 0 || ndK2 == nSize || ndK2 < 0 || ndK2 == nSize || k < 0 || k == nSize) {
            return true; // bounds checking 
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        Scanner fin = new Scanner(new FileReader("DATA3.txt"));
        int nSize = Integer.parseInt(fin.nextLine());
        int nTCt = 0;
        String sLine = "";
        int ndK, ndK2;
        boolean bAcc;
        String board[][] = new String[nSize][nSize];
        for (int i = 0; i < nSize; i++) {
            sLine = fin.nextLine();
            for (int j = 0; j < nSize; j++) {
                board[i][j] = Character.toString(sLine.charAt(j));
            }
        }
        for (int i = 0; i < nSize; i++) {
            for (int j = 0; j < nSize; j++) {
                if (board[i][j].equals("#")) {
                    nTCt += 1;
                    ndK = j - 1;
                    ndK2 = j + 1;
                    bAcc = true;
                    for (int k = (i + 1); k < nSize && !isOut(nSize, ndK, ndK2, k); k++) {
                        if (board[k][ndK].equals("#") && board[k][ndK2].equals("#")) {
                            for (int o = ndK; o <= ndK2; o++) {
                                if (!board[k][o].equals("#")) {
                                    bAcc = false;
                                    break;
                                }
                            }
                            if (!bAcc) {
                                nTCt += 1;
                                break;
                            }
                        }
                        ndK2 += 1;
                        ndK -= 1;
                    }
                }
            }
        }
        System.out.println(nTCt);
    }
}