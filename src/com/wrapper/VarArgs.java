package com.wrapper;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,7,8,9));
        System.out.println(sum(45,32));
    }

    public static int sum(int first, int second , int... a){
        int sum = first+second;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
}
