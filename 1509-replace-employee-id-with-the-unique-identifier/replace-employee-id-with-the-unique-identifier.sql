# Write your MySQL query statement below
SELECT unique_id , name FROM Employees E
Left join EmployeeUNI U
ON E.id = U.id;