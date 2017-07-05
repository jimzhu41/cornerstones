/*
 * @Author : Jim Zhu
 * Date July 4 2017
 * USerLogin DAO Interface
 */
package com.cornerstones.dao;

import java.util.List;

import com.cornerstones.models.UserLogins;



 

public interface UserLoginDAO {

	public List<UserLogins> getUserLogins();
	public UserLogins getUserLoginById(String userLoginId);
    public void updateUserLogin(UserLogins userLogins);
    public UserLogins getUserLoginByEmail(String email);
    public void diableUserLogins(String userLoginId);
    public void addUserLogins(UserLogins userLogins);
    public void deleteUserLogins(String userLoginId);
    public boolean userLoginsExist(String userLoginId);
    
}
