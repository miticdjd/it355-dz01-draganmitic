package com.it355.draganmitic.service.impl;

import com.it355.draganmitic.dao.AccountDao;
import com.it355.draganmitic.model.Account;
import com.it355.draganmitic.service.AccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * AccountServiceImpl
 */
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;
    
    @Override
    public List<Account> getAllAccounts() {
        return accountDao.getAllAccounts();
    }

    @Override
    public Account getAccount(Integer id) {
        return accountDao.getAccount(id);
    }

    @Override
    public boolean addAccount(Account account) {
        return accountDao.addAccount(account);
    }

    @Override
    public boolean updateAccount(Account account) {
        return accountDao.updateAccount(account);
    }

    @Override
    public boolean removeAccount(Integer id) {
        return accountDao.removeAccount(id);
    }
    
}
