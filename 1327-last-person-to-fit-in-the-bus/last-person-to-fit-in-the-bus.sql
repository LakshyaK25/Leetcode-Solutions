# Write your MySQL query statement below
SELECT person_name FROM (SELECT person_name, turn , SUM(Weight) over 
(ORDER BY turn) as cum FROM Queue) p1
WHERE cum<= 1000 order by turn DESC LIMIT 1