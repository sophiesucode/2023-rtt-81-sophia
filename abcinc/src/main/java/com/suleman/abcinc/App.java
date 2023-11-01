package com.suleman.abcinc;

import com.suleman.abcinc.service.CustomerService;
import com.suleman.abcinc.service.GenerateDataService;
import com.suleman.abcinc.model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GenerateDataService obj = new GenerateDataService();
        obj.createData();
        
        
        CustomerService obj1 = new CustomerService();
        
        obj1.getAllCustomers();
    }
}
