create table Employee1(Name varchar2(20),id int,Role varchar2(20),Salary int);
insert into Employee1 values('Nikitha',67867,'Manager',1500);
insert into Employee1 values('Suvetha',67868,'HR',2000);
insert into Employee1 values('Swathi',67768,'Employee',1000);
insert into Employee1 values('Ram',67811,'Employee',3000);
insert into Employee1 values('Ravi',37868,'CTO',5000);

select * from Employee1 where name LIKE '%a';
select ID from Employee1 where name in 'Nikitha';
select salary from Employee1 where salary between 1000 and 2000;

create table job(id int,Location varchar2(30));
insert into job values(67867,'Coimbatore');
insert into job values(67868,'Chennai');
insert into job values(67768,'Chennai');
insert into job values(67811,'Salem');
insert into job values(37868,'Bangalore');

select*from Employee1;
select*from job;

select Name,Role,Location
from Employee1,job
where Employee1.id=job.id;


select salary as Highest_salary
from Employee1
where salary>3000;

select count(*) name from Employee1;

select Avg(salary) as Average_salary,
max(salary) as Maximum_salary,
min(salary) as Minimun_salary,
sum(salary) as Sum_salary
from Employee1;

select Employee1.Name,Employee1.Role,max(salary) AS Count_Salary
from Employee1 
join job 
on Employee1.id = job.id
group by Employee1.Name,Employee1.Role
order by Employee1.Name;

