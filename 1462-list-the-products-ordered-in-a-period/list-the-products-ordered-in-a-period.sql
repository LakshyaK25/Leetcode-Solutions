# Write your MySQL query statement below
Select product_name , SUM(unit) as unit
FROM Products p
JOIN Orders o
ON p.product_id = o.product_id
WHERE year(order_date) = 2020 and month(order_date)=2
group by p.product_name
Having sum(unit)>99