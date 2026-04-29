-- Write your query below
select c.name from customers c  
where c.id NOT IN (select customer_id from orders);