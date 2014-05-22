
import java.util.*;

public class P2 {

    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        String sCode;
        int k = 0;
        String sP = "'";
        String arsLine[] = new String[5];
        for (int i = 0; i < 5; i++) {
            sCode = sin.nextLine();
            arsLine[i] = "";
            for (int j = 0; j < sCode.length() - 1; j +=k) {
                if (sCode.charAt(j) == '/' && sCode.charAt(j + 1) == '/') {
                    for (k = j + 2; k < sCode.length(); k++) {
                        arsLine[i] += sCode.charAt(k);
                    }
                } else if (sCode.charAt(j) == '"') {
                    for (k = j + 1; k < sCode.length(); k++) {
                        if (sCode.charAt(k) == '"') {
                            break;
                        }
                        arsLine[i] += sCode.charAt(k);
                    }
                } else if (sCode.charAt(j) == '/' && sCode.charAt(j + 1) == '*') {
                    for (k = j + 2; k < sCode.length() - 1; k++) {
                        if (sCode.charAt(k) == '*' && sCode.charAt(k + 1) == '/') {
                            break;
                        }
                        arsLine[i] += sCode.charAt(k);
                    }
                } else if (sCode.charAt(j) == sP.charAt(0)) {
                    for (k = j + 1; k < sCode.length(); k++) {
                        if (sCode.charAt(k) == sP.charAt(0)) {
                            break;
                        }
                        arsLine[i] += sCode.charAt(k);
                    }
                }else{
                    j++;
                }
            }
            System.out.println(arsLine[i]);
        }
    }
}