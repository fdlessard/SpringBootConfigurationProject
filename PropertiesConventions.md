# Conventions for properties files and properties names

**1.  Start the property name with a prefix indicating the class where the property is used (if used in a single class).**  
  
      SomeClassName.property1= blablabla  
      SomeClassName.property2= blablabla
      ...  
     
     
**2.  Properties used in a class should be defined together in the same file (if used in a single class).**  
  
   Try to avoid this :  
   
   
      property-file.properties 
         SomeClassName.property1= blablabla  
       
      another-property-file.properties    
         SomeClassName.property2= blablabla  
       
       
   Try to do this instead:  
   
      property-file.properties 
         SomeClassName.property1= blablabla 
         SomeClassName.property2= blablabla 
       
     
**3.  Try to group generic error messages in one property file and prefix the name of the property with "message" and subgroups
   (if a message is used in more than one file)**  

  
      message.info.property1= An info message  
      message.info.property2= Another info message  
      ...  
      message.warning.property1= A warning  message  
      ...  
      message.error.property1= An error message  


**4.  Groups should be consecutives in the property key**  

   Try to avoid this:   
      
      SomeClass.notNull.message= blablabla 
      SomeClass.divideByZero.message= blablabla    
 
 
   Try to do this instead:  
      
      SomeClassName.message.notNull= blablabla    
      SomeClassName.message.divideByZero= blablabla    


**5.  Respect the java property file contract (try to keep a simple readable format)**  


      # Simple line format  
      propertyLevel1.propretyLevel2= blablabla    
   
      # Coma separated properties acceptable  
      propertyLevel1.propretyLevel2= blablabla1, blablabla2     
   
   Try to avoid complicated formats. Why ?  
 
     - Difficult to read, confusing,  
     - Difficult to maintain,  
     - Complicates refactoring,  
     - Error prone,  
     - If someone else want's to use one of your properties then they are force to also use SPEL,  
     - Can't be read by core java classes,  you need SPEL or Apache Configuration package,
     - Some IDE have plugins to manipulate properties and may not support complex a property structures,  
     - Not supported by Spring @ConfigurationProperties,  
     - It's uncommon in java,  
     - It's a hack,  
     - ...  
     
     
 

   
   
