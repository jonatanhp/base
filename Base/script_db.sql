CREATE TABLE IF NOT EXISTS parametro (
	id			INTEGER PRIMARY KEY AUTOINCREMENT,
	onza		REAL	NOT NULL,
    porc		REAL	NOT NULL,
	ley			REAL	NOT NULL,
	sistema		REAL	NOT NULL,
	tcambio		REAL	NOT NULL,
	precio_do	REAL	NOT NULL,
	precio_so	REAL	NOT NULL
);

CREATE TABLE IF NOT EXISTS user (
	id		INTEGER PRIMARY KEY AUTOINCREMENT,
	rol		INTEGER	NOT NULL,
    pin		TEXT	NOT NULL
);

CREATE TABLE IF NOT EXISTS caja_aper_cierre (
	id			INTEGER PRIMARY KEY AUTOINCREMENT,
	fecha		datetime	NOT NULL,
    aper_cierre	INTEGER		NOT	NULL,
	saldo_so	REAL			NULL,
	saldo_do	REAL			NULL,
	saldo_so_bancos	REAL		NULL,
	saldo_do_bancos	REAL		NULL,
	gramos		REAL			NULL,
	user		INTEGER			NULL,
	date_created datetime default current_timestamp,
    last_updated datetime default current_timestamp
);


CREATE TABLE IF NOT EXISTS proveedor (
	id			INTEGER PRIMARY KEY AUTOINCREMENT,
	nombres		TEXT	NOT NULL,
    infoadic	TEXT	NULL,
	fecha_nac	datetime	NULL,
	date_created datetime	NULL,
	last_updated datetime default current_timestamp
);

CREATE TABLE IF NOT EXISTS producto (
	id		     INTEGER PRIMARY KEY AUTOINCREMENT,
	nombre	     TEXT	NOT NULL,
	precio 	     TEXT  NOT NULL,
	cantidad        TEXT  NOT NULL,	
     infoadic	     TEXT	NULL,
	fecha_reg	datetime	NULL,
	
);

CREATE TABLE IF NOT EXISTS prove_mov (
	id			INTEGER PRIMARY KEY AUTOINCREMENT,
	fecha		datetime	NOT NULL,
    prove_id	INTEGER		NOT	NULL,
	glosa		TEXT			NULL,
	adelanto_so	REAL			NULL,
	adelanto_do	REAL			NULL,
	debo_so		REAL			NULL,
	debo_do		REAL			NULL,
	user		INTEGER			NULL,
	activo		INTEGER		default 1,
	date_created datetime default current_timestamp,
    last_updated datetime default current_timestamp,
	FOREIGN KEY (prove_id) REFERENCES proveedor (id) 
);

CREATE TABLE IF NOT EXISTS compra (
	id			INTEGER PRIMARY KEY AUTOINCREMENT,
	fecha		datetime	NOT NULL,
    prove_id	INTEGER		NOT	NULL,
	prove_nom	TEXT			NULL,
	cant_gr		REAL		NOT	NULL,
	essoles 	INTEGER		NOT	NULL,
	tipo_cambio	REAL			NULL,
	precio_so	REAL			NULL,
	precio_do	REAL			NULL,
	total_so	REAL			NULL,
	total_do	REAL			NULL,
	total_so_entregado	REAL	NULL,
	total_do_entregado	REAL	NULL,
	user		INTEGER			NULL,
	activo		INTEGER		default 1,
	date_created datetime default current_timestamp,
    last_updated datetime default current_timestamp,
	FOREIGN KEY (prove_id) REFERENCES proveedor (id) 
);



CREATE TABLE IF NOT EXISTS cliente (
	id			INTEGER PRIMARY KEY AUTOINCREMENT,
	nombres		VARCHAR(100)	NOT NULL,
    infoadic	VARCHAR(260)	NULL
);
CREATE TABLE IF NOT EXISTS clie_mov (
	id			INTEGER PRIMARY KEY AUTOINCREMENT,
	fecha		datetime	NOT NULL,
    clie_id		INTEGER		NOT	NULL,
	glosa		TEXT			NULL,
	adelanto_so	REAL			NULL,
	adelanto_do	REAL			NULL,
	debe_so		REAL			NULL,
	debe_do		REAL			NULL,
	user		INTEGER			NULL,
	activo		INTEGER		default 1,
	date_created datetime default current_timestamp,
    last_updated datetime default current_timestamp,
	FOREIGN KEY (clie_id) REFERENCES cliente (id) 
);

CREATE TABLE IF NOT EXISTS venta (
	id			INTEGER PRIMARY KEY AUTOINCREMENT,
	fecha		datetime	NOT NULL,
    clie_id		INTEGER		NOT	NULL,
	clie_nom	TEXT			NULL,
	cant_gr		REAL		NOT	NULL,
	essoles 	INTEGER		NOT	NULL,
	tipo_cambio	REAL			NULL,
	precio_so	REAL			NULL,
	precio_do	REAL			NULL,
	total_so	REAL			NULL,
	total_do	REAL			NULL,
	total_so_recibido	REAL	NULL,
	total_do_recibido	REAL	NULL,
	user		INTEGER			NULL,
	activo		INTEGER		default 1,
	date_created datetime default current_timestamp,
    last_updated datetime default current_timestamp,
	FOREIGN KEY (clie_id) REFERENCES cliente (id) 
);
