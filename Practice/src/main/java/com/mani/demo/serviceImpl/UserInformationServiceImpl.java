package com.mani.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mani.demo.dao.UserInformationDao;
import com.mani.demo.model.UserInformationModel;
import com.mani.demo.service.UserInformationService;
@Service
public class UserInformationServiceImpl implements UserInformationService{
	@Autowired
	private UserInformationDao userInformationDao;

	@Override
	public UserInformationModel saveUserInformation(UserInformationModel userInformationModel) {
		UserInformationModel informationModel = null;
		informationModel = userInformationDao.saveUserInformation(userInformationModel);
		return informationModel;
	}

	@Override
	public List<UserInformationModel> getListOfUserInformation() {
		List<UserInformationModel> userInformationModels = null;
		userInformationModels = userInformationDao.getListOfUserInformation();
		return userInformationModels;
	}

	@Override
	public boolean deleteUserInformation(Long id) {
		boolean success = false;
		success = userInformationDao.deleteUserInformation(id);
		return success;
	}

	@Override
	public UserInformationModel updateUserInformation(UserInformationModel userInformationModel) {
		UserInformationModel informationModel = null;
		informationModel = userInformationDao.updateUserInformation(userInformationModel);
		return informationModel;
	}

}
