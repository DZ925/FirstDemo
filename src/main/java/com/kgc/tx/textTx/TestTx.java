package com.kgc.tx.textTx;

import com.kgc.tx.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestTx {

    @Autowired
    private AccountService service;

    @Test
    public void test1(){

        service.changeAccount("1232121","4324123",1000);
    }


}
