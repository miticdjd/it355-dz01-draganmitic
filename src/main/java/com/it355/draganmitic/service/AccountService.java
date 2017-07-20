package com.it355.draganmitic.service;

import com.it355.draganmitic.model.Account;
import java.util.List;

/**
 * AccountService
 */
public interface AccountService {
    public List<Account> getAllAccounts();
    public Account getAccount(Integer id);
    public boolean addAccount(Account account);
    public boolean updateAccount(Account account);
    public boolean removeAccount(Integer id);
}
