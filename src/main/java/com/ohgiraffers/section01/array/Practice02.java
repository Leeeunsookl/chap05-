package com.ohgiraffers.section01.array;

import java.util.ArrayList;

public class Practice02 {
    public static void main(String[] args) {
//        ArrayList<Integer> nums = new ArrayList<>();
//        for(int i =0; i <6; i++){
//            while(true) {
//                int x = (int) (Math.random() * 50) + 1;
//                if (nums.contains(x) == false) {
//                    nums.add(x);
//                    break;
//                }
//            }
//        }
//        for(int x : nums){
//            System.out.println(x);
//        }
        boolean[] ifSelected = new boolean[50];
        for(int i =0; i < 6; i++){
           while(true){
               int x = (int) (Math.random() * 50) + 1;
               if(ifSelected[x-1] == true) continue;
               else{
                   System.out.println(x);
                   ifSelected[x-1] = true;
                   break;
               }
           }
        }


    }
}