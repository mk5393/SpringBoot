package com.mani.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mani.demo.model.UserInformationModel;

@RestController
@RequestMapping(value="/userinformation")
public interface UserInformationController {
	
	@PostMapping(value="/save")
	//@RequestMapping(value="/save", method=RequestMethod.POST)
	public UserInformationModel saveUserInformation(@RequestBody UserInformationModel userInformationModel);
	
	@GetMapping(value="/list")
	//@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<UserInformationModel> getListOfUserInformation();
	
	@DeleteMapping(value="/delete/{id}")
	//@RequestMapping(value="/delete{id}", method=RequestMethod.DELETE)
	public boolean deleteUserInformation(@PathVariable("id") Long id);
	
	@PutMapping(value="/update")
	//@RequestMapping(value="/update", method=RequestMethod.PUT)
	public UserInformationModel updateUserInformation(@RequestBody UserInformationModel userInformationModel);

}
