package com.cornerstones.dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cornerstones.models.UserLogins;
import com.cornerstones.security.models.UserLogin;

@Repository
@Transactional

public class UserLoginsDAOImpl implements UserLoginDAO {

	@PersistenceContext
	EntityManager entityManager;
	List<UserLogins>  userLogins = new ArrayList<UserLogins>();
	@SuppressWarnings("unchecked")
	@Override
	public List<UserLogins> getUserLogins() {
		String query = "From UserLogins";
		this.userLogins = entityManager.createQuery(query).getResultList();
		return userLogins;
	}

	@Override
	public UserLogins getUserLoginById(String userLoginId) {
		
		return entityManager.find(UserLogins.class, userLoginId);
		
	}

	@Override
	public void updateUserLogin(UserLogins userLogins) {
		UserLogins userLogin;
		userLogin = userLogins;
		entityManager.merge(userLogin);

	}

	@Override
	public UserLogins getUserLoginByEmail(String email) {
		
		return getUserLoginById(email);
	}

	@Override
	public void diableUserLogins(String userLoginId) {
		// TODO Auto-generated method stub
		UserLogins userlogin;
		userlogin= getUserLoginById(userLoginId);
		userlogin.setEnabled('N');
		userlogin.setDisabledDateTime(new Date());
        entityManager.flush();

	}

	@Override
	public void addUserLogins(UserLogins userLogins) {
		entityManager.persist(userLogins);

	}

	@Override
	public void deleteUserLogins(String userLoginId) {
		entityManager.remove(getUserLoginByEmail(userLoginId));

	}

	@Override
	public boolean userLoginsExist(String userLoginId) {
		String query="FROM UserLogins WHERE userLoginId=?";
		return (entityManager.createQuery(query).setParameter(1, userLoginId).getResultList().size())>0 ?true:false;
		
	}

}
