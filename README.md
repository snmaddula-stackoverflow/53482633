# 53482633

##### Run the `Application.java` as `Spring boot App`

You'll see the below logs:

        .   ____          _            __ _ _
       /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
      ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
       \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
        '  |____| .__|_| |_|_| |_\__, | / / / /
       =========|_|==============|___/=/_/_/_/
       :: Spring Boot ::        (v2.1.0.RELEASE)

      2018-11-26 22:09:46.266  INFO 276 --- [           main] snmaddula.stackoverflow.Application      : Starting Application on INENHALLIM2L3C with PID 276 (C:\Users\narays38\REMITTANCE\53482633\target\classes started by narays38 in C:\Users\narays38\REMITTANCE\53482633)
      2018-11-26 22:09:46.269  INFO 276 --- [           main] snmaddula.stackoverflow.Application      : No active profile set, falling back to default profiles: default
      2018-11-26 22:09:47.429  INFO 276 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
      2018-11-26 22:09:47.448  INFO 276 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
      2018-11-26 22:09:47.448  INFO 276 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/9.0.12
      2018-11-26 22:09:47.457  INFO 276 --- [           main] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [C:\Program Files\Java\jdk1.8.0_181\bin;C:\windows\Sun\Java\bin;C:\windows\system32;C:\windows;C:/Program Files/Java/jdk1.8.0_181/bin/../jre/bin/server;C:/Program Files/Java/jdk1.8.0_181/bin/../jre/bin;C:/Program Files/Java/jdk1.8.0_181/bin/../jre/lib/amd64;C:\windows\system32;C:\windows;C:\windows\System32\Wbem;C:\windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Common Files\EMC\;C:\Program Files\Git\cmd;C:\Users\narays38\AppData\Roaming\Cloud Foundry;C:\Users\narays38\Toolbox\maven-3.5.4\bin;C:\Program Files\Java\jdk1.8.0_181\bin;C:\Program Files\Dell\Dell Data Protection\Encryption\;C:\Users\narays38\Toolbox\sonarqube-6.7.5\bin\windows-x86-64;C:\Program Files\nodejs\;C:\ProgramData\chocolatey\bin;C:\Users\narays38\AppData\Local\Programs\Python\Python37-32\Scripts\;C:\Users\narays38\AppData\Local\Programs\Python\Python37-32\;C:\Users\narays38\AppData\Local\Microsoft\WindowsApps;C:\Users\narays38\AppData\Roaming\npm;C:\Program Files (x86)\Bitvise SSH Client;C:\Users\narays38\AppData\Local\atom\bin;C:\Users\narays38\Toolbox\hawk;C:\Users\narays38\AppData\Roaming\npm\safaribooks-downloader;;C:\Users\narays38\Toolbox\sts-3.9.6.RELEASE;;.]
      2018-11-26 22:09:47.566  INFO 276 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
      2018-11-26 22:09:47.566  INFO 276 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1248 ms
      2018-11-26 22:09:47.589  INFO 276 --- [           main] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcherServlet mapped to [/]
      2018-11-26 22:09:47.592  INFO 276 --- [           main] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
      2018-11-26 22:09:47.592  INFO 276 --- [           main] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
      2018-11-26 22:09:47.593  INFO 276 --- [           main] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'formContentFilter' to: [/*]
      2018-11-26 22:09:47.593  INFO 276 --- [           main] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
      2018-11-26 22:09:47.741  INFO 276 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
      2018-11-26 22:09:47.923  INFO 276 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
      2018-11-26 22:09:47.926  INFO 276 --- [           main] snmaddula.stackoverflow.Application      : Started Application in 1.99 seconds (JVM running for 2.897)
      2018-11-26 22:10:03.538  INFO 276 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
      2018-11-26 22:10:03.538  INFO 276 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
      2018-11-26 22:10:03.542  INFO 276 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 4 ms
      
      
Now just visit the url : http://localhost:8080/hsm/check

It will give the below output:

    ip=127.0.0.1
    port=3001
    name=TestHsm
    timeout=10000
    provider=software

