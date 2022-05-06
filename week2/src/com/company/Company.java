package com.company;

public class Company {
    /*
    singleton pattern :
    전역변수를 통해 인스턴스를 하나만 생성하는 형태.
    외부에서 생성할 수 없고 프로그램 시작시에 static으로 생성하여,
    외부에서는 이미 생성된 인스턴스를 호출하는 방식으로 사용하는 디자인패턴

    private 생성자로 외부에서 인스턴스 생성이 불가능하게 하고
    외부에서는 class 내부에서 생성한 instance를 반환하는 getInstance() method를 통해 이미 생성한 instance를 받아쓴다
        => 즉, instance가 필요할 때마다 똑같은 instance를 만들어내는 것이 아니라 기존에 생성되어있는 instance를 사용하게 함

    < 사용하는 이유 >
    메모리 낭비 방지
    두번째 이용시부터는 객체 로딩시간이 줄어 성능이 좋아짐
    다른 클래스들의 인스턴스들끼리 데이터 공유 쉬움

    < 문제점 >
    싱글톤 인스턴스가 너무 많은 일을 하게되면 다른 클래스의 인스턴스들 간에 결합도가 지나치게 높아짐
리   */

    // private - 외부에서 접근 불가능한 생성자
    private Company() {}

    private static Company instance = new Company();

    public static Company getInstance() {
        if (instance == null)
            instance = new Company();
        return instance;
    }
}
