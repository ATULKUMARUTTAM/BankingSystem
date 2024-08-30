package com.atuluttam.BankingSystem.Repo;


import com.atuluttam.BankingSystem.Model.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class customerRepo {

@Autowired
JdbcTemplate jt;






    public  int save(customer c)
    {
       String sql ="insert into customer(accno, name, balance)values(?,?,?)";
        return jt.update(sql, c.getAccno(),c.getName(), c.getBalance());
    }
}
