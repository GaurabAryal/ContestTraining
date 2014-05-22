/*Gaurab Aryal*/

import java.util.*;
import java.io.*;

public class S2 {

    public static void main(String[] args) throws IOException {
        Scanner sin = new Scanner(System.in);
        boolean bCheck = true;
        int nNum = sin.nextInt();
        String arsNames[] = new String[nNum];
        String arsNames2[] = new String[nNum];
        for (int i = 0; i < arsNames.length; i++) {
            arsNames[i] = sin.next();
        }
        for (int i = 0; i < arsNames.length; i++) {
            arsNames2[i] = sin.next();
        }
        for (int i = 0; i < arsNames.length; i++) {
            for (int j = 0; j < arsNames2.length; j++) {
                if (arsNames2[j].equals(arsNames[i])) {
                    if (arsNames2[j].equals(arsNames[j])){
                        bCheck = false;
                    }
                    if (!arsNames2[i].equals(arsNames[j])) {
                        bCheck = false;
                    }
                }
            }
        }
        if (bCheck){
            System.out.println("good");
        }else{
            System.out.println("bad");
        }
    }
}