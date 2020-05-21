CREATE TABLE IF NOT EXISTS Cliente (
	id		INTEGER PRIMARY KEY AUTOINCREMENT,
	Nombes		VARCHAR(100)	NOT NULL,
            Masdatos		VARCHAR(260)	NULL
          
);

CREATE TABLE people (
   person_id INTEGER PRIMARY KEY AUTOINCREMENT,
   first_name text NOT NULL,
   last_name text NOT NULL
);


CREATE TABLE IF NOT EXISTS CATEGORIA (
	Cat_id		INT	AUTO_INCREMENT			NOT NULL,
	Nom_cat		VARCHAR(100)	NOT NULL,
	Fam_id		INT			NOT NULL,
    FOREIGN KEY (Fam_id) REFERENCES FAMILIA (Fam_id) 
    ON UPDATE CASCADE ON DELETE CASCADE,
    PRIMARY KEY (Cat_id)
);
CREATE TABLE IF NOT EXISTS PRODUCTO (
	Prod_id		INT	AUTO_INCREMENT			NOT NULL,
	Cod_prod		VARCHAR(100)	NOT NULL,
    Nom_prod		VARCHAR(100)	NOT NULL,
    Concent			VARCHAR(100)	 NULL,
    Presentac		VARCHAR(100)	 NULL,
    Fracciones		VARCHAR(100)	 NULL,
    Prec_compra		DECIMAL(9,2)	 NULL,
    Prec_venta		DECIMAL(9,2)	 NULL,
	Cat_id		INT			NOT NULL,
    FOREIGN KEY (Cat_id) REFERENCES CATEGORIA (Cat_id) 
    ON UPDATE CASCADE ON DELETE CASCADE,
    PRIMARY KEY (Prod_id)
);

CREATE TABLE IF NOT EXISTS CLIENTE (
	Cli_id		INT	AUTO_INCREMENT			NOT NULL,
	Nom_cli		VARCHAR(100)	NOT NULL,
	PRIMARY KEY (Cli_id)               
);
CREATE TABLE IF NOT EXISTS VENDEDOR (
	Vend_id		INT	AUTO_INCREMENT			NOT NULL,
	Nom_vend	VARCHAR(100)	NOT NULL,
	PRIMARY KEY (Vend_id)               
);