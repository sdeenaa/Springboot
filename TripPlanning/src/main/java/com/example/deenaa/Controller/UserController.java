package com.example.deenaa.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.deenaa.Model.UserEntity;
import com.example.deenaa.Service.UserService;

@RestController

public class UserController {

	@Autowired
	UserService us;
	
	
	@PostMapping("addstudent")
	public UserEntity add( @RequestBody UserEntity ue) {
		
		return us.saveInfo(ue);
	}
	@PostMapping("addnstudent")
	public List<UserEntity> addndetails( @RequestBody List<UserEntity> ue) {
		
		return us.savedetails(ue);
	}
	
	
	@GetMapping("showdetails")
	public List<UserEntity> show(){
		return us.showInfo();
	}
	
	//getbyid
	@GetMapping("show/{id}")
	public Optional<UserEntity> showid(@PathVariable int id){
		return us.showbyid(id);
	}
	
	
	@PutMapping("update")
	public UserEntity modify( @RequestBody UserEntity ue) {
		return us.changeInfo(ue);
	}
	
	//updatebyid
	@PutMapping("updateid/{id}")
	public String modifyinfo(@PathVariable int id,@RequestBody UserEntity ue) {
		return us.updateinfo(id, ue);
	}
	
	@DeleteMapping("deletedetails")
	public String del(@RequestBody UserEntity ue) {
		us.deleteinfo(ue);
		return "Deleted";
	}
	
	@DeleteMapping("delid/{id}")
	public void deletemyid(@PathVariable int id) {
		us.deleteId(id);
	}
	
	//?id=1;
	
	
	@DeleteMapping("delparamid")
	public void deleteparamid(@RequestParam int id) {
		us.deletepid(id);
	}		 
	
}
