Here are the steps to create, test and deploy a Flex BlazeDS Application in Tomcat Server. 
Also there are steps to install the Blaze Monster Java classes to check the Java Exposed Remote Objects

Structure of a BlazeDS Project:
	
	{ProjectName}
		{flex_src}
		{flex_build (bin-debug)}
		{flex_release_build (bin-release)}
		{java_src}
		{java_build}
			{java_build/classes}
		
		WebContent
			{flex history folder, js files, html wrappers, swf files, blazemonster jsp file}
			META-INF
			WEB-INF
				flex {flex blazeds config files, services-config, remoting-config...}
				classes {server side compiled classes, blaze monster compiled class}
				lib {flex, java library, jars }
				web.xml
		


All the flex source files go in SampleSpringBlazeDS/flex_src
All the flex source files go in SampleSpringBlazeDS/bin-debug folder
All the Java Source files go in SampleSpringBlazeDS/java_src
All the Java Build class files go in SampleSpringBlazeDS/build/classes
All the contents of war file is from folder WebContent.
Flex Compiled swf and the wrapper html files are right under the root of WebContent folder.
You'll need to copy the contents (history folder, AC_OETags.js file, html wrapper files and its corresponding swf files) from bin-debug
	to WebContent root folder.
	
Inside WEB-INF:

The WEB-INF most important file is web.xml
	- This gets loaded by the server container.. which inturn loads the very first servlet MessageBroker Servlet.
	- The MessageBrokerServlet loads the flex services-config file, which inturn loads the other config files.
If you are logging log4j.properties file, it will be in WEB-INF root.
Download and extract BlazeDS.war from net.
You should see 2 folders (flex and classes) in WEB-INF folder of the extracted BlazeDS war.
Copy and replace BlazeDS META-INF and WEB-INF folders from downloaded BlazeDS war into the WebContent folder. 
All the application libraries will go in SampleSpringBlazeDS/WeBContent/WEB-INF/lib/
	This contains all BlazeDS, AMF , logging , Java libraries, etc..
The compiled java classes from folder {java_build/classes} are moved to WEB-INF/classes folder with proper package name folder structure.

Installing Blaze Monster.

You will need com.adobe.services.RemotingServiceBrowser.class and invokeremotingservicebrowser.jsp
You can get this from net on sujit reddy blog
Copy the com.adobe.services.RemotingServiceBrowser.class to WEB-INF classes folder and invokeremotingservicebrowser.jsp to root of WebContent.

Double click on tomcat server. go to Modules (from bottom left tab of the tomcat configuration page)
Add this projects module to tomcat server. take a note of web context path for this module.
go to browser and test it.
 
//getDestinations
http://localhost:8080/SampleSpringBlazeDs/invokeremotingservicebrowser.jsp?operationName=getDestinations

//getpropertiesforclasses
http://localhost:8080/SampleSpringBlazeDs/invokeremotingservicebrowser.jsp?operationName=getpropertiesforclasses&classNames=com.n2s.blazeds.sample.PersonService

//getmethodsforclasses
http://localhost:8080/SampleSpringBlazeDs/invokeremotingservicebrowser.jsp?operationName=getmethodsforclasses&classNames=com.n2s.blazeds.sample.PersonService
 

 