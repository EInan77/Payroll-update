package eren.payroll;

// Fig. 10.9: PayrollSystemTest.java

import java.time.LocalDate;

// Employee hierarchy test program.

public class PayrollSystemTest {
   public static void main(String[] args) {
      // create subclass objects                                          
      SalariedEmployee salariedEmployee =                                 
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00, new Date (12, 23, 1934));    
      HourlyEmployee hourlyEmployee =                                     
         new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40,new Date (04, 07, 1956)) ;  
      CommissionEmployee commissionEmployee =                             
         new CommissionEmployee(                                          
         "Sue", "Jones", "333-33-3333", 10000, .06, new Date (07, 21, 2001));                      
      BasePlusCommissionEmployee basePlusCommissionEmployee =             
         new BasePlusCommissionEmployee(                                  
         "Bob", "Lewis", "444-44-4444", 5000, .04, 300, new Date (07,23,2002));                  

      
      // create four-element Employee array
      Employee[] employees = new Employee[4]; 

      // initialize array with Employees        
      employees[0] = salariedEmployee;          
      employees[1] = hourlyEmployee;            
      employees[2] = commissionEmployee;        
      employees[3] = basePlusCommissionEmployee;

    
      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++) {      
         System.out.printf("Employee %d is a %s%n", j,  
            employees[j].getClass().getName());         
      }   
      
      int currentMonth = LocalDate.now().getMonthValue();
      for (Employee employee : employees) {
      System.out.printf("%n%s%nearnings: $%,.2f%n", employee, employee.earnings());

      if (employee.getbirthdate().getMonth() == currentMonth) {
         System.out.println("It is your birth month, we have added a $100 bonus to your earnings");
         System.out.printf("New earnings: $%,.2f%n", employee.earnings() + 100);
      }
      
      
      
      
      
      
      
   } 
   }
}

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
