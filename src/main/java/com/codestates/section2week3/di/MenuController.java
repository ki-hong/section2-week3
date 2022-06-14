package com.codestates.section2week3.di;

import java.util.List;

public class MenuController {
    public static void main(String[] args) {
        /*
        MenuController 는 클라이언트 요청을 받는 endpoint
        MenuService 객체를 생성하여 참조하므로 의존관계가 형성된다.
        MenuService 클래스는 MenuController에 의존한다.
         */
        MenuService menuService = new MenuService();
        List<Menu> menuList = menuService.getMenuList();
    }
}
