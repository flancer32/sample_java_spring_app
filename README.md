# sample_java_spring_app
Initial java project with Spring.

Launching from cmd:

	$ mvn clean install
	$ mvn assembly:assembly -DdescriptorId=jar-with-dependencies "-Dmaven.test.skip=true"
    $ java -jar target/sample_java_spring_app-1.0-SNAPSHOT-jar-with-dependencies.jar