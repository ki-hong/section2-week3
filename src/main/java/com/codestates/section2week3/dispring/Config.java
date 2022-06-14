package com.codestates.section2week3.dispring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = CafeClient.class)
public class Config {

    @Bean
    public  MenuService getMenuService(){
        return new MenuServiceImpl();
    }

    @Bean
    public MenuController geMenuController(MenuService menuService){
        return new MenuController(menuService);
    }



}



