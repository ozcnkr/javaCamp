package day3hw2;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName()+ " " +user.getLastName() + " kullanýcýsý giriþ yaptý.");
	}
	public void logout(User user) {
		System.out.println(user.getFirstName()+ " "+ user.getLastName() + " kullanýcýsý çýkýþ yaptý.");
	}
}
