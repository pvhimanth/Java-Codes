package assignment2_inheritance;

class Course {
	private String courseID;
	private String courseName;
	private String instructor;

	public Course(String courseID, String courseName, String instructor) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.instructor = instructor;
	}

	public Course() {
		this("JSF2345", "Java Full Stack", "kshitij");
		System.out.println("CourseID: " + courseID);
		System.out.println("CourseName: " + courseName);
		System.out.println("Instructor: " + instructor);
	}

}

class OnlineCourse extends Course {
	String platform = "offline";

	public OnlineCourse() {
		System.out.println("Platform: " + platform);
	}
}

public class Asg2pgm24 {
	public static void main(String[] args) {
		OnlineCourse oc = new OnlineCourse();
	}
}
