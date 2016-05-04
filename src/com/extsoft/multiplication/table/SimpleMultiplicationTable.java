package com.extsoft.multiplication.table;

public class SimpleMultiplicationTable implements MultiplicationTable {
    @Override
    public void print() {
        for (int s = 1; s < 11; s++) {
            for (int d = 1; d < 11; d++)
                System.out.print(s * d + " ");
            System.out.println("");
        }
    }
}
