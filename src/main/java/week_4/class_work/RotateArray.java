package main.java.week_4.class_work;

import java.util.Arrays;

public class RotateArray {
    public static int[] rotateArray(int[] nums, int k) {
        if (nums.length == 0) return nums;

        int n = nums.length;
        k = k % n;
        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            newArray[(i + k) % n] = nums[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));
        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2}, 3)));
    }
}