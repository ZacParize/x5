FROM registry.gitlab.bcs.ru/bm/devops/images/basejava:java11
ADD service/build/libs/bm-*.jar /app.jar
CMD java $JAVA_MEM $JAVA_EXT -jar /app.jar -Duser.language=ru -Duser.country=RU