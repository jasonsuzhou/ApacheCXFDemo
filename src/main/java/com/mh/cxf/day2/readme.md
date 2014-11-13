Study how to use wsdl2java to generate web service client
---
- To download the binary package of apache CXF 
URL: http://www.apache.org/dyn/closer.cgi?path=/cxf/3.0.2/apache-cxf-3.0.2.zip
After download to unzip the file the folder structure will like below:
	+ apache-cxf-3.0.2
		+ bin
		+ docs
		+ etc
		+ lib
		...e.g.
- Based on day1 development, to start the server
The wsdl URL: http://localhost:9000/helloWorld?wsdl
- Goes inside the bin folder and execute below command(MAC OSX)
```
./wsdl2java http://localhost:9000/helloWorld?wsdl
```
- The client java class will be generated in your current folder,
copy the java code to you workspace and write the test code
```
		HelloWorld helloWorld = new HelloWorldService().getHelloWorldPort();
		String result = helloWorld.sayHi("jason");
		System.out.println(result);
```
- The client code I commit to the SpringSecurityHelloWorld project
See at https://github.com/jasonsuzhou/SpringSecurityServletHelloWorld/tree/master/src/main/java/com/mh/cxf/day1

- You can refer below to see more options of the command wsdl2java
http://cxf.apache.org/docs/wsdl-to-java.html
```
-ant 指定要生成一个ant的构建说明文档build.xml。
-client 指定要生成一个测试客户端的“起点代码”（starting point code），其中包含了端口中所有方法的测试样例代码。
-d 指定我们想要把生成的文件放到哪个目录下，默认是wsdl2Java命令所在的目录。
-p 指定生成文件的包名；默认是根据WSDL文件中的命名空间相对应。
```