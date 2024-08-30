package com.atuluttam.BankingSystem.Service;


import com.atuluttam.BankingSystem.Model.customer;
import com.atuluttam.BankingSystem.Repo.customerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class customerService {

    @Autowired
    customerRepo CR;
    public void saveCutsomer(customer c){
        System.out.println(CR.save(c)+" Customer Saved in Database");
    }



}
