package day5hw1.business.concretes;

import day5hw1.business.abstracts.MailService;

public class MailManager implements MailService{

	@Override
	public void sendMail() {
		System.out.println("Doğrulama işlemlerinin tamamlanması için tıklayınız..");
		
	}

}
