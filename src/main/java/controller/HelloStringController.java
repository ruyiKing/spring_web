package controller;

import service.HelloStringService;
import service.impl.HelloStringServiceImpl;

/**
 * Created by fate on 2016/4/27.
 */
public class HelloStringController {

    public static void main(String args[]){

        HelloStringService helloStringService = new HelloStringServiceImpl();
        helloStringService.getStrName("Hello Spring");

    }

}
