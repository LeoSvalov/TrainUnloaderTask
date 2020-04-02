package com.company;
import com.company.Solution.Train;

public class Main {

    public static void main(String[] args) {
        Train t1 = new Train(1,5, 1, 2);
        Train t2 = new Train(2,3, 2, 3);
        Train t3 = new Train(3,1, 3, 4);
        Train[] arr = new Train[]{t1, t2, t3};
        System.out.println(Solution.getSolution(arr));

    }
}
