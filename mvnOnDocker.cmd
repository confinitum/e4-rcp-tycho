rem use $(pwd) on linux instead of %cd%
docker run -it --rm --name my-project -v %cd%:/root -w /root adoptopenjdk/maven-openjdk11:latest mvn clean verify