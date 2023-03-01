-- Creating a database Employee.

 create database Employee;

-- Creating Table Employee_Details.

create table Employee_Details
(
	Emp_id number(4),
	Emp_name varchar2(20),
	Job_name varchar2(20),
	Manager_id number(4),
	Hire_date date,
	Salary number(10),
	Dep_id number(4)
);

-- Inserting data into Employee_Details.

insert into Employee_Details values(123,'Sanjay','Data Analyst',687,'25-aug-97',65000,12);
insert into Employee_Details values(214,'Siddarth','Devoloper',598,'12-apr-94',25000,112);
insert into Employee_Details values(398,'Bhushan','Web Developer',468,'07-may-99',36000,222);
insert into Employee_Details values(435,'Sita Ram','SDE',338,'16-mar-97',49000,2322);
insert into Employee_Details values(579,'Jaswanth','Designer',759,'24-feb-96',75000,2122);
insert into Employee_Details values(667,'Phani Harsha','Designer',827,'07-sep-99',62000,2002);
insert into Employee_Details values(767,'Raj','Product Manager',123,'10-jan-95',34000,22);
insert into Employee_Details values(849,'Sai ram','Devoloper',504,'22-jul-93',56000,212);
insert into Employee_Details values(937,'Tejesh','Devoloper',634,'30-nov-97',49000,595);
insert into Employee_Details values(105,'Rajesh','Manager',901,'16-jun-94',61000,795);

-- Finding the salaries of all the employees from the Employee_Details table.

select Salary from Employee_Details;

-- Finding the unique designations of the employees from the table.

select UNIQUE(Job_name) from Employee_Details;

-- Changing the salary where the emp_name is Raj.

update Employee_Details set Salary=45000 where Emp_name='Raj';