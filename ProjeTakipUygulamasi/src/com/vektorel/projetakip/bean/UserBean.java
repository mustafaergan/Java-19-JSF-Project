package com.vektorel.projetakip.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.projetakip.dao.DAO;
import com.vektorel.projetakip.model.User;

@ManagedBean
@SessionScoped
public class UserBean {

	List<User> userList;
	User userAdd;
	
	@PostConstruct
	public void init(){
		this.userList =  DAO.getInstance().getUserList();
	}
	
	public void addUserFonk(){
		DAO.getInstance().addUser(this.userAdd);
	}
	
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	public List<User> getUserList() {
		return userList;
	}
	
	public void setUserAdd(User userAdd) {
		this.userAdd = userAdd;
	}
	
	public User getUserAdd() {
		return userAdd;
	}
	
	
}
