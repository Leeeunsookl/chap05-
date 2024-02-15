package com.ohgiraffers.section01.array;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. 배열 사용 예시 이해 적용 */
        /* 필기. 랜덤한 카드를 한 장 뽑아서 출력해보자 */

        String[]shapes={"SPADE","DIAMOND","CLOVER","HEART"};
        String[]cardNumbers = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};

        int randomShapeIndex=(int)Math.random()*shapes.length;
        int randomCardNumberIndex = (int) (Math.random()*cardNumbers.length);

        System.out.println("당신이 뽑은 카드는? = " + shapes[randomShapeIndex]+ " " + cardNumbers[randomCardNumberIndex] +"카드입니다.");

    }

}
