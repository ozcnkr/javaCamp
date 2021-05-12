package day5hw1.business.abstracts;

import day5hw1.entities.concretes.User;

public interface LoginService {
	void register(User user);
	void login(User user);
}
