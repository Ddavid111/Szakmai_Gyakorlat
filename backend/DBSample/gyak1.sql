CREATE DATABASE gyak1;
USE gyak1;
CREATE DATABASE proba25;
use proba25;
SELECT * FROM user_roles;
SELECT * FROM Files;
SELECT * FROM FILES_SEQ;
CREATE TABLE USERS(
id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
email VARCHAR (20) NOT NULL,
password_hash VARCHAR (128),
title INT NOT NULL,
FOREIGN KEY (title) REFERENCES TITLES(id),
first_name VARCHAR (20) NOT NULL,
family_name VARCHAR (20) NOT NULL,
birthday DATE NOT NULL);
DESCRIBE USERS;

CREATE TABLE TITLES(
id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
name VARCHAR (20) NOT NULL);
DESCRIBE TITLES;

select * from files;
select * from users;
SELECT * FROM reviews;
select * from theseses;

Insert into Semesters values (1,2001,3,'miskolc');

CREATE TABLE THESES(
id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
semester_id INT NOT NULL,
FOREIGN KEY (semester_id) REFERENCES SEMESTERS(id),
student_id INT NOT NULL,
FOREIGN KEY (student_id) REFERENCES USERS(id),
supervisor_id INT NOT NULL,
FOREIGN KEY (supervisor_id) REFERENCES USERS(id),
title VARCHAR (20) NOT NULL,
faculty VARCHAR (20) NOT NULL,
department VARCHAR (20) NOT NULL,
speciality VARCHAR (20) NOT NULL,
language VARCHAR (20) NOT NULL,
thesis_pdf_id INT,
FOREIGN KEY (thesis_pdf_id) REFERENCES FILES(id),
supplement_id INT,
FOREIGN KEY (supplement_id) REFERENCES FILES(id),
defense_score INT,
subject_score INT,
final_score INT);
DESCRIBE THESES;

CREATE TABLE REVIEWS(
id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
reviewer_id INT NOT NULL,
FOREIGN KEY (reviewer_id) REFERENCES USERS(id),
thesis_id INT NOT NULL,
FOREIGN KEY (thesis_id) REFERENCES THESES(id),
invitation_date DATE NOT NULL,
score INT,
description VARCHAR (200),
city VARCHAR (20),
is_accepted_invitation BOOLEAN,
response_date DATE,
submission_date DATE);
DESCRIBE REVIEWS;

CREATE TABLE USER_ROLES(
user_id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
FOREIGN KEY (user_id) REFERENCES USERS(id),
role ENUM('hallgato', 'elnok', 'jegyzo', 'biralo', 'temavezeto'));
DESCRIBE USER_ROLES;



CREATE TABLE SEMESTERS(
id INT PRIMARY KEY NOT NULL,
year INT NOT NULL,
month INT NOT NULL,
location VARCHAR (30) NOT NULL);
DESCRIBE SEMESTERS;

CREATE TABLE FILES(
id INT PRIMARY KEY NOT NULL,
name VARCHAR(20) NOT NULL,
upload_time DATE NOT NULL);
DESCRIBE FILES;

insert into user_roles values(0,1);
insert into users values(1,1,"1998-10-25","asd@gmail.com","peter","torok","asdasdas");
insert into titles values(1,"dr");

select * from titles;







