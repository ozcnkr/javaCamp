package day5hw1.core;

import day5hw1.business.abstracts.LoginService;
import day5hw1.entities.concretes.User;
import day5hw1.googleAuth.GoogleLogin;

public class GoogleAuthAdapter implements LoginService {

	@Override
	public void register(User user) {
		GoogleLogin googleLogin = new GoogleLogin();
		googleLogin.register(user);
		
	}

	@Override
	public void login(User user) {
		GoogleLogin googleLogin = new GoogleLogin();
		googleLogin.login(user);
		
	}

}
