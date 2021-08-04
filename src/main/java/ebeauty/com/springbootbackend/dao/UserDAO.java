package ebeauty.com.springbootbackend.dao;

import java.util.Date;

import ebeauty.com.springbootbackend.model.User;

public interface UserDAO {
	public User findUserById(Long id);
	
	public String creatUser(User user);
	
	public User saveUser(User user); // update User
	
    public String subscribeToExpert(Long expertId); // subscribe to expert
    
    public String makeAppointment(Long id, Long expertId, Date startTime, Integer duration);
}
