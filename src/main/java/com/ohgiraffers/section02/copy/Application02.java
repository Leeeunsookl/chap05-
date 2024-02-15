package com.ohgiraffers.section02.copy;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다. */

        /* 필기.
        *   얕은 복사의 활용
        *   얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
        *   리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
        *   */

        String[] names = {"이은숙", "루비", "쥴리"};
        // 101호

        /* 필기. 얕은 복사 확인을 위한 hashcode 출력 */
        System.out.println("names의 hashCode = "+names.hashCode());
        // 101호

        /* 목차. 1. 인자와 매개변수로 활용 */
        print(names);

        /* 목차. 2. 리턴값으로 활용 */
        String[]animals = getAnimals();
                //static 호출은 class명. method 이름

        System.out.println("리턴 받은 animals의 hashCode = " + animals.hashCode());

        print(animals);

    }

    public static void print(String[] forNames){
        // 101호
        //print는 메소드 이름,  forNames는 names를 받아주는거
        /* 필기. 전달받은 배열의 hashCode(메소드) 출력 */
        System.out.println("forNames의 hashCode = " + forNames.hashCode());

        /* 필기. 전달 받은 배열의 값 출력 */
        for(int i=0; i < forNames.length; i++){
            System.out.println(forNames[i]);
        }

        System.out.println();

    }

    public static String[] getAnimals() {

        String[] newAnimals = new String[]{"낙타","호랑이","나무늘보"};
        System.out.println("newAnimals의 hashCode : = " + newAnimals.hashCode());

        return newAnimals;
    }
    }


