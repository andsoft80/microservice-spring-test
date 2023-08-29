   FROM openjdk:20
   COPY /target/*.war /var/www/java/ROOT.war
   WORKDIR /var/www/java
   CMD ["java", "-jar", "ROOT.war"]