# Write your MySQL query statement below
SELECT sell_date, COUNT(DISTINCT product) AS num_sold , 
group_concat(distinct product order by product) as products
From Activities
Group by sell_date
Order by sell_date,product