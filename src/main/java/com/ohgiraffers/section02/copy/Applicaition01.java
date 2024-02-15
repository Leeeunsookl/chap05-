package com.ohgiraffers.section02.copy;

public class Applicaition01 {

    public static void main(String[] args) {

        /* 수업목표. 배열의 복사 개념 중 얕은 복사에 대해 이해 */
        /* 필기.
        *   배열의 복사는 크게 두가지 종류를 가진다.
        *   1. 얕은 복사(shallow copy) : stack에 주소값만 복사(변수에 담겨있는 주소만 복사)
        *   2. 깊은 복사(deep copy) : heap 의 배열에 저장된 값을 복사 (실제 값을 복사)
        *   */

        //동기화를 원하면 얕은 복사, 아예 새로운 주소를 만들고 싶다면 깊은 복사를 사용하면 된다.

        /* 필기.
        *   얕은 복사는 stack에 저장된 배열의 주소값만 복사하는 것이므로
        *   두개의 레퍼런스 변수는 동일한 배열의 주소값을 가진다.
        *   하나의 레퍼런스 변수에 저장된 주소값을 갖고 배열의 내용을 수정(값 변경)하면
        *   다른 레퍼런스 변수로 접근했을 때도 동일한 배열을 가리키고 있기 때문에
        *   변경된 값이 반영돼있다.
        *   */

        //원본 배열 생성
        int[]originArr={1,2,3,4,5,80,77,37};

        //originArr에 저장된 배열 주소를 copyArr에도 저장해보면
        int[]copyArr=originArr;     //얕은 복사

        System.out.println(originArr.hashCode());       //hashCode는 고유한 번호로 주민번호로 생각하면 쉽다.
        System.out.println(copyArr.hashCode());

        for(int i=0; i<originArr.length;i++){

            System.out.println(originArr[i]+" ");

        }
        System.out.println();
        for(int i=0; i<copyArr.length; i++){
            System.out.println(copyArr[i]);
        }
        copyArr[0]=99;
        for(int i=0; i< originArr.length;i++){
            System.out.println(originArr[i]);
        }
        System.out.println();
        for(int i=0; i< copyArr.length;i++){
            System.out.println(copyArr[i]);
        }

    }
}
