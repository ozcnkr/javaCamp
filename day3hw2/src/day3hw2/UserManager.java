package day3hw2;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName()+ " " +user.getLastName() + " kullan�c�s� giri� yapt�.");
	}
	public void logout(User user) {
		System.out.println(user.getFirstName()+ " "+ user.getLastName() + " kullan�c�s� ��k�� yapt�.");
	}
}
