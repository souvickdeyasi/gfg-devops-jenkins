FROM openjdk:11.0
WORKDIR /gfg/proj
COPY target/my-gfg-area.jar my-gfg-area.jar
CMD java -jar my-gfg-area.jar