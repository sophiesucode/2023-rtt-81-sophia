package jpa.mainrunner;
import com.suleman.sms.jpa.dao.StudentDao;
import com.suleman.sms.jpa.service.StudentService;
import java.util.Scanner;
import com.suleman.sms.jpa.dao.CourseDao;
import com.suleman.sms.jpa.service.CourseService;
public class SMSRunner {
public static void main(String[] args) {
	
	StudentDao obj= new StudentService();
	CourseDao obj1= new CourseService();
	Scanner scan= new Scanner(System.in);
	
	System.out.println("Are you a(n):");
	System.out.println(" ");
	System.out.println("1.Student");
	System.out.println("2.quit");
	int userType=scan.nextInt();
	if(userType==1) {

	System.out.println("Please enter email:");
	
	String email= scan.next();
	
	System.out.println("Please enter your password");
	
	String password=scan.next();
//check if student and email are valid
if(obj.validateStudent(email, password)) {
	System.out.println("My classes: ");
	System.out.println(obj.getStudentCourses(email));
	System.out.println("");

	
	System.out.println("Please select an option: ");
	
	System.out.println("1.)Register to CLasses");
	System.out.println("2.)Logout");
	
	int option= scan.nextInt();
	
	if(option==1) {
		
		System.out.println("Which Course, please enter course id?");
		System.out.println(obj1.getAllCourses());
		System.out.println(" ");
		System.out.println("Which Course, please enter course id?");
		option= scan.nextInt();
		
		obj.registerStudentToCourse(email, option);
		
		System.out.println("My Current Classes: ");
		System.out.println(obj.getStudentCourses(email));
	}else if(option==2) {
		System.out.println("You have been signed out");
		System.exit(0); 
	}
}else{
	System.out.println("No record found, please register as a student");
}
	}else {
		System.out.println("...Session closed");
		System.exit(0); 
	}




}
}
