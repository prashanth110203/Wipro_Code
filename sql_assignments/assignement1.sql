CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(50),
    salary DECIMAL(10,2)
);
INSERT INTO employees (name, department, salary) VALUES
('Ramesh', 'IT', 80000),
('Suresh', 'HR', 60000),
('Mahesh', 'Finance', 90000),
('Ganesh', 'IT', 75000),
('Karthik', 'Sales', 50000),
('Anand', 'Finance', 100000);
SELECT name, salary
FROM employees
WHERE salary > (SELECT AVG(salary) FROM employees)
ORDER BY salary DESC
LIMIT 3;
