package day5hw1.business.concretes;

import day5hw1.business.abstracts.MailService;

public class MailManager implements MailService{

	@Override
	public void sendMail() {
		System.out.println("Do�rulama i�lemlerinin tamamlanmas� i�in t�klay�n�z..");
		
	}

}
