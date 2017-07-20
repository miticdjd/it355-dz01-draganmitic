package com.it355.draganmitic.controller;

import com.it355.draganmitic.model.Account;
import com.it355.draganmitic.service.AccountService;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    
    @Autowired
    private AccountService accountService;
    
    @RequestMapping(value = "/", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Account>> accounts() {
        List<Account> accounts = accountService.getAllAccounts();
        
        if (accounts.size() == 0) {
            return new ResponseEntity<List<Account>>(HttpStatus.NO_CONTENT);
        }
        
        return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Account> account(@PathVariable(value="id") Integer id) {
        Account account = accountService.getAccount(id);
        
        if (account == null) {
            return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addAccount(@RequestBody Account account) {
        accountService.addAccount(account);
        
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Account> editAccount(@RequestBody Account account, @PathVariable(value="id") Integer id) {
        account.setId(id);
        accountService.updateAccount(account);
        
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> removeAccount(@PathVariable(value="id") Integer id) {
        Account account = accountService.getAccount(id);
        
        if (account == null) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
        
        accountService.removeAccount(id);
        
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
