--Select all Customers, show orders for each customer

SELECT * FROM fristone.customers
LEFT OUTER JOIN fristone.orders
    ON customers.cus_id=orders."ord_cus_id"

--Select all Customers, show orders for each customer

SELECT * FROM fristone."orders"
LEFT OUTER JOIN fristone.join_products_orders
    ON "orders"."ord_id"="join_products_orders".jpo_pro_id
LEFT OUTER JOIN "fristone"."products"
  ON "products"."pro_id"=join_products_orders."jpo_ord_id"

--Select all Companies, show employees for each company

SELECT * FROM fristone.company
LEFT OUTER JOIN fristone."employees"
    ON "company".com_id="employees"."emp_com_id"

--Select all Companies, show all addresses for each company

SELECT * FROM "fristone"."company"
LEft OUTER JOIN "fristone"."addresses"
  on "addresses"."add_id"="company"."com_id"

