CREATE TABLE lancamento (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	id_empresa BIGINT(20) NOT NULL,
	id_categoria BIGINT(20) NOT NULL,
	tipo VARCHAR(20) NOT NULL,
	vencimento DATE NOT NULL,
	valor DECIMAL(10,2) NOT NULL,
	FOREIGN KEY (id_categoria) REFERENCES categoria(id),
	FOREIGN KEY (id_empresa) REFERENCES empresa(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO lancamento (id_empresa, id_categoria, tipo, vencimento, valor) values (1, 3, 'RECEITA', '2018-12-10', 6500.00);
INSERT INTO lancamento (id_empresa, id_categoria, tipo, vencimento, valor) values (2, 2, 'DESPESA', '2019-03-10', 500.00);
INSERT INTO lancamento (id_empresa, id_categoria, tipo, vencimento, valor) values (3, 3, 'RECEITA', '2018-11-10', 2000.00);
INSERT INTO lancamento (id_empresa, id_categoria, tipo, vencimento, valor) values (4, 1, 'RECEITA', '2019-01-10', 10500.00);
