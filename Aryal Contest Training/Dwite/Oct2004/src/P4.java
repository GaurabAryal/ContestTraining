
import java.util.*;

public class P4 {
//

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int arnFiles[];
        int arnArray[];
        int nMaxNum;
        int nMaxFile = 0, nSum = 0;
        for (int i = 0; i < 5; i++) {
            nMaxNum = sin.nextInt();
            nSum = 0;
            arnFiles = new int[sin.nextInt()];
            for (int j = 0; j < arnFiles.length; j++) {
                arnFiles[j] = sin.nextInt();
                if (nMaxFile < arnFiles[j]) {
                    nMaxFile = arnFiles[j];
                }
            }
            if (nMaxNum < nMaxFile) {
                arnArray = new int[nMaxFile + 1];
            } else {
                arnArray = new int[nMaxNum + 1];
            }

            for (int k = 0; k < arnFiles.length; k++) {
                arnArray[arnFiles[k]] = arnFiles[k];
            }
            for (int k = 0; k < arnArray.length; k++) {
                if ((nSum + arnArray[k]) < nMaxNum) {
                    nSum += arnArray[k];
                    arnArray[k] = 0;
                    nSum += arnArray[nMaxNum - nSum];
                }
            }
            System.out.println(nSum);
        }
    }
}
