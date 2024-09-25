-- Task 1. 

SELECT 
    c.CustomerName, SUM(o.OrderAmount) AS TotalSpent
FROM
    Customers c 
JOIN 
    Orders o ON c.CustomerID = o.CustomerID
GROUP BY
     c.CustomerID, c.CustomerName
HAVING
     SUM(o.OrderAmount) > 0;