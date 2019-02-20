package com.mani.demo.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.mani.demo.model.UserInformationModel;

public interface UserInformationService {
	
	public UserInformationModel saveUserInformation(UserInformationModel userInformationModel);
	
	public List<UserInformationModel> getListOfUserInformation();
	
	public boolean deleteUserInformation(Long id);
	
	public UserInformationModel updateUserInformation(@RequestBody UserInformationModel userInformationModel);

}
