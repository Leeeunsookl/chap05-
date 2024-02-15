package com.ohgiraffers.section01.array;

public class Practice01 {

    public static void main(String[] args) {

        int [] allNumber =new int[6];
        for(int i=0; i<=5; i++){

            int randomNumber = (int)(Math.random()* 50)+1;
            allNumber[i] = randomNumber;
            System.out.println("여섯자리 랜덤 번호는?"+ allNumber[i]);

        }


        }

    }

