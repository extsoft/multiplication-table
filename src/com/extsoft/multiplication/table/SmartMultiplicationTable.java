package com.extsoft.multiplication.table;

public class SmartMultiplicationTable implements MultiplicationTable {
    @Override
    public void print() {
        String[] data = new String[10];

        for (int c = 1; c < 11; c++) {
            for (int r = 1; r < c + 1; r++) {
                String res = c * r + " ";
                if (data[c - 1] == null) {
                    data[c - 1] = res;
                } else {
                    data[c - 1] += res;
                }
                if (c != r) {
                    data[r - 1] += res;
                }
            }
        }

        for (String s : data) {
            System.out.println(s);
        }
    }
}
