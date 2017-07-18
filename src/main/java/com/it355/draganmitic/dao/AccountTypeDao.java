package com.it355.draganmitic.dao;

import com.it355.draganmitic.model.AccountType;
import java.util.List;

/**
 * AccountType DAO
 */
public interface AccountTypeDao {
    public List<AccountType> getAllAccountTypes();
    public AccountType getAccountType(Integer id);
    public boolean addAccountType(AccountType user);
    public boolean updateAccountType(AccountType user);
    public boolean removeAccountType(Integer id);
}
