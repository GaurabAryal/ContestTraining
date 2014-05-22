import java.util.*;
import java.util.ArrayList;

public class S1 {

    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<String>();
        Scanner sin = new Scanner(System.in);
        int nStu = sin.nextInt();
        int nRounds = sin.nextInt();
        int[] nIndex = new int[nRounds + 1];
        for (int i = 0; i < nRounds; i++) {
            nIndex[i] = sin.nextInt();
        }
        arr1.add("-1");
        for (int i = 1; i <= nStu; i++) {
            arr1.add(Integer.toString(i));
        }
        int nSize = arr1.size();
        for (int i = 0; i < nRounds; i++) {

            for (int j = nIndex[i]; j < nSize; j += nIndex[i]) {
                arr1.set(j, null);
            }
            arr1.removeAll(Collections.singleton(null));
            nSize = arr1.size();

            }
            for (int o = 1; o < arr1.size(); o ++){
                System.out.println(arr1.get(o));
            }
                   
        }

    }