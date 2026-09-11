# Write your MySQL query statement below
SELECT E.name,B.bonus 
from Employee E
Left join Bonus B
ON E.empId = B.empId
Where B.bonus<1000 or B.bonus IS NULL; 