# Write your MySQL query statement below
select e.name as employee from employee e join employee as p 
on e.managerId=p.id
where e.salary>p.salary;