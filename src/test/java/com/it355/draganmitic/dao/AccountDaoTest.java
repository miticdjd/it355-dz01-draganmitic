package com.it355.draganmitic.dao;

import com.it355.draganmitic.dao.impl.AccountDaoImpl;
import com.it355.draganmitic.model.Account;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * AccountDao Test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "file:src/main/webapp/WEB-INF/database.xml",
    "file:src/main/webapp/WEB-INF/DraganMitic-servlet.xml",
})
public class AccountDaoTest {
    
    @Autowired
    private AccountDaoImpl accountDao;
    
    @Autowired
    private ApplicationContext context;
    
    @Test
    public void addAccountTest()
    {
        Account account = new Account();
        account.setAmount(350);
        account.setNumber("123-456-789");
        
        Boolean added = accountDao.addAccount(account);
        Assert.assertTrue(added);
    }
    
    @Test
    public void getAccountTest()
    {
        Account account = accountDao.getAccount(1);
        
        Assert.assertTrue(account instanceof Account);
    }
    
    @Test
    public void getAccountsTest()
    {
        List<Account> account = accountDao.getAllAccounts();
        
        Assert.assertTrue(account instanceof List);
    }
    
    @Test
    public void editAccountTest()
    {
        Account account = accountDao.getAccount(1);
        account.setAmount(450);
        
        Boolean updated = accountDao.updateAccount(account);
        Assert.assertTrue(updated);
    }
    
}
