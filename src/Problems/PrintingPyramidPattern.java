package Problems;

public class PrintingPyramidPattern {
    //MAIN METHOD
    public static void main(String[] args) {
        // increasingPyramid('*', 10);
        decreasedPyramid('*', 10);
    }

    /**
     * Write the program which prints * in increased pyramid mode
     * initialize from 1 in order avoid space in output
     */
    public static void increasingPyramid(char ch, int a) {            //*
        for (int i = 1; i <= a; i++) {                                //**
            for (int j = 0; j < i; j++) {                             //***
                System.out.print(ch + " ");                           //****
            }                                                         //*****
            System.out.println();
        }
    }

    /**
     * Write the program which prints * in decreased pyramid mode
     * condition should be till 1 and included 1
     */
    public static void decreasedPyramid(char ch, int a) {
        for (int i = a; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}