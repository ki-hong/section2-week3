package com.codestates.section2week3.dispring;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

public class CafeClient {
    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        /*
        new 로 해당 객체를 생성하지 않고 Spring의 도움을 받아 Config에 정의해둔
        객체를 의존적으로 주입하였다.
         */
        MenuController menuController = context.getBean(MenuController.class);
        List<Menu> menuList = menuController.getMenus();
    }
}
