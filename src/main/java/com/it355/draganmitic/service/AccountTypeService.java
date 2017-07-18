package com.it355.draganmitic.service;

import com.it355.draganmitic.model.AccountType;
import java.util.List;

/**
 * AccountTypeService
 */
public interface AccountTypeService {
    public List<AccountType> getAllAccountTypes();
    public AccountType getAccountType(Integer id);
    public boolean addAccountType(AccountType accountType);
    public boolean updateAccountType(AccountType accountType);
    public boolean removeAccountType(Integer id);
}
