package day3hw2;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(1, "Engin", "Demiroð");
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Özcan");
		user2.setLastName("Kara");

		UserManager userManager1 = new UserManager();
		userManager1.login(user1);

		UserManager userManager2 = new UserManager();
		userManager1.logout(user2);
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		Instructor instructor2 = new Instructor();
		instructor2.setFirstName("Kerem");
		instructor2.setLastName("Varýþ");
		
		InstructorManager instructorManager1 = new InstructorManager();
		InstructorManager instructorManager2 = new InstructorManager();
		instructorManager2.addCourse("JAVA & REACT");
		instructorManager1.deleteCourse("C# & ANGULAR");
		
		Student student1 = new Student();
		student1.setFirstName("Özcan");
		student1.setLastName("Kara");
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerCourse("ozcan123@asdsd.com");
		
		
	
	}

}
