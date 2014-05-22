
import java.util.*;
import java.io.*;

public class P3Revised {

    public static void main(String[] args) throws IOException {
        Scanner fin = new Scanner(new FileReader("DATAIN3.txt"));
        int nPlayers = Integer.parseInt(fin.nextLine());
        Players arnplayers[] = new Players[5];
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
    }
}

class Players {

    String sName, sAmt;
    int nAmount; // amount due

    public void Populate(String sNameTemp, int nAmountTemp) {
        sName = sNameTemp;
        nAmount = nAmountTemp;
    }

    public void Show() {
        System.out.println(sName + " owes " + nAmount);
    }
}
