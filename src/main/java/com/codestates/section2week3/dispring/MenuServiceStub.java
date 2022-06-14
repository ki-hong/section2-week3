package com.codestates.section2week3.dispring;


import java.util.List;

public class MenuServiceStub implements MenuService {
    @Override
    public List<Menu> getMenuList() {
        return List.of(
                new Menu(1, "아메리카노",2500),
                new Menu(2, "카페라떼", 3000),
                new Menu(3, "바닐라라떼" ,4000)
        );
    }
}
