package com.ohgiraffers.section02.copy;

import java.util.Arrays;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. 깊은 복사에 대해 이해할 수 있다. */
        /* 필기.
        *   깊은 복사는 heap에 생성된 배열이 가지고 있는 값을
        *   또 다른 배열에 복사해 놓은 것이다.
        *   서로 같은 값을 갖고 있지만, 두 배열은 서로 다른 배열이므로
        *   하나의 배열에 변경을 하더라도 다른 배열에는 영향을 주지 않는다.
        *   */

        /* 필기.
        *   깊은 복사를 하는 방법 4가지
        *   1. for문을 이용한 동일한 인덱스 값 복사
        *   2. Object의 clone()을 이용한 복사
        *   3. system의 arraycopy()를 이용한 복사
        *   4. Arrays의 copyOf()를 이용한 복사
        *   이 중 가장 높은 성능을 가진 것은 순수 배열복사를 위해 만들어진 arraycopy 메소드이고
        *   가장 많이 사용되는 방식은 유연한 copyOf 메소드 이다.
        *   clone()은 이전 배열과 같은 배열밖에 만들 수 없다는 특징을 유일하게 가지고
        *   반면에 그 외 3가지 방법은 복사하는 배열의 길이를 마음대로 조정할 수 있다.
        *  */

        int[] originArr = new int[]{1,2,3,4,5};

        print (originArr);

        System.out.println("======================================");

        /* 목차. 1. for문을 이용한 동일한 인덱스 값 복사 */
        int[]copyArr1 = new int[10];
        for(int i=0; i < originArr.length; i++){
            copyArr1[i]=originArr[i];
        }
        print(copyArr1);        //둘은 다른 해시코드지만 값만 복사를 했다

        System.out.println("======================================");

        /* 목차. Object의 clone()을 이용한 복사 */
        int[] copyArr2  = originArr.clone();
        print(copyArr2);

        System.out.println("======================================");

        /*목차. 3. System의 arraycopy()를 이용한 복사 */
        int[] copyArr3 = new int[10];
        /* 필기.
        *   원본배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스, 복사할 길이
        *   */
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
        print(copyArr3);

        System.out.println("======================================");

        /* 목차. 4. Arrays의 copyOf()를 이용한 복사 */
        int [] copyArr4 = Arrays.copyOf(originArr, 7);
        //복사한 값은 같지만 원하는 배열의 크기를 지정할 수 있다.
        print(copyArr4);
    } //얕은 복사는 주소를 복사하고, 깊은 복사는 정보를 복사하는 차이

    public static void print(int[]iarr){

        System.out.println("iarr hashCode : " + iarr.hashCode());

        for(int i = 0; i<iarr.length; i++){
            System.out.print(iarr[i]);
        }

        System.out.println();

    }

}
