package com.extsoft.multiplication.table;

public class App {

    public static void main(String[] args) {
        String[] results = new String[]{
                measure(10),
                measure(100),
                measure(1000),
                measure(10000),
                measure(100000),
                measure(1000000)
        };

        for (String result : results) {
            System.out.println(result);
        }

    }

    private static String measure(int loops) {
        long smart = measureTimeOfMethod(new SmartMultiplicationTable(), loops);
        long simple = measureTimeOfMethod(new SimpleMultiplicationTable(), loops);
        return String.format(
                "Loops count is %s: simple: %s ms; smart: %s ms; " +
                        "The 'simple' method is %.2f times slower the 'smart' method.", loops, simple, smart,
                Double.parseDouble(String.valueOf(simple)) / smart
        );
    }


    private static long measureTimeOfMethod(MultiplicationTable multiplicationTable, int loops) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loops; i++) {
            multiplicationTable.print();
        }
        return System.currentTimeMillis() - start;
    }
}
