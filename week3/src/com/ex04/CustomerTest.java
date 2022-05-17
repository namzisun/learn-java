package com.ex04;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        int id = 10000;
        Customer customerLee = new Customer(id++, "이순신");
        Customer customerShin = new Customer(id++, "신사임당");
        GOLDCustomer customerHong = new GOLDCustomer(id++, "홍길동");
        GOLDCustomer customerLee2 = new GOLDCustomer(id++, "이율곡");
        VIPCustomer customerKim = new VIPCustomer(id++, "김유신");

        ArrayList<Customer> customers= new ArrayList<>();
        customers.add(customerLee);
        customers.add(customerShin);
        customers.add(customerHong);
        customers.add(customerLee2);
        customers.add(customerKim);

        System.out.println("======= 고객 정보 출력 =======");
        for (Customer c : customers) {
            System.out.println(c.showCustomerInfo());
        }

        System.out.println("======= 할인율과 보너스 포인트 계산 =======");
        for (Customer c : customers) {
            c.calcPrice(10000);
        }
    }

}
