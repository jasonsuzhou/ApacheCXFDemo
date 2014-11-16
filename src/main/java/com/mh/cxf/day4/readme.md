Async to invoke the web service
---
- There are 2 types async call
	+ Polling approach : will return javax.xml.ws.Response and this Response is inherit from interface javax.util.concurrency.Future
	+ Callback approach : will uses the call back object javax.xml.ws.AsyncHandler, while the remote call finished, CXF will invoke this object
- Based on day1 to save the wsdl to the local workspace
```
ApacheCXFDemo/src/main/java/com/mh/cxf/day4/HelloWorld.wsdl
```

- Specify the async binding template(async_binding.xml)
	+ wsdlLocation : define the wsdl url or location
	+ enableAsyncMapping : set true to enable the async feature
	+ if you only need one inteface to open the async feaure, you can defile the node like below:
		node="wsdl:definitions/wsdl:portType[@name='<service_name>']"
```
<bindings xmlns:xsd="http://www.w3.org/2001/XMLSchema"  
          xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/"  
          wsdlLocation="http://localhost:9000/helloWorld?wsdl"  
          xmlns="http://java.sun.com/xml/ns/jaxws">  
  <bindings node="wsdl:definitions">  
    <enableAsyncMapping>true</enableAsyncMapping>  
  </bindings>  
</bindings>  
```
- wsdl2java to generate he stub java codes
	+ -b parameter is define the extract binding file path
```
./wsdl2java -b /Users/jasonyao/project/workspace_list/biyesheji/ApacheCXFDemo/src/main/java/com/mh/cxf/day4/async_binding.xml -d /Users/jasonyao/project/workspace_list/biyesheji/ApacheCXFDemo/src/main/java/ -p com.mh.cxf.day4 /Users/jasonyao/project/workspace_list/biyesheji/ApacheCXFDemo/src/main/java/com/mh/cxf/day4/HelloWorld.wsdl
```

- MainPolling illustrate the polling approach
- MainCallback illustrate the callback approach


