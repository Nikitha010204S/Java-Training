create table Student
    (Name varchar(30),Age int,Regno varchar2(20),Phone_no varchar2(10),DOB varchar2(15),Address varchar2(30));


alter table Student modify Regno varchar2(20) primary key;

create table Marks
(Mark1 int,Mark2 int,Mark3 int,Mark4 int,Mark5 int);

insert into Student values('Nikitha',20,'73772114171','9342213779','1-FEB 2004','Erode');
insert into Student values('Monisha',20,'73772114165','9342282582','5-OCT 20033','Tiruchengode');
insert into Student values('Shaindavi',20,'73772114185','8533282582','15-AUG 2003','Salem');
insert into Student values('Prema',20,'73772114258','7533862582','30- 2003','Coimbatore');

alter table Marks add Regno varchar2(20);

desc Marks;

insert into Marks values(67,89,90,67,89,'73772114171');
insert into Marks values(87,89,100,67,88,'73772114165');
insert into Marks values(77,89,50,67,98,'73772114185');
insert into Marks values(87,89,100,67,88,'73772114258');

select * from Student;
select * from Marks;

select * from Student where name='Monisha';

select * from Student where Name LIKE '%a';

