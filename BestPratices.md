# Best practices for properties

1. Start the property name with a prefix indicating the class where the property is used (if used in a single class).  
   
   SomeSortOfService.property1=  
   SomeSortOfService.property2=  
   ...  
     
     
2. Properties used in a class should be defined together in the same file (if used in a single class).  

   Try to avoid this :  
   
   
    property-file.properties 
       SomeSortOfService.property1=  
       
    another-property-file.properties 
       SomeSortOfService.property2=   
       
       
   Try to do this instead:  
   
       property-file.properties 
       SomeSortOfService.property1=  
       SomeSortOfService.property2=  
       
     
3. Try to group generic error messages in one property file and prefix the name of the property with "message" and subgroups   
   (if a message is used in more than one file)  


  message.info.property1 ="An info message"  
  message.info.property2 ="Another info message"  
  ...  
  message.warning.property1 ="A warning  message"  
  ...  
  message.error.property1 ="An error message"  
  
4. Respect the java property file contract (try to keep a simple redable format)  


   \# Simple line format  
   propertyLevel1.propretyLevel2=blabla  
   
   \# Coma separated properties acceptable  
   propertyLevel1.propretyLevel2=blabla, blablabla2   
   
 Try to avoid complicated formats. Why ?  
 
     - Difficult to read, confusing,  
     - Difficult to maintain,  
     - Complicates refactoring,  
     - Error prone,  
     - Can't be read by core java class,  
     - Some IDE have plugins to manipulate properties and may not support complex property structures,  
     - Not supported by Spring @ConfigurationProperties,  
     - It's uncommon in java,  
     - It's ugly,  
     - ...  
     
     
 

   
   
