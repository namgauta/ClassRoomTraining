package com.db;

import com.model.AccountStatement;

public class DbConnection {
    private volatile static DbConnection obj;

    private DbConnection() {}

    public static DbConnection getInstance()
    {
        if (obj == null)
        {

            synchronized (DbConnection.class)
            {
                if (obj==null)
                    obj = new DbConnection();
            }
        }
     //   return obj;
        return  null;
    }
    //custom function to demonstrate failure and success
    public String save(AccountStatement as){
      //  return "success;"//
        return  "failure";
    }
}
