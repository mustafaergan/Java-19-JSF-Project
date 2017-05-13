package com.vektorel.projetakip.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import com.vektorel.projetakip.dao.DAO;
import com.vektorel.projetakip.entity.UserEntity;
import com.vektorel.projetakip.model.User;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4165989573695827461L;
	
	
	private UserEntity userEntity;
	private boolean kullaniciIcerede = false;
	
	
	@PostConstruct
	public void init(){
		this.userEntity = new UserEntity();
	}
	
	
	public String login(){
		User user = DAO.getInstance().checkUser(this.userEntity);
		if(user == null){
			return "fail.xhtml";
		}
		else{
			this.kullaniciIcerede = true;
			return "guvenli/anasayfa.xhtml?faces-redirect=true";
		}
	}
	
	
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	
	public UserEntity getUserEntity() {
		return userEntity;
	}
	
	public void setKullaniciIcerede(boolean kullaniciIcerede) {
		this.kullaniciIcerede = kullaniciIcerede;
	}
	public boolean isKullaniciIcerede() {
		return kullaniciIcerede;
	}
	
}
