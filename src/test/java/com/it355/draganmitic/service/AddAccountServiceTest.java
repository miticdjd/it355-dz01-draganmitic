package com.it355.draganmitic.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * AddAccountService Test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "file:src/main/webapp/WEB-INF/database.xml",
    "file:src/main/webapp/WEB-INF/DraganMitic-servlet.xml",
})
public class AddAccountServiceTest {
    
    @Autowired
    private ApplicationContext context;
    
    @Autowired
    private AddAccountService accountService;
    
    @Test
    public void validBankAccountTest()
    {
        Boolean valid = accountService.isValidBankAccount("123-346-789");
        
        Assert.assertTrue(valid);
    }
    
    @Test
    public void notValidBankAccountTest()
    {
        Boolean valid = accountService.isValidBankAccount("123-dragan-789");
        
        Assert.assertFalse(valid);
    }
    
    @Test
    public void validEmailTest()
    {
        Boolean valid = accountService.isValidEmailAddress("dragan.mitic.2334@metropolitan.ac.rs");
        
        Assert.assertTrue(valid);
    }
    
    @Test
    public void notValidEmailTest()
    {
        Boolean valid = accountService.isValidEmailAddress("dfasfsdfs");
        
        Assert.assertFalse(valid);
    }
    
    @Test
    public void validatePaypalAccountTest()
    {
        AddAccountBean accountBean = new AddAccountBean();
        accountBean.setType("paypal");
        accountBean.setAccount("dragan.mitic.2334@metropolitan.ac.rs");
        
        String valid = accountService.validateAccount(accountBean);
        
        Assert.assertSame("true", valid);
    }
    
    @Test
    public void validateBankAccountTest()
    {
        AddAccountBean accountBean = new AddAccountBean();
        accountBean.setType("bank");
        accountBean.setAccount("123-456-789");
        
        String valid = accountService.validateAccount(accountBean);
        
        Assert.assertSame("true", valid);
    }
    
    @Test
    public void nonValidAccountTypeTest()
    {
        AddAccountBean accountBean = new AddAccountBean();
        accountBean.setType("something");
        accountBean.setAccount("123-456-789");
        
        String valid = accountService.validateAccount(accountBean);
        
        Assert.assertSame("false", valid);
    }
    
}
