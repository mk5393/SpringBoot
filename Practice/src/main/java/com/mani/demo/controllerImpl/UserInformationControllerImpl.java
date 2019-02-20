package com.mani.demo.controllerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mani.demo.controller.UserInformationController;
import com.mani.demo.model.UserInformationModel;
import com.mani.demo.service.UserInformationService;

@Component
public class UserInformationControllerImpl implements UserInformationController{
	@Autowired
	private UserInformationService userInformationService;

	@Override
	public UserInformationModel saveUserInformation(UserInformationModel userInformationModel) {
		UserInformationModel informationModel = null;
		if(null != userInformationModel){
			informationModel = userInformationService.saveUserInformation(userInformationModel);
		}
		return informationModel;
	}

	@Override
	public List<UserInformationModel> getListOfUserInformation() {
		List<UserInformationModel> userInformationModels = null;
		userInformationModels = userInformationService.getListOfUserInformation();
		return userInformationModels;
	}

	@Override
	public boolean deleteUserInformation(Long id) {
		boolean success = false;
		success = userInformationService.deleteUserInformation(id);
		return success;
	}

	@Override
	public UserInformationModel updateUserInformation(UserInformationModel userInformationModel) {
		UserInformationModel informationModel = null;
		informationModel = userInformationService.updateUserInformation(userInformationModel);
		return informationModel;
	}
	
	

}
