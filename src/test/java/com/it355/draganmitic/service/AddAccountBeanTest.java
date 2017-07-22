package com.it355.draganmitic.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * AddAccountBean Test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
    "file:src/main/webapp/WEB-INF/database.xml",
    "file:src/main/webapp/WEB-INF/DraganMitic-servlet.xml",
})
public class AddAccountBeanTest {
    
    @Autowired
    private ApplicationContext context;
    
    @Test
    public void mainTest() {
        
        AddAccountBean addAccountBean = new AddAccountBean();
        addAccountBean.setType("sometype");
        addAccountBean.setAccount("someaccount");
        
        Assert.assertSame("sometype", addAccountBean.getType());
        Assert.assertSame("someaccount", addAccountBean.getAccount());
    }
    
}
