INSERT INTO fristone.company (com_name, com_dun, com_id) VALUES ('Tyrell Corporation', 12345, 1);


INSERT INTO fristone.orders (ord_number, ord_id, ord_com_id, ord_cus_id, ord_delivery, ord_cost, ord_date)
VALUES (80998, 1, 1, 1, '2016-09-14', 909, '2016-09-23');
INSERT INTO fristone.orders (ord_number, ord_id, ord_com_id, ord_cus_id, ord_delivery, ord_cost, ord_date)
VALUES (90909, 2, 1, 3, '2016-09-30', 323, '2016-09-30');
INSERT INTO fristone.orders (ord_number, ord_id, ord_com_id, ord_cus_id, ord_delivery, ord_cost, ord_date)
VALUES (90393, 3, 1, 2, '2016-10-12', 799, '2016-11-24');


INSERT INTO fristone.products (pro_name, pro_com_id, pro_id, pro_number, pro_description, pro_price, pro_category)
 VALUES ('a spoon', 1, 1, '808', 'a spoonthing', 898, 'spoons');
INSERT INTO fristone.products (pro_name, pro_com_id, pro_id, pro_number, pro_description, pro_price, pro_category)
 VALUES ('a fork', 1, 2, '909', 'a forklike object', 909, 'forks');
INSERT INTO fristone.products (pro_name, pro_com_id, pro_id, pro_number, pro_description, pro_price, pro_category)
VALUES ('a knife', 1, 3, '787', 'a point knife', 787, 'knives');

INSERT INTO fristone.addresses (add_name, add_com_id, add_emp_id, add_id, add_cus_id, add_phone, add_firstline, add_secondline, add_city, add_state, add_zip)
 VALUES ('personone', 1, 1, 1, 1, 888888, 'aPlace', 'aStreet', 'Constatinople', 'Asia minor', 78878);
INSERT INTO fristone.addresses (add_name, add_com_id, add_emp_id, add_id, add_cus_id, add_phone, add_firstline, add_secondline, add_city, add_state, add_zip)
VALUES ('thiusus', 1, 1, 2, 1, 898277366, 'aplace', 'street2', 'somewhere', 'outthere', 89887);
INSERT INTO fristone.addresses (add_name, add_com_id, add_emp_id, add_id, add_cus_id, add_phone, add_firstline, add_secondline, add_city, add_state, add_zip)
VALUES ('aname', 1, 1, 3, 1, 9209029, 'aplace', 'astreet', 'overthere', 'beyond', 90909);

INSERT INTO fristone.customers (cus_firstname, cus_id, cus_lastname, cus_email)
VALUES ('john', 1, 'Guy', 'thisiss');
INSERT INTO fristone.customers (cus_firstname, cus_id, cus_lastname, cus_email)
VALUES ('Tony', 2, 'bologna', 'jdojds');
INSERT INTO fristone.customers (cus_firstname, cus_id, cus_lastname, cus_email)
VALUES ('sally', 3, 'O''Mally', 'djkdjkjd');

INSERT INTO fristone.employees (emp_com_id, emp_first, emp_id, emp_lastname, emp_ssn)
 VALUES (1, 'joe', 1, 'blow', 899899898);
INSERT INTO fristone.employees (emp_com_id, emp_first, emp_id, emp_lastname, emp_ssn)
VALUES (1, 'mike', 2, 'bike', 898765643);
INSERT INTO fristone.employees (emp_com_id, emp_first, emp_id, emp_lastname, emp_ssn)
VALUES (1, 'dennis', 3, 'menace', 898736252);

INSERT INTO fristone.join_products_orders (jpo_id, jpo_pro_id, jpo_ord_id)
 VALUES (1, 1, 1);
INSERT INTO fristone.join_products_orders (jpo_id, jpo_pro_id, jpo_ord_id)
VALUES (2, 1, 1);
INSERT INTO fristone.join_products_orders (jpo_id, jpo_pro_id, jpo_ord_id)
VALUES (3, 1, 1);