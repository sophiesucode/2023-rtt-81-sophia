package com.suleman.department;

import com.suleman.department.controller.DepartmentService;
import com.suleman.department.model.Department;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     DepartmentService obj= new DepartmentService();
     

//
//Department deptFour = new Department();
//deptFour.setName("Education");
//deptFour.setState("California");
     
   

   
Department deptNine = new Department();
deptNine.setName("Advertising");
deptNine.setState("Texas");
     
obj.createDepartment(deptNine);

     //obj.deleteDepartment(2);
   //obj.findDepartment(10);
     
    // obj.updateDepartment();
    }
}
