# Write your MySQL query statement below
SELECT firstName,lastName,city,state
 FROM Person LEFT JOIN address 
 ON Person.PersonId =address.PersonId
