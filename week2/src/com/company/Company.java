package com.company;

public class Company {
    /*
    singleton pattern :
    전역변수를 통해 인스턴스를 하나만 생성하는 형태.
    외부에서 생성할 수 없고 프로그램 시작시에 static으로 생성하여, 외부에서는 이미 생성된 인스턴스를 호출하는 방식으로 사용
     */

    // private - 외부에서 접근 불가능한 생성자
    private Company() {}

    private static Company instance = new Company();

    public static Company getInstance() {
        if (instance == null)
            instance = new Company();
        return instance;
    }
}
