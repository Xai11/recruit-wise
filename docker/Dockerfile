FROM maven:3.8.4-openjdk-11-slim AS build

WORKDIR /home/project/GitLab_Project/recruitwise

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:11-jdk-slim

WORKDIR /project/Project_Start

COPY --from=build /home/project/GitLab_Project/recruitwise/target/RecruitWise-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "RecruitWise-0.0.1-SNAPSHOT.jar"]
