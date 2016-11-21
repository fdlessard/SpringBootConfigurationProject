[![Build Status](https://travis-ci.org/fdlessard/SpringBootConfigurationProject.svg)](https://travis-ci.org/fdlessard/SpringBootConfigurationProject)
[![License](http://img.shields.io/:license-mit-blue.svg)](https://github.com/fdlessard/SpringBootConfigurationProject/blob/master/LICENSE)
[![Built with Maven](http://maven.apache.org/images/logos/maven-feather.png)](http://maven.org/)


# SpringBootConfigurationProject

Here we look at 3 different ways to handle files properties in SpringBoot

1. @Value injection (see SomeSortOfServiceImplWithValue class)
2.  @Value Map injection - SPEL hack (see SomeSortOfServiceImplWithValueMap class)
3.  @ConfigurationProperties injection (see SomeSortOfServiceImplWithPropertyObject class)


# Best practices for naming properties

1. Start the property name with a prefix indicating were the property is used (if used in a single file)
   SomeSortOfService.property1=
   SomeSortOfService.property2=
   ...
2. Group generic error messages in one property file and prefix the name of the property with "message"

  message.info.property1 ="An info message"
  message.info.property2 ="Another info message"
  ...
  message.warning.property1 ="A warning  message"
  ...
  message.error.property1 ="An error message"
