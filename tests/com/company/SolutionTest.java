package com.company;
import com.company.Solution.Train;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void getSolution() {
        Train t1 = new Train(1,5, 1, 2);
        Train t2 = new Train(2,3, 2, 3);
        Train t3 = new Train(3,1, 3, 4);
        Train[] arr = new Train[]{t1, t2, t3};
        assertEquals(9, Solution.getSolution(arr));

        Train t4 = new Train(4,20, 1, 5);
        arr = new Train[]{t1, t2, t3, t4};
        assertEquals(20, Solution.getSolution(arr));

        Train t5 = new Train(5,12,4,7);
        arr = new Train[]{t1, t2, t3, t4, t5};
        assertEquals(21,Solution.getSolution(arr));


        t1 = new Train(1,190, 1, 2);
        t2 = new Train(2,200, 1, 4);
        t3 = new Train(3,850, 1, 9);
        t4 = new Train(4,660, 5, 10);
        t5 = new Train(5,330,3,7);
        arr = new Train[]{t1, t2, t3, t4, t5};
        assertEquals(860, Solution.getSolution(arr));

        t1 = new Train(1,50, 1, 2);
        t2 = new Train(2,20, 3, 5);
        t3 = new Train(3,100, 6, 19);
        t4 = new Train(4,200, 2, 50);
        t5 = new Train(5,1,51,52);
        arr = new Train[]{t1, t2, t3, t4, t5};
        assertEquals(251, Solution.getSolution(arr));

    }
}