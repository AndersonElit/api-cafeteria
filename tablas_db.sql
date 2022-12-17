
-- public.categorias definition

-- Drop table

-- DROP TABLE public.categorias;

CREATE TABLE public.categorias (
	id serial4 NOT NULL,
	categoria varchar NULL,
	CONSTRAINT categorias_pkey PRIMARY KEY (id)
);

INSERT INTO public.categorias (categoria) VALUES('BEBIDAS');
INSERT INTO public.categorias (categoria) VALUES('PANES');
commit;

-- public.productos definition

-- Drop table

-- DROP TABLE public.productos;

CREATE TABLE public.productos (
	id serial4 NOT NULL,
	nombre varchar NULL,
	referencia varchar NULL,
	precio int4 NULL,
	peso int4 NULL,
	id_categoria int4 NOT NULL,
	stock int4 NULL,
	fecha_creacion date NULL,
	CONSTRAINT productos_pkey PRIMARY KEY (id),
	CONSTRAINT unique_reference UNIQUE (referencia)
);


-- public.productos foreign keys

ALTER TABLE public.productos ADD CONSTRAINT fk_categorias FOREIGN KEY (id_categoria) REFERENCES public.categorias(id);

INSERT INTO public.productos (nombre, referencia, precio, peso, id_categoria, stock, fecha_creacion) VALUES('COCA-COLA', '1112', 2000, 10, 1, 1000, '2022-12-17');
INSERT INTO public.productos (nombre, referencia, precio, peso, id_categoria, stock, fecha_creacion) VALUES('CAFE', '1113', 2000, 10, 1, 1000, '2022-12-17');
INSERT INTO public.productos (nombre, referencia, precio, peso, id_categoria, stock, fecha_creacion) VALUES('AGUA', '1116', 2000, 10, 1, 1000, '2022-12-17');
INSERT INTO public.productos (nombre, referencia, precio, peso, id_categoria, stock, fecha_creacion) VALUES('RON', '1118', 3000, 15, 1, 1000, '2022-12-17');
INSERT INTO public.productos (nombre, referencia, precio, peso, id_categoria, stock, fecha_creacion) VALUES('CERVEZA', '1119', 2500, 10, 1, 1000, '2022-12-17');
INSERT INTO public.productos (nombre, referencia, precio, peso, id_categoria, stock, fecha_creacion) VALUES('CHURRO', '2222', 2500, 10, 2, 1200, '2022-12-17');
INSERT INTO public.productos (nombre, referencia, precio, peso, id_categoria, stock, fecha_creacion) VALUES('GASEOSA', '1111', 2000, 10, 1, 116, '2022-12-17');
INSERT INTO public.productos (nombre, referencia, precio, peso, id_categoria, stock, fecha_creacion) VALUES('TE', '1117', 3000, 15, 1, 317, '2022-12-17');
INSERT INTO public.productos (nombre, referencia, precio, peso, id_categoria, stock, fecha_creacion) VALUES('POLA', '1115', 2000, 10, 1, 669, '2022-12-17');
commit;

-- public.ventas definition

-- Drop table

-- DROP TABLE public.ventas;

CREATE TABLE public.ventas (
	orden varchar NOT NULL,
	id_producto int4 NOT NULL,
	unidades_vendidas int4 NULL,
	CONSTRAINT pk_detalles_ventas PRIMARY KEY (orden, id_producto)
);


-- public.ventas foreign keys

ALTER TABLE public.ventas ADD CONSTRAINT fk_ventas_producto FOREIGN KEY (id_producto) REFERENCES public.productos(id);

INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('490aca11-a6c8-44c9-98ba-427627c9f598', 7, 100);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('490aca11-a6c8-44c9-98ba-427627c9f598', 14, 200);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('3b6965bb-f075-4a45-b687-5db2eddc8895', 7, 300);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('3b6965bb-f075-4a45-b687-5db2eddc8895', 14, 200);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('557a3ffc-ba50-45df-814b-a8b2bda48db1', 7, 300);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('557a3ffc-ba50-45df-814b-a8b2bda48db1', 14, 200);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('557a3ffc-ba50-45df-814b-a8b2bda48db1', 12, 200);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('ba762075-0407-41e8-ab1c-0efcdb2ef508', 7, 15);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('ba762075-0407-41e8-ab1c-0efcdb2ef508', 14, 20);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('ba762075-0407-41e8-ab1c-0efcdb2ef508', 12, 35);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('00fdbf47-1cf8-4a89-bcae-a4255671c1c8', 7, 23);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('00fdbf47-1cf8-4a89-bcae-a4255671c1c8', 14, 21);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('00fdbf47-1cf8-4a89-bcae-a4255671c1c8', 12, 32);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('bbc2dc12-5855-416a-bf95-928fd3ed3bc1', 7, 23);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('bbc2dc12-5855-416a-bf95-928fd3ed3bc1', 14, 21);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('bbc2dc12-5855-416a-bf95-928fd3ed3bc1', 12, 32);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('b4c55fe5-70f6-42e1-9864-04312352a4ce', 7, 23);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('b4c55fe5-70f6-42e1-9864-04312352a4ce', 14, 21);
INSERT INTO public.ventas (orden, id_producto, unidades_vendidas) VALUES('b4c55fe5-70f6-42e1-9864-04312352a4ce', 12, 32);
commit;


