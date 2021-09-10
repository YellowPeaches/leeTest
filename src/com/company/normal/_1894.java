package com.company.normal;

public class _1894 {
    public static void main(String[] args) {

    }


    public static int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long sum = 0;//= Arrays.stream(chalk).sum();
        for (int i = 0; i < n; i++) {
            sum += chalk[i];
        }
        k = (int) (k % sum);
        for (int i = 0; i < n; i++) {
            k -= chalk[i];
            if (k < 0) {
                return i;
            }
        }
        return 0;
    }
}
