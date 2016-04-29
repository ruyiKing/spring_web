package service.impl;

import dao.HelloStringDao;
import service.HelloStringService;

/**
 * Created by fate on 2016/4/27.
 */
public class HelloStringServiceImpl implements HelloStringService{

    @Override
    public void getStrName(String str) {
        HelloStringDao helloStringDao = new HelloStringDao();
        helloStringDao.getStrName(str);
    }
}
