	# Initial Java project with Spring
Java project with Spring framework and Spring IoC container (Dependency Injection).

## Clone repository

    $ git clone git@github.com:flancer32/sample_java_spring_app.git
    $ cd sample_java_spring_app

## Maven tasks

### Build

    $ mvn clean
    $ mvn package
    $ mvn clean package

### Test

    $ mvn test

HTML report: target/surefire-reports/index.html

### Documentation
    
    $ mvn javadoc:javadoc

Javadoc: target/site/apidocs/index.html

### Deployment

    $ mvn assembly:assembly -DdescriptorId=jar-with-dependencies

## Launch app

    $ java -jar target/sample_java_spring_app-1.0-SNAPSHOT-jar-with-dependencies.jar

console output:

	13:28:12,637 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.groovy]
	13:28:12,637 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
	13:28:12,637 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [jar:file:/C:/Users/Victor/Documents/GitHub/sample_java_spring_app/target/sample_java_spring_app-1.0-SNAPSHOT-jar-with-dependencies.jar!/logback.xml]
	13:28:12,673 |-INFO in ch.qos.logback.core.joran.spi.ConfigurationWatchList@2be94b0f - URL [jar:file:/C:/Users/Victor/Documents/GitHub/sample_java_spring_app/target/sample_java_spring_app-1.0-SNAPSHOT-jar-with-dependencies.jar!/logback.xml] is not of type file
	13:28:12,776 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - debug attribute not set
	13:28:12,797 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
	13:28:12,813 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [STDOUT]
	13:28:12,986 |-WARN in ch.qos.logback.core.ConsoleAppender[STDOUT] - This appender no longer admits a layout as a sub-component, set an encoder instead.
	13:28:12,986 |-WARN in ch.qos.logback.core.ConsoleAppender[STDOUT] - To ensure compatibility, wrapping your layout in LayoutWrappingEncoder.
	13:28:12,986 |-WARN in ch.qos.logback.core.ConsoleAppender[STDOUT] - See also http://logback.qos.ch/codes.html#layoutInsteadOfEncoder for details
	13:28:12,987 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.rolling.RollingFileAppender]
	
	13:28:12,991 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [FILE]
	13:28:13,026 |-INFO in c.q.l.core.rolling.TimeBasedRollingPolicy - No compression will be used
	13:28:13,029 |-INFO in c.q.l.core.rolling.TimeBasedRollingPolicy - Will use the pattern log/ptt.%d{yyyy-MM-dd}.log for the active file
	13:28:13,037 |-INFO in c.q.l.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy - The date pattern is 'yyyy-MM-dd' from file name pattern 'log/ptt.%d{yyyy-MM-dd}.log'.
	13:28:13,037 |-INFO in c.q.l.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy - Roll-over at midnight.
	13:28:13,043 |-INFO in c.q.l.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy - Setting initial period to Fri Mar 20 13:28:13 EET 2015
	13:28:13,046 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
	13:28:13,062 |-INFO in ch.qos.logback.core.rolling.RollingFileAppender[FILE] - Active log file name: log/ptt.2015-03-20.log
	13:28:13,062 |-INFO in ch.qos.logback.core.rolling.RollingFileAppender[FILE] - File property is set to [null]
	13:28:13,065 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to INFO
	13:28:13,066 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [STDOUT] to Logger[ROOT]
	13:28:13,068 |-INFO in ch.qos.logback.classic.joran.action.LoggerAction - Setting level of logger [com.flancer64] to INFO
	13:28:13,068 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [FILE] to Logger[com.flancer64]
	13:28:13,068 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
	13:28:13,070 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@d70c109 - Registering current configuration as safe fallback point
	
	13:28:13.086 [main] INFO  com.flancer32.sample.App - Start
	13:28:13.392 [main] INFO  o.s.c.a.AnnotationConfigApplicationContext - Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@43a25848: startup date [Fri Mar 20 13:28:13 EET 2015]; root of context hierarchy
	Hello World!
	13:28:13.838 [main] INFO  com.flancer32.sample.App - Stop


## Links

* [Maven](http://maven.apache.org/)
* [Maven — автоматизация сборки проекта](http://habrahabr.ru/post/77333/)
* [Apache Maven — основы](http://habrahabr.ru/post/77382/)
* [Spring framework](http://projects.spring.io/spring-framework/)
* [Spring IoC](http://docs.spring.io/spring/docs/current/spring-framework-reference/html/beans.html)