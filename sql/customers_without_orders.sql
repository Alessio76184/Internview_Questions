-- Idea:
--  - Start from all customers
--  - LEFT JOIN to orders on customer_id
--  - Customers with no matching orders will have NULLs on the orders side
  
SELECT
  c.customer_id,
  c.name
FROM <SCHEMA>.Customers c
LEFT JOIN <SCHEMA>.Orders o
  ON c.customer_id = o.customer_id   -- bring in orders (if any) for each customer
WHERE o.order_id IS NULL;            -- keep only those with no orders at all
