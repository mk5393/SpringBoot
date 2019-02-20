package com.mani.demo.daoImpl;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mani.demo.dao.UserInformationDao;
import com.mani.demo.model.UserInformationModel;
import com.mani.demo.util.SessionUtil;
@Repository
public class UserInformationDaoImpl implements UserInformationDao{
	@Autowired
	private SessionUtil sessionUtil = null;

	@Override
	public UserInformationModel saveUserInformation(UserInformationModel userInformationModel) {
		Session session =  sessionUtil.getSessionFactory().openSession();
		if(null != session){
			Transaction transaction = session.beginTransaction();
			session.save(userInformationModel);
			transaction.commit();
			session.close();
		}
		return userInformationModel;
	}

	@Override
	public List<UserInformationModel> getListOfUserInformation() {
		List<UserInformationModel> list = null;
		Session session = sessionUtil.getSessionFactory().openSession();
		String hql = "from UserInformationModel";
		Query query = session.createQuery(hql);
		list = query.getResultList();
		return list;
	}

	@Override
	public boolean deleteUserInformation(Long id) {
		boolean success = false;
		Session session = sessionUtil.getSessionFactory().openSession();
		try{
			Transaction tx = session.beginTransaction();
			String hql = "delete from UserInformationModel where id =: id";
			Query query = session.createQuery(hql);
			query.setParameter("id", id);
			int result = query.executeUpdate();
			success = true;
			tx.commit();
			session.close();
		}catch(Exception ex){
			session.close();
		}
		return success;
	}

	@Override
	public UserInformationModel updateUserInformation(UserInformationModel userInformationModel) {
		Session session = sessionUtil.getSessionFactory().openSession();
		try{
			Transaction tx = session.beginTransaction();
			String hql = "update UserInformationModel p set p.emailId =:emailid" + " where p.id =: id";
			Query query = session.createQuery(hql);
			query.setParameter("id", userInformationModel.getId());
			query.setParameter("emailid",userInformationModel.getEmailId());
			int result = query.executeUpdate();
			tx.commit();
			session.close();
		}catch(Exception ex){
			session.close();
		}
		return userInformationModel;
	}
	
	

}
