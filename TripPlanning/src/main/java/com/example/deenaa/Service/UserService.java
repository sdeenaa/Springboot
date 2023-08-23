package com.example.deenaa.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.deenaa.Model.UserEntity;
import com.example.deenaa.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository ur;
	
	public UserEntity saveInfo(UserEntity ue) {
		return ur.save(ue);
	}
	
	public List<UserEntity> savedetails(List<UserEntity> ue){
		return ur.saveAll(ue);
	}
	
	//getbyid
	public Optional<UserEntity> showbyid(int id){
		
		return ur.findById(id);
	}
	
	public List<UserEntity> showInfo(){
		return ur.findAll();
	}
	
	public UserEntity changeInfo(UserEntity ue) {
		return ur.saveAndFlush(ue);
	}
	
	//update by id
	public String updateinfo(int id,UserEntity ue) {
		
		ur.saveAndFlush(ue);
		if(ur.existsById(id)) {
			return "Updated";
		}
		else {
			return "Enter Valid id";
		}
	}
	
	public void deleteinfo(UserEntity ue) {
		ur.delete(ue);
	}
	
	public void deletepid(int id) {
		ur.deleteById(id);
	}
	
	
	public void deleteId(int id) {
		ur.deleteById(id);
	}
	
}
