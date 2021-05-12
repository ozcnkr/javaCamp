package day5hw1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5hw1.dataAccess.abstracts.UserDao;
import day5hw1.entities.concretes.User;

public class UserDataDao implements UserDao{

	List<User> users;
	
	public UserDataDao() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("Kullanýcý eklendi");
		
	}

	@Override
	public void delete(User user) {
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
