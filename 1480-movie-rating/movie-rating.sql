# Write your MySQL query statement below
(SELECT name as results
FROM Users
INNER JOIN MovieRating using(user_id)
Group by user_id
ORDER BY COUNT(rating) DESC , name
LIMIT 1)
UNION ALL
(SELECT title as results
FROM Movies
INNER JOIN MovieRating using (movie_id)
Where MONTH(created_at) = '02' AND YEAR(created_at) = '2020'
Group by title
order by AVG(rating) DESC, title
Limit 1)