package sk.itsovy.kutka.aopdemo.dao;

import org.springframework.stereotype.Component;

import sk.itsovy.kutka.aopdemo.Account;

@Component
public class AccountDAO {

    public void addAccount(Account account, boolean vipFlag) {

        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");

    }

    public boolean doWork() {
        System.out.println(getClass() + ": Do Something");
        return false;
    }

}

