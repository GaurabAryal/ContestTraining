
import java.util.*;
import java.io.*;

public class P5 {

    public static boolean isOut(int nRows, int nCols, int nX, int nY) {
        if ((nX) == nCols || (nY) == nRows) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        Scanner fin = new Scanner(new FileReader("DATAin5.txt"));
        int nWater = Integer.parseInt(fin.nextLine());
        int nCols = Integer.parseInt(fin.nextLine());
        int nXPos = 0, nYPos = 0;
        int nTotSum = 0;
        boolean bA = false;
        String sLine;
        int nRows = Integer.parseInt(fin.nextLine());
        String arsMap[][] = new String[nRows][nCols];
        for (int i = 0; i < nRows; i++) {
            sLine = fin.nextLine();
            for (int j = 0; j < sLine.length(); j++) {
                arsMap[i][j] = Character.toString(sLine.charAt(j));
            }
        }
        for (int i = 0; i < nWater; i++) {
            bA = false;
            nYPos = 0;
            nXPos = 0;

            while (true) {
                if (!isOut(arsMap.length, arsMap[nYPos].length, nXPos, nYPos)) {

                    if ((nYPos + 1) != nRows && arsMap[ nYPos + 1][nXPos].equals(".")) {
                        nYPos++;
                    } else if ((nYPos + 1) != nRows && arsMap[ nYPos + 1][nXPos].equals("#")) {
                        if ((nXPos + 1) != nCols && arsMap[nYPos][nXPos + 1].equals("#")) {
                            if (arsMap[nYPos][nXPos].equals("A")) {
                                arsMap[nYPos][nXPos] = arsMap[nYPos][nXPos].replace("A", "#");
                                nTotSum++;
                                break;
                            } else {
                                arsMap[nYPos][nXPos] = arsMap[nYPos][nXPos].replace(".", "#");
                                for (int o = 0; o < nRows; o++) {
                                    for (int j = 0; j < arsMap[o].length; j++) {
                                        System.out.print(arsMap[o][j]);
                                    }
                                    System.out.println();
                                }
                                break;
                            }
                        } else {
                            nXPos++;
                        }
                    } else if ((nYPos + 1) != nRows && arsMap[ nYPos + 1][nXPos].equals("A")) {
                        nYPos++;
                    } else if ((nYPos + 1) == nRows) {
                        if (arsMap[nYPos][nXPos].equals("A")) {
                            arsMap[nYPos][nXPos] = arsMap[nYPos][nXPos].replace("A", "#");
                            nTotSum++;
                        } else {
                            arsMap[nYPos][nXPos] = arsMap[nYPos][nXPos].replace(".", "#");
                        }
                        break;
                    }
                }

            }
        }

        System.out.println(nTotSum);
    }
}
