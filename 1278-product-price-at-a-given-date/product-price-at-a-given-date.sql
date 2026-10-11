# Write your MySQL query statement below
Select product_id , new_price as price
FROM Products
WHERE(product_id , change_date) IN
(
    Select product_id , MAX(change_date)
    FROM products
    WHERE change_date <='2019-08-16'
    GROUP BY product_id
)
union

select product_id , 10 AS price
FROM products
where product_id NOT IN
(
    select product_id
    FROM products
    where change_date <= '2019-08-16'
)