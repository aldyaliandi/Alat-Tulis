/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alattulis.controller;

import alattulis.model.modelLogin;
import alattulis.model.query.queryLogin;

/**
 *
 * @author My PC
 */
public class controllerLogin {
    private queryLogin queryLogin = new  queryLogin();
    
    public String checkLogin(String username, String password){
        return queryLogin.isCorrect(username, password);
    }
    
    public boolean insertLogin(modelLogin data){
        return queryLogin.insertLogin(data);
    }
    
    public boolean updateLogin(modelLogin data){
        return queryLogin.updateLogin(data);
    }
    
    public boolean deleteLogin(String nik){
        return queryLogin.deleteLogin(nik);
    }
}
