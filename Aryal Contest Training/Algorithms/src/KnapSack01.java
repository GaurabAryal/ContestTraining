/*
 A knapsack has a total weight of 5. There are three items to fit. 1st item has a value of 5 and weight of three.
 The second item has a value of 3 and the weight of 2 and the third item has a value of 4 and the weight of 1. We want to find out 
 the max value of item/s we can fit in the knapsack without exceeding the weight limit.
 */

public class KnapSack01 {

    public static void main(String[] args) {
        int arnWeights[] = {5, 3, 4};
        int arnValues[] = {3, 2, 1};
        //Make a 2D array to test different knapsack (weight) situation.
        int arnV[][] = new int[4][6];
        for (int i = 1; i < arnV.length; i++) {
            for (int j = 1; j < arnV[i].length; j++) {
                if (arnWeights[i-1] < j) {
                    if (arnV[i-1][j] < arnValues[i-1]) {
                        arnV[i][j] = arnValues[i];
                    } else {
                        arnV[i][j] = arnV[i - 1][j];
                    }
                } else {
                    arnV[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < arnV.length; i++) {
            for (int j = 0; j < arnV[i].length; j++) {
                System.out.print(arnV[i][j]);
            }
            System.out.println();
        }
    }

}
