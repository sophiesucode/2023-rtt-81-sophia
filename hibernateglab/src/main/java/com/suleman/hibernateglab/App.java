package com.suleman.hibernateglab;

import com.suleman.hibernateglab.controller.FindingUser;
import com.suleman.hibernateglab.controller.findUser_Hql;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//      FindingUser obj = new FindingUser();
//       
// obj.findUser(1);
 
 findUser_Hql u= new findUser_Hql();
 
 //u.findUser();
 
 
 //u.findUserSelect();
//u.getRecordById();
//u.getrecords();
 //u.getmaxSalary();
//u.getmaxSalaryGroupBy();
u.NamedQueryExample();
    }
}
