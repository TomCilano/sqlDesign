CREATE TABLE company
(
    com_name VARCHAR(155),
    com_dun INTEGER,
    com_id INTEGER PRIMARY KEY NOT NULL
);


CREATE TABLE orders
(
    ord_number INTEGER,
    ord_id INTEGER PRIMARY KEY NOT NULL,
    ord_com_id INTEGER,
    ord_cus_id INTEGER,
    ord_cost NUMERIC,
    ord_delivery DATE,
    ord_date DATE,
    CONSTRAINT orders_company_com_id_fk FOREIGN KEY (ord_com_id) REFERENCES company (com_id)
);
CREATE TABLE products
(
    pro_name VARCHAR(155),
    pro_com_id INTEGER,
    pro_id INTEGER PRIMARY KEY NOT NULL,
    pro_number VARCHAR(155),
    pro_description VARCHAR(155),
    pro_price NUMERIC,
    pro_category VARCHAR(155),
    CONSTRAINT products_company_com_id_fk FOREIGN KEY (pro_com_id) REFERENCES company (com_id)
);

CREATE TABLE addresses
(
    add_name VARCHAR(155),
    add_com_id INTEGER,
    add_emp_id INTEGER,
    add_id INTEGER PRIMARY KEY NOT NULL,
    add_cus_id INTEGER,
    add_phone INTEGER,
    add_firstline VARCHAR(155),
    add_secondline VARCHAR(155),
    add_city VARCHAR(155),
    add_state VARCHAR(155),
    add_zip INTEGER,
    CONSTRAINT addresses_company_com_id_fk FOREIGN KEY (add_com_id) REFERENCES company (com_id),
    CONSTRAINT addresses_employees_emp_id_fk FOREIGN KEY (add_emp_id) REFERENCES employees (emp_id),
    CONSTRAINT addresses_customers_cus_id_fk FOREIGN KEY (add_cus_id) REFERENCES customers (cus_id)
);

CREATE TABLE customers
(
    cus_firstname VARCHAR(155),
    cus_id INTEGER PRIMARY KEY NOT NULL,
    cus_lastname VARCHAR(155),
    cus_email VARCHAR(15)
);

CREATE TABLE employees
(
    emp_com_id INTEGER,
    emp_first VARCHAR(155),
    emp_id INTEGER PRIMARY KEY NOT NULL,
    emp_lastname VARCHAR(155),
    emp_ssn INTEGER,
    CONSTRAINT employees_company_com_id_fk FOREIGN KEY (emp_com_id) REFERENCES company (com_id)
);

CREATE TABLE join_products_orders
(
    jpo_id INTEGER PRIMARY KEY NOT NULL,
    jpo_pro_id INTEGER,
    jpo_ord_id INTEGER,
    CONSTRAINT join_products_orders_products_pro_id_fk FOREIGN KEY (jpo_pro_id) REFERENCES products (pro_id),
    CONSTRAINT join_products_orders_orders_ord_id_fk FOREIGN KEY (jpo_ord_id) REFERENCES orders (ord_id)
);