/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alattulis.model.interfaces;

import alattulis.model.modelLogin;

/**
 *
 * @author My PC
 */
public interface InterfaceLogin {
    public String isCorrect(String username, String password);
    public boolean insertLogin(modelLogin data);
    public boolean updateLogin(modelLogin data);
    public boolean deleteLogin(String nik);
}
