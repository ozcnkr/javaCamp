package day3hw2;

public class InstructorManager extends UserManager{
	public void addCourse(String course)
	{
		System.out.println(course + " kursu eklendi");
	}
	
	public void updateCourse(String course)
	{
		System.out.println(course + " kursu güncellendi");
	}
	
	public void deleteCourse(String course)
	{
		System.out.println(course + " kursu silindi");
	}
}
