package com.Book;


/**
 * 객체 배열
 * : 객체가 순차적으로 저장되는 구조
 * : 객체 그 자체가 저장되는 것이 아니고 생성된 인스턴스의 주소값이 저장
 *
 * <언제 사용>
 * 기존배열과 같은 배열을 만드는 경우
 * 더 큰 배열을 만들고 기존 배열을 복붙하는 경우
 *
 * 얕은 복사 : 참조값(주소) 복사 -> arraycopy
 * 깊은 복사 : 인스턴스의 실제 값 복사
 *      -> 1. 복사 생성자 이용
 *         2. 복사 팩토리 이용 (클래스 메서드)
 */
public class Book {
    private String bookName;
    private String author;

    public Book() {
    }

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println(bookName + ", " + author);
    }
}
