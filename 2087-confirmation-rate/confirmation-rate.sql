# Write your MySQL query statement below
Select s.user_id, IFNULL(ROUND(SUM(action = 'confirmed')/COUNT(*),2),0.00) AS confirmation_rate 
From Signups s
LEFT Join Confirmations c
ON s.user_id = c.user_id 
Group by s.user_id;
