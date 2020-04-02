package com.company;
import java.util.Arrays;
public class Solution {

    public static int getSolution(Train[] array){
        return findMaxProfit(array, array.length);
    }

    static class Train implements Comparable{
        int number;
        int profit;
        int start;
        int finish;

        public Train(int number, int profit, int start, int finish) {
            this.number = number;
            this.profit = profit;
            this.start = start;
            this.finish = finish;
        }
        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }

    private int compareTo(Train t1, Train t2) {
        if (t1.finish<t2.finish) return 1;
        return -1;
    }

    private static int checkOverlap(Train[] array, int i) {
        for (int j = i - 1; j >= 0; j--) {
            if (array[j].finish <= array[i].start) return j;
        }
        return -1;
    }
    private static int findMaxProfit(Train array[], int n){
        Arrays.sort(array);
        int[] profit_table = new int[n];
        profit_table[0] = array[0].profit;
        for (int i = 1; i<n;i++){
            int cur_profit = array[i].profit;
            int err = checkOverlap(array, i);
            if (err != -1) cur_profit += profit_table[err];
            profit_table[i] = Math.max(cur_profit, profit_table[i-1]);
        }
        int result = profit_table[n-1];
        return result;
    }
}
