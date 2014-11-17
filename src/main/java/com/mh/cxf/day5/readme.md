Use web container to deploy web service
---
- Add the servlet support inside web.xml
```
	<servlet>
		<servlet-name>CXFServlet</servlet-name>
		<servlet-class>org.apache.cxf.transport.servlet.CXFServlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>CXFServlet</servlet-name>
		<url-pattern>/services/*</url-pattern>
	</servlet-mapping>
```
- Develop the test code HelloWorld & HelloWorldImpl

- Configure the HelloWorldImpl as the developed web service with spring
	+ add spring support inside web.xml
```
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
	
	<context-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>classpath:spring-cxfdemo.xml</param-value>
	</context-param>
```
	+ Define the web service bean inside spring-cxfdemo.xml
```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans" 
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xmlns:jaxws="http://cxf.apache.org/jaxws"
		xsi:schemaLocation="http://cxf.apache.org/jaxws http://cxf.apache.org/schemas/jaxws.xsd 
			http://www.springframework.org/schema/beans 
			http://www.springframework.org/schema/beans/spring-beans.xsd"
>
    <jaxws:endpoint id="cxfDemo" implementor="com.mh.cxf.day5.HelloWorldImpl" address="/ApacheCXFDemo" />
</beans>
```