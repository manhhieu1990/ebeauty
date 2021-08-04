package ebeauty.com.springbootbackend.dao;

import java.util.Date;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ebeauty.com.springbootbackend.model.User;

@Repository
public class UserDAOlmpl implements UserDAO{
	private EntityManager entityManager;

	@Autowired
	public UserDAOlmpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public User findUserById(Long id) {
		User theUser = entityManager.find(User.class, id);
		return theUser;
	}

    @Override
	public User saveUser(User theUser) {
		User dbUser = entityManager.merge(theUser);
		theUser.setId(dbUser.getId());
		return theUser;
	}

	@Override
	public String subscribeToExpert(Long expertId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String makeAppointment(Long id, Long expertId, Date startTime, Integer duration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String creatUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
