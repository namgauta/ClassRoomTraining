package com.model;

import com.db.DbConnection;
import com.exception.*;

import java.util.Date;

public final class AccountStatement {
    private final Date firstDate;
    private final int dayCount;
    private final long id;


    public AccountStatement(Date firstDate, int dasyCount, long id) {
        this.firstDate = firstDate;
        this.dayCount = dasyCount;
        this.id = id;
    }

    public Date getFirstDate() {
        return new Date(this.firstDate.getTime());
    }

    public int getDasyCount() {
        return dayCount;
    }

    public long getId() {
        return id;
    }
    public AccountStatement getStatement(DbConnection db)throws InvalidDayCountException,InvalidDateException,InvalidIdException{
        //Validation
        if(this.dayCount>90)
            throw new InvalidDayCountException("invalid day count");
        if(this.firstDate.compareTo(new Date())>0)
            throw new InvalidDateException("invalid date");
        if(this.id<100)
            throw new InvalidIdException("invalid id");

        //Checking for Db connection
        if(db==null){
            throw new InvalidConnectionException("No connection");
        }
        //Commiting changes
        String status=db.save(this);
        if(status.equals("failure"))
            throw new SqlException("Problem with sql syntax");

        return this;


    }
}
