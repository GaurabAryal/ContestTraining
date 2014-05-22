
import java.util.*;

public class J3 {

    static int nX = 0, nY = 0;

    public static void index(String arsText[][], String sChar) {
        for (int i = 0; i < arsText.length; i++) {
            for (int j = 0; j < arsText[i].length; j++) {
                if (arsText[i][j].equals(sChar)) {
                    nY = i;
                    nX = j;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String arsText[][]
                = {{"A", "B", "C", "D", "E", " F"},
                {"G", "H", "I", "J", "K", "L"},
                {"M", "N", "O", "P", "Q", "R"},
                {"S", "T", "U", "V", "W", "X"},
                {"Y", "Z", " ", "-", ".", "e"}};
        int nCount = 0, nTempX = 0, nTempY = 0;
        String sWord = sin.nextLine() + "e";
        for (int i = 0; i < sWord.length(); i++) {
            index(arsText, Character.toString(sWord.charAt(i)));
            nCount += Math.abs(nX - nTempX);
            nCount += Math.abs(nY - nTempY);
            nTempX = nX;
            nTempY = nY;
        }
        System.out.println(nCount);
    }
}
