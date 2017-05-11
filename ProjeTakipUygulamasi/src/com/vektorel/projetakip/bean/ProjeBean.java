package com.vektorel.projetakip.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.vektorel.projetakip.dao.DAO;
import com.vektorel.projetakip.model.Durum;
import com.vektorel.projetakip.model.Proje;

@ManagedBean
@SessionScoped
public class ProjeBean {

	private Proje projeAdd;
	private Durum selectedDurum;
	String selectedDurumString;
	private List<Durum> durumList;
	
	@PostConstruct
	public void init(){
		this.projeAdd = new Proje();
		this.durumList = DAO.getInstance().getDurumList();
	}
	
	public void addProjeFonk(){
		System.out.println("****");
		System.out.println(selectedDurum.getDurum());
		System.out.println(selectedDurum.getId());
		System.out.println("****");
	}
	
	public void setProjeAdd(Proje projeAdd) {
		this.projeAdd = projeAdd;
	}
	
	public Proje getProjeAdd() {
		return projeAdd;
	}
	
	public void setDurumList(List<Durum> durumList) {
		this.durumList = durumList;
	}
	
	public List<Durum> getDurumList() {
		return durumList;
	}
	
	public void setSelectedDurum(Durum selectedDurum) {
		this.selectedDurum = selectedDurum;
	}
	
	public Durum getSelectedDurum() {
		return selectedDurum;
	}
	
	public void setSelectedDurumString(String selectedDurumString) {
		this.selectedDurumString = selectedDurumString;
	}
	
	public String getSelectedDurumString() {
		return selectedDurumString;
	}
	
}
