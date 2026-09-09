# Write your MySQL query statement below
SELECT DISTINCT author_id as id
From views
WHERE author_id = viewer_id Order by id;