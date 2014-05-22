
import java.util.*;
import java.io.*;

public class S3 {

    static ArrayList<Integer> arl = new ArrayList<Integer>();
    static ArrayList<Integer> arlBranch = new ArrayList<Integer>();
    static ArrayList<Integer> arlYN = new ArrayList<Integer>();

    static int smallie() {
        int nSmallie = arl.get(0);
        for (int i = 1; i < arl.size(); i++) {
            if (arl.get(i) < nSmallie) {
                nSmallie = arl.get(i);
            }
        }
        return nSmallie;
    }

    static int smallie2() {
        int nSmallie = arlBranch.get(0);
        for (int i = 1; i < arlBranch.size(); i++) {
            if (arlBranch.get(i) < nSmallie) {
                nSmallie = arlBranch.get(i);
            }
        }
        return nSmallie;
    }

    public static void main(String[] args) throws IOException {

        Scanner sin = new Scanner(System.in);
        int nCase = sin.nextInt(), nCars;
        for (int i = 0; i < nCase; i++) {
            nCars = sin.nextInt();
            for (int j = 0; j < nCars; j++) {
                arl.add(sin.nextInt());
            }
            for (int j = arl.size() - 1; j >= 0; j--) {
                if (arl.get(j) != smallie()) {
                    arlBranch.add(arl.get(j));
                    arl.remove(j);
                } else {
                    arl.remove(j);
                }
            }
            for (int j = arlBranch.size() - 1; j >= 0; j--) {
                if (arlBranch.get(j) != smallie2()) {
                    break;
                } else {
                    arlBranch.remove(j);
                }
            }
            if (arlBranch.isEmpty()) {
                arlYN.add(1);
            } else {
                arlYN.add(0);
            }
            arl.clear();
            arlBranch.clear();
        }
        for (int i = 0; i < arlYN.size(); i++) {
            if (arlYN.get(i) == 0) {
                System.out.println("N");
            } else {
                System.out.println("Y");
            }
        }
    }
}
