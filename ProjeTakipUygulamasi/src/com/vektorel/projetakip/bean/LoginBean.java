package com.vektorel.projetakip.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.vektorel.projetakip.dao.DAO;
import com.vektorel.projetakip.entity.UserEntity;
import com.vektorel.projetakip.model.User;

@ManagedBean
@ViewScoped
public class LoginBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4165989573695827461L;
	
	
	private UserEntity userEntity;
	
	
	@PostConstruct
	public void init(){
		this.userEntity = new UserEntity();
	}
	
	
	public String login(){
		User user = DAO.getInstance().checkUser(this.userEntity);
		if(user == null)
			return "fail.xhtml";
		else
			return "anasayfa.xhtml";
	}
	
	
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	
	public UserEntity getUserEntity() {
		return userEntity;
	}
	
	
}
