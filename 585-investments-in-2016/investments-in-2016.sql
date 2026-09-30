# Write your MySQL query statement below
Select ROUND(SUM(tiv_2016),2) as tiv_2016
From Insurance
WHERE (lat , lon) IN (
    SELECt lat , lon
    FROM Insurance
    Group by lat, lon
    HAVING COUNT(*) = 1
)
AND tiv_2015 IN (
    SELECT tiv_2015
    FROM Insurance
    GROUP BY tiv_2015
    Having COUNT(*) > 1
)