
import java.util.*;
import java.io.*;

public class P8 {

    public static void main(String[] args) throws IOException {
        Scanner fin = new Scanner(new FileReader("DATAin8.txt"));
        String sNum = "";
        for (int i = 0; i < 20; i++) {
            sNum += fin.nextLine();
        }
        System.out.println(sNum.length());
        int nProd = 1, nMaxProd = 0;
        for (int i = 0; i < sNum.length() - 4; i++) {
            nProd = Integer.parseInt(Character.toString(sNum.charAt(i)))
                    * Integer.parseInt(Character.toString(sNum.charAt(i + 1)))
                    * Integer.parseInt(Character.toString(sNum.charAt(i + 2)))
                    * Integer.parseInt(Character.toString(sNum.charAt(i + 3)))
                    * Integer.parseInt(Character.toString(sNum.charAt(i + 4)));
            if (nProd > nMaxProd) {
                nMaxProd = nProd;
            }
        }
        System.out.println(nMaxProd);
    }

}
