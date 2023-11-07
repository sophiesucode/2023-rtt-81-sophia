package com.suleman.sms;

import com.suleman.sms.jpa.service.CourseService;
import com.suleman.sms.jpa.service.StudentService;
import com.suleman.sms.jpa.service.GenerateDataService;
import com.suleman.sms.jpa.dao.CourseDao;
import com.suleman.sms.jpa.dao.StudentDao;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        GenerateDataService obj= new GenerateDataService();
//        obj.createData();
        
     CourseDao obj= new CourseService();
     System.out.println(obj.getAllCourses());
        
   //     StudentDao obj = new StudentService();
//      System.out.println(obj.getAllStudents());
        
       // System.out.println(obj.getStudentByEmail("cjaulme9@bing.com"));
       //obj.registerStudentToCourse("cjaulme9@bing.com", 2);
       // obj.registerStudentToCourse("cjaulme9@bing.com", 4);
       //System.out.println(obj.validateStudent("cjaulme9@bing.com", "FnVklVgC6r6"));
       //obj.getStudentCourses("cjaulme9@bing.com");
    }
}
