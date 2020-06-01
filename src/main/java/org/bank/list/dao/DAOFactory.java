package org.bank.list.dao;

import org.bank.list.dao.impl.AccountDAOImpl;
import org.bank.list.model.Account;
import org.bank.list.model.User;

import java.util.List;

public class DAOFactory {

    private static DAOFactory instance = new DAOFactory();

    private final AccountDAO  accountDAO= new AccountDAOImpl() ;

    private DAOFactory() {
    }


    public AccountDAO getAccountDAO() {
        return accountDAO;
    }

    public static DAOFactory getInstance() {
        return instance;
    }

}