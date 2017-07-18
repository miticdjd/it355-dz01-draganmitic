package com.it355.draganmitic.service.impl;

import com.it355.draganmitic.dao.AccountTypeDao;
import com.it355.draganmitic.model.AccountType;
import com.it355.draganmitic.service.AccountTypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * AccountTypeServiceImpl
 */
public class AccountTypeServiceImpl implements AccountTypeService {

    @Autowired
    AccountTypeDao accountTypeDao;
    
    @Override
    public List<AccountType> getAllAccountTypes() {
        return accountTypeDao.getAllAccountTypes();
    }

    @Override
    public AccountType getAccountType(Integer id) {
        return accountTypeDao.getAccountType(id);
    }

    @Override
    public boolean addAccountType(AccountType accountType) {
        return accountTypeDao.addAccountType(accountType);
    }

    @Override
    public boolean updateAccountType(AccountType accountType) {
        return accountTypeDao.updateAccountType(accountType);
    }

    @Override
    public boolean removeAccountType(Integer id) {
        return accountTypeDao.removeAccountType(id);
    }
    
}
