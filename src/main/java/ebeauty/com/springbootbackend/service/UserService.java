package ebeauty.com.springbootbackend.service;

import java.util.Date;
import java.util.List;

import ebeauty.com.springbootbackend.model.User;

public interface UserService {
	
	public User findUserById(Long id);
	
	public String screenUserById(Long id);
	
	public User saveUser(User user); // create/update User
	
    public String subscribeToExpert(Long expertId); // subscribe to expert
    
    public String makeAppointment(Long id, Long expertId, Date startTime, Integer duration);
}
