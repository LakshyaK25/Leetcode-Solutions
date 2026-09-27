# Write your MySQL query statement below
Delete p1
FROM Person p1
Join Person p2
ON p1.email = p2.email
where p1.id>p2.id