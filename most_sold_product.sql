SELECT
  od.product_id,                -- the product identifier from order lines
  p.name,                       -- the product name
  SUM(od.quantity) AS total_quantity  -- total units sold for this product
FROM <SCHEMA>.OrderDetails od
JOIN <SCHEMA>.Products p
  ON od.product_id = p.product_id     -- match each order line to its product
GROUP BY
  od.product_id, p.name                -- aggregate totals per product
ORDER BY
  total_quantity DESC                  -- highest-selling first
