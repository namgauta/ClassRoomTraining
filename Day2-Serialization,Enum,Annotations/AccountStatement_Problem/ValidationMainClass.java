package com;

import com.db.DbConnection;
import com.model.AccountStatement;

import java.util.Date;

public class ValidationMainClass {
    public static  void  main(String args[]){

        AccountStatement as=new AccountStatement(new Date(),96,111);
        DbConnection db=DbConnection.getInstance();
        as.getStatement(db);

    }
}
