package day5hw1.business.abstracts;

import java.util.List;

import day5hw1.entities.concretes.User;

public interface UserService {
	void add(User user);
	List<User> GetAll();
}
