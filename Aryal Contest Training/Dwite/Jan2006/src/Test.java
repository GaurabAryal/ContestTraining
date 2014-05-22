/*Gaurab Aryal*/

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Test {

    public static void main(String[] args) throws IOException {

        String sName, sAmt;
        int arnStats;
        Scanner fin = new Scanner(new FileReader("DATAIN3.txt"));
        customer arCcustomers[] = new customer[Integer.parseInt(fin.nextLine())]; // here we declare the array of customers.
        for (int n = 0; n < 3; n++) {
            arCcustomers[n] = new customer(); // this initializes each new instance of the customer
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
        for (int n = 0; n < 3; n++) {
            arCcustomers[n].Show();
        }
    }
}

class customer {

    String sName, sAmt;
    int nGoals, nAst, nLwPM, nPIM, nPPG;

    public void Populate(String sName, int _nGoals, int _nAst, int _nLwPM, int _nPIM, int _nPPG) {
        nGoals = _nGoals;
        nAst = _nAst;
        nLwPM = _nLwPM;
        nPIM = _nPIM;
        nPPG = _nPPG;
    }

    public void Show() {
        System.out.println(sName + " owes " + nAmount);
    }
}
