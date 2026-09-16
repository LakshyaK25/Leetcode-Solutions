# Write your MySQL query statement below
select product_id , year as first_year,quantity , price 
FROM Sales
WHERE (product_id , year) IN (select product_id, MIN(year)
From sales
Group by product_id);