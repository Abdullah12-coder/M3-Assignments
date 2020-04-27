<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.3.xsd">
		
		
		<bean id="employee" class="Employee">

        <property name="employeeId" value="12345"/>
        <property name="employeeName" value="Harriet"/>
        <property name="businessUnit" value="PES-BU"/>
        <property name="salary" value="40000.0"/>
        <property name="age" value="21"/>
        </bean>

</beans>