package com.epam.rd.autotasks;

import java.util.Arrays;

public class CarouselRun {
    private final int[] arr;
    private int i = 0;
    private int sum = 0;
    private final int flag;
    public CarouselRun(int[] arr, int i) {
        this.arr = Arrays.copyOf(arr, arr.length);
        flag = 0;
        for (int elem : arr) {
            sum += elem;
        }
    }
    public CarouselRun(int[] arr, int counter, int halve) throws UnsupportedOperationException {
        this.arr = Arrays.copyOf(arr, arr.length);
        i = counter;
        flag = halve;
        for (int elem : arr) {
            sum += elem;
        }
    }
    public int next() {
        int tempElem;
        if (isFinished()) {     //container is empty
            return -1;
        }
        if (i == arr.length) {
            i = 0;
        }
        while (arr[i] <= 0) {
            i++;
            if (i == arr.length) {
                i = 0;
            }
        }
        if (flag == 0) {
            sum--;
            return arr[i++]--;
        } else  {
            tempElem = arr[i];
            arr[i] /= 2;
            sum = sum - arr[i] - tempElem % 2;
            i++;
            return tempElem;
        }
    }

    public boolean isFinished() {
        return sum == 0;
        }
}


