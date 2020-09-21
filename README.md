# cision-cicd-java-sample

# Purpose for this code base
This is created to check the CI/CD and pipeline

# Prerequisite for this project build
-> JDK 1.8
-> Maven 
-> Git

# Steps to build the project
-> Clone this project (if first time) : git clone https://github.com/manasmaharana/cision-cicd-java-sample.git
-> Step into the project folder : CD cision-cicd-java-sample
-> Pull all latest code changes : git pull 
-> Build full project : mvn clean install -U
-> Build project without executing Junit test cases : mvn install -DskipTests