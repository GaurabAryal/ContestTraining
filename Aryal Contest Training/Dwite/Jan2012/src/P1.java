
import java.util.*;
import java.io.*;

public class P1 {

    public static void main(String[] args) throws IOException {
        Scanner fin = new Scanner(new FileReader("DATAIN2.txt"));//Data1 wasn't working
        String[] arsNum = fin.nextLine().split(" ");
        int nY = 0, nCount = 0, nActCtD = 0, nActCtA = 0;
        int nNum = Integer.parseInt(arsNum[0]), nNum2 = Integer.parseInt(arsNum[1]);
        String arsArray[][] = new String[nNum][nNum2];
        for (int j = 0; j < arsArray.length; j++) {
            String sLine = fin.nextLine();
            for (int k = 0; k < arsArray[j].length; k++) {
                arsArray[j][k] = Character.toString(sLine.charAt(k));
            }
        }
        for (int i = 0; i < nNum2; i++) {////Count down
            nY = 0;
            while (nY < nNum) {
                nCount = 0;
                if (arsArray[nY][i].equals(".")) {
                    nY++;
                    while (nY < nNum && arsArray[nY][i].equals(".")) {
                        nCount++;
                        nY++;
                    }
                } else {
                    nY++;
                }
                if (nCount >= 1) {
                    nActCtD++;
                }
            }
        }
        for (int i = 0; i < nNum; i++) {//Count Across
            nY = 0;
            while (nY < nNum2) {
                nCount = 0;
                if (arsArray[i][nY].equals(".")) {
                    nY++;
                    while (nY < nNum2 && arsArray[i][nY].equals(".")) {
                        nCount++;
                        nY++;
                    }
                } else {
                    nY++;
                }
                if (nCount >= 1) {
                    nActCtA++;
                }
            }
        }
        System.out.println(nActCtA + " " + nActCtD);
    }
}
