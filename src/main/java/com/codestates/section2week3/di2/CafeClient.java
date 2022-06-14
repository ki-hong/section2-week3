package com.codestates.section2week3.di2;

import java.util.List;

public class CafeClient {
    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        /*
        직접 그 클래스 안에서 객체를 생성하지 않고
        다른 클래스에서 객체를 생성한 후 생성한 객체를
        컨트롤러 객체가 생성 시 주입한다.
        --현재는 강하게 결합이 되어있는 상태
        --new 키워드를 사용하여 의존 객체를 생성하면 강하게 결합이 되어
        그 부분을 바꿔야 할 시 모든 클래스의 내용을 다 바꿔주는 상황이 발생된다.
         */
        MenuController menuController = new MenuController(menuService);
        List<Menu> menuList = menuController.getMenus();
    }
}
