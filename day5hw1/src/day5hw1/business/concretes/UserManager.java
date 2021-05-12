package day5hw1.business.concretes;

import java.util.List;

import day5hw1.business.abstracts.LoginService;
import day5hw1.business.abstracts.MailService;
import day5hw1.business.abstracts.UserService;
import day5hw1.core.Validation;
import day5hw1.dataAccess.abstracts.UserDao;
import day5hw1.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private MailService mailService;
	private LoginService loginService;

	public UserManager(UserDao userDao, MailService mailService, LoginService loginService) {
		this.userDao = userDao;
		this.mailService = mailService;
		this.loginService = loginService;
	}

	private boolean isEmailExist(String email) {
		for (User user :GetAll()) {
			if (user.getEmail() == email) {
				return true;
			}

		}

		return false;

	}
	
	

	@Override
	public void add(User user) {
			if(user.getFirstName().length()<2 && user.getLastName().length()<2) 
			{
				System.out.println("Ad Soyad alanlar� en az iki karakter olmal�d�r.");
			}
			
			if(!Validation.validateEmail(user.getEmail())) {
				System.out.println("Email adresi ge�ersiz");
				}
			
			if(isEmailExist(user.getEmail()))
			{
				System.out.println("Email sistemde daha �nce kullan�lm��");
			}
			if(user.getPassword().length() <= 5)
			{
				System.out.println("Parola alan� en az 6 karakter olmal�d�r.");
			}
			
			this.userDao.add(user);
			System.out.println("Kay�t i�lemi tamamland� ve hesap bilgileri email adresinize g�nderildi" + user.getEmail());
			this.mailService.sendMail();
			this.loginService.login(user);
			
	}

	@Override
	public List<User> GetAll() {
		// TODO Auto-generated method stub
		 return userDao.getAll();
	}

}		
