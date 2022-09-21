create table Worker(
worker_id int not null,
first_name varchar(50) not null,
last_name varchar(50) not null,
salary int not null,
joinig_date varchar(50) not null,
dep varchar(50) not null);




insert into Worker values(001,"Monika","Arora",100000,"02/20/14 9:00:00","HR"),
(002,"Niharika","Verma",80000,"06/11/14 9:00:00","Admin"),
(003,"Vishal","Singhal",300000,"02/20/14 9:00:00","HR"),
(004,"Amitabh","Singh",500000,"02/20/14 9:00:00", "Admin"),
(005,"Vivek","Bhati",500000,"06/11/14 9:00::00","Admin"),
(006,"Vipul","Diwan",200000,"06/11/14 9:00:00","Account"),
(007,"Satish","Kumar",75000,"01/20/14 9:00:00","Account"),
(008,"Geetika","Chauhan",90000,"04/11/14 9:00:00","Admin");

select first_name as WORKER_NAME
from worker;

select upper(first_name) as firstname
from worker;

select distinct dep 
from worker;

select substring(first_name,1,3) 
from worker;

select position("a" in first_name) 
from worker
where first_name="Amitabh";

select RTRIM(first_name)
from worker;

select LTRIM(dep) 
from worker;

select REPLACE(first_name,"a","A") 
from worker;

select CONCAT(first_name,' ',last_name) as complete_name
from worker;

select * from worker
order by first_name asc;

select * from worker
order by first_name asc, dep desc;

select * from worker where first_name in ("Vipul","Satish");

select * from worker where first_name not in ("Vipul","Satish");

select * from worker
where dep="Admin";

select * from worker
where first_name like '%a%';

select * from worker
where first_name like '%a';

select * from worker
where first_name like '______h';

select * from worker
 where salary between 100000 and 500000;
 
 select * from worker
 where joinig_date like '%02%';
 
 select count(*) from worker 
 where dep='Admin';

Select FIRST_NAME,LAST_NAME from Worker 
where SALARY between 50000 and 100000;

Select dep,count(WORKER_ID) as no_of_workers 
from Worker 
group by dep
order by no_of_workers desc;

Select *,count(worker_id) as No_of_workers 
from Worker 
group by dep
having count(worker_id)>1;

Select * from Worker 
where mod(worker_id,2)<>0;



Select * from Worker 
where mod(worker_id,2)=0;



