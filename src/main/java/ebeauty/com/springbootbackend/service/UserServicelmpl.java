package ebeauty.com.springbootbackend.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ebeauty.com.springbootbackend.dao.UserDAO;
import ebeauty.com.springbootbackend.model.User;

@Service
public class UserServicelmpl implements UserService{
	UserDAO userDAO;
	
	@Autowired
	public UserServicelmpl(@Qualifier("userDAOlmpl")UserDAO theUserDAO) {
		userDAO = theUserDAO;
	}

	@Override
	@Transactional
	public User findUserById(Long id) {
		User theUser = userDAO.findUserById(id);
		return theUser;
	}

	@Override
	@Transactional
	public String screenUserById(Long id) {
		User theUser = userDAO.findUserById(id);
		if(theUser != null) {
			return "FOUND";
		}else {
			return "NOT FOUND";
		}
	}

    @Override
	@Transactional
	public User saveUser(User user) {
		return userDAO.saveUser(user);
	}

	@Override
	@Transactional
	public String subscribeToExpert(Long expertId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public String makeAppointment(Long id, Long expertId, Date startTime, Integer duration) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
