package com.codestates.section2week3.di3;



import java.util.List;

public class CafeClient {
    public static void main(String[] args) {
        MenuService menuService1 = new MenuServiceImpl();
        MenuService menuService2 = new MenuServiceStub();
        /*
        하나의 인터페이스로 구현한 여러개의 구현체를 인터페이스로
        할당하는 업캐스팅을 이용하면 객체간의 결합을 느슨한 결합으로 만들 수 있다.
        하지만 아직 CafeClient에서는 객체를 new로 생성하여 주입하고 있다.
        new 를 사용하여 객체를 생성하지 않고 주입하려면 Spring을 이용해야 한다.
         */
        MenuController menuController = new MenuController(menuService2);
        List<Menu> menuList = menuController.getMenus();
    }
}
