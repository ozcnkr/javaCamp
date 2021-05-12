package day5hw1;

import day5hw1.business.abstracts.LoginService;
import day5hw1.business.concretes.LoginManager;
import day5hw1.business.concretes.MailManager;
import day5hw1.business.concretes.UserManager;
import day5hw1.core.GoogleAuthAdapter;
import day5hw1.dataAccess.concretes.UserDataDao;
import day5hw1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User kullanici1 = new User(1,"Özcan","Kara","ozcan@gssd.com","1111");
		
		UserManager sanalkullaniciyöneticisi = new UserManager(new UserDataDao(), new MailManager(), new GoogleAuthAdapter());
		LoginService girisyoneticisi = new LoginManager(sanalkullaniciyöneticisi);
		System.out.println("Register Page");
		sanalkullaniciyöneticisi.add(kullanici1);
		System.out.println("Login Page");
		girisyoneticisi.login(kullanici1);
		

	}

}
