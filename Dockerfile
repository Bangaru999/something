FROM openjdk:17
MAINTAINER dockerspring-2
ADD target/dockerspring-2-0.0.1-SNAPSHOT.jar dockerspring-2-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", dockerspring-2-0.0.1-SNAPSHOT.jar]