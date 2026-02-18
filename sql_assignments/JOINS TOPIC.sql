use employee_db;
create table employ(
emp_id int,
name varchar(80),
dept_id int
);

insert into employ values(1, 'viany', 101),(2,'sonali',102),(3,'radhya',103);

select * from employ;

create table department(
Dep_Id int,
Dep_Nmae varchar(100)
);

insert into department values(101,'HR'),(102,'IT'),(103, 'Finance');
select * from department;

select employ.name, department.Dep_Nmae
from employ
inner join department
on employ.dept_id = department.Dep_Id;

select employ.name, department.Dep_Nmae
from employ
left join department
on employ.dept_id = department.Dep_Id
UNION
select employ.name, department.Dep_Nmae
from employ
right join department
on employ.dept_id = department.Dep_Id;

select employ.name, department.Dep_Nmae
from employ
full join department
on employ.dept_id = department.Dep_Id;

CREATE TABLE STAFF(
Emp_ID int,
Name varchar(80),
Manager_ID int
);

insert into staff values(1, 'Prashanth', Null),
(2,'Vinay', 1),
(3, 'Sonali',1),
(4, 'Radha', 2);

select * from STAFF;

SELECT A.NAME AS employ, B.name as Manager
from STAFF A
left join STAFF B
on A.Manager_ID= B.Emp_ID;
