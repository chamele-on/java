package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product /* java.utol.Scanner */{

    /* 필기.
    * SmartPhone 클래스는 Product 클래스를 상속 받아서 구현한다.
    * extends 키워드로 클래스를 상속 받을 때 두 개 이상의 클래스는
    * 상속 받지 못한다.
    * 추상클래스가 가지는 추상 메소드는 "반드시" 오버라이딩 해야 한다.(강제성)
    * */

    public SmartPhone(){}

    @Override
    public void abstMethod() {

        System.out.println("Product 클래스의 추상메소드를 오버라이딩 한 메소드 호출..");


    }

    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 일반 메소드 호출됨..");

        SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        /* 필기. 다형성을 적용해서 추상클래스를 레퍼런스 타입으로 활용 */
        Product product = new SmartPhone();
        product.abstMethod();

        // 추상클래스 본인이 가지고 있는 메소드 호출
        product.setNonStaticMethod();

        //static 메소드는 그냥 사용이 가능하다. (인스턴스 생성이 불필요)
        Product.staticMethod();

        /* 필기.
        * 추상클래스를 왜 쓰냐?
        * 추상클래스의 추상메소드는 오버라이딩에 대한 "강제성" 이 부여된다.
        * 따라서 여러 클래스들을 그룹화 하여
        * 필수 기능!!! 을 정의하여 강제성을 부여해 개발 시 일관 되게 만들 수 있다.
        * */

    }

}

