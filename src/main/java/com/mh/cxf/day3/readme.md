- According to the wsdl file, to use wsdl2java command to generate client java code
```
./wsdl2java -client -d /Users/jasonyao/project/workspace_list/biyesheji/ApacheCXFDemo/src/main/java -p com.mh.cxf.day3 /Users/jasonyao/project/workspace_list/biyesheji/ApacheCXFDemo/src/main/java/com/mh/cxf/day3/HelloWorld.wsdl
+ The -client parameter will generate the client test java code: Gerrter_SoapPort_Client.java
+ The -d specify the where to generate the codes
+ The -p specify the package name of the codes should be use
```

- Add custom parameter via request/response context 
```
//add parameter
Map<String, Object> hmpara = ((BindingProvider)port).getRequestContext();
hmpara.put("key", "value");

//get parameter
Object value = ((BindingProvider)port).getResponseContext().get("key");
```