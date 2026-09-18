# Write your MySQL query statement below
SELECT customer_id
from Customer
Group by customer_id
Having count(Distinct product_key) = (
    select count(product_key)
    from product
)