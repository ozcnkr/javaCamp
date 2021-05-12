package day5hw1.business.concretes;

import day5hw1.business.abstracts.LoginService;
import day5hw1.business.abstracts.UserService;
import day5hw1.entities.concretes.User;

public class LoginManager implements LoginService{
	
	private UserService userService;
	
	
	public LoginManager(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		this.userService.add(user);
		
	}

	@Override
	public void login(User user) {
		if(!emailControl(user.getEmail()))
		{
			System.out.println("E-posta hatalý, kontrol ediniz.");
		}
		if(!passwordControl(user.getPassword()))
		{
			System.out.println("Þifre hatalý, kontrol ediniz.");
		}
		
	}
	
	public boolean emailControl(String email) {
		for(User user:userService.GetAll()) {
			if(user.getEmail()==email) {
				return true;
		}
		}
		return false;
		
	}
	
	public boolean passwordControl(String password) {
		for(User user:userService.GetAll()) {
			if(user.getPassword()==password) {
				return true;
			}
			
		}
		return false;
		
	}

}
