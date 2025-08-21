-- Steps:
--  - Join Orders -> OrderDetails -> Products to access unit prices
--  - Recompute the "real" total as SUM(quantity * price) per order
--  - Compare to Orders.total_amount and keep mismatches

SELECT
  o.order_id,
  o.total_amount,                         -- total stored in the Orders table
  SUM(od.quantity * p.price) AS real_amount  -- recomputed total from lines and product prices
FROM <SCHEMA>.Orders o
JOIN <SCHEMA>.OrderDetails od
  ON o.order_id = od.order_id             -- bring in each order's line items
JOIN <SCHEMA>.Products p
  ON od.product_id = p.product_id         -- bring in the unit price
GROUP BY
  o.order_id, o.total_amount
HAVING
  real_amount <> o.total_amount;          -- keep only mismatches
