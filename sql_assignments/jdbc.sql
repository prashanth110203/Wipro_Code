-- Problem 7: Duplicate Email Detection
-- Table: users
-- Write a query to find email IDs that appear more than once.
create database employeeUser_db;
use employeeUser_db;

SELECT * FROM userrs;
create table userrs (
    user_id INT PRIMARY KEY auto_increment,
    username VARCHAR(50),
    email VARCHAR(100)
);
INSERT INTO userrs (username, email) VALUES
('Prashanth', 'prashanth@gmail.com'),
('Rahul', 'rahul@gmail.com'),
('Ankit', 'ankit@gmail.com'),
('John', 'rahul@gmail.com'),
('Neha', 'neha@gmail.com'),
('David', 'prashanth@gmail.com'),	
('Sara', 'sara@gmail.com');

select * from userrs;
SELECT email, COUNT(*) AS duplicate_count
FROM userrs
GROUP BY email
HAVING COUNT(*) > 1;


CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    name VARCHAR(50),
    joining_date DATE,
    department VARCHAR(50)
);

INSERT INTO employees (name, joining_date, department) VALUES
('Prashanth', '2024-01-15', 'IT'),
('Rahul', '2023-11-10', 'HR'),
('Ankit', '2024-03-20', 'Finance'),
('Neha', '2024-07-05', 'IT'),
('Sara', '2022-09-18', 'HR'),
('John', '2024-10-01', 'Finance'),
('David', '2024-05-12', 'IT');

SELECT * FROM employees WHERE YEAR(joining_date) = 2024 ORDER BY joining_date DESC LIMIT 5;

SELECT department, COUNT(*) AS employee_count
FROM employees
GROUP BY department
HAVING COUNT(*) > 5;

