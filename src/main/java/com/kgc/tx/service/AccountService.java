package com.kgc.tx.service;

import com.kgc.tx.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional //添加事务管理
public class AccountService {

    @Autowired
    private AccountDao dao;
    //转账
    public void changeAccount(String outAccount,String inAccount,double money){
        dao.getOut(outAccount,money);
        //int i=1/0;
        dao.getIn(inAccount,money);

    }



}
