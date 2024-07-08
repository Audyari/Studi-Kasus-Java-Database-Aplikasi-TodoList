# Studi-Kasus-Java-Database-Aplikasi-TodoList

mvn archetype:generate

maven-archetype-quickstart

Programmer.Butocakil

studi.kasus.java.database

programmer.butocakil.todolist

##################################

    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter</artifactId>
      <version>5.11.0-M2</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <version>8.0.33</version>
    </dependency>

     <dependency>
            <groupId>com.zaxxer</groupId>
            <artifactId>HikariCP</artifactId>
            <version>5.1.0</version>
     </dependency>

++++++++++++++++++++++++++++++++++++++++++++++++++++++

create database belajar_java_todolist;

CREATE TABLE todolist(
id INT NOT NULL AUTO_INCREMENT,
todo VARCHAR(255) NOT NULL,
PRIMARY KEY (id)
) ENGINE = InnoDB;

SHOW TABLES;

DESC todolist;

++++++++++++++++++++++++++++++++++++++++++++++++++