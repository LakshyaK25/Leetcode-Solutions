# Write your MySQL query statement below
SELECT distinct visited_on , SUM(amount) over w as amount,
ROUND((sum(amount) over w )/7,2) as average_amount
FROM Customer
Window w AS (
    order by visited_on
    range between interval 6 day PRECEDING and current row
)
LIMIT 6,999