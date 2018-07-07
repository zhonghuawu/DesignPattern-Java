package com.huaa.structural.adapter;

public class Client {
    public static void main(String[] args) {
        ScoreOperation operation = new OperationAdapter();

        int[] scores = {32, 432, 2352, 55, 22, 533, 421};

        print(scores);

        scores = operation.sort(scores);
        print(scores);

        int val = operation.search(scores, 432);
        print(val);

        val = operation.search(scores, 43);
        print(val);
    }

    private static void print(int... array) {
        for (int e : array) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }
}
