package com.kgc.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {


    @Autowired
    private JdbcTemplate template;


    public void getOut(String outAccount, double money) {
        String sql ="update tb_user set money=money-? where card=?";
        template.update(sql,money,outAccount);
    }


    public void getIn(String inAccount, double money) {
        String sql ="update tb_user set money=money+? where card=?";
        template.update(sql,money,inAccount);
    }
}
