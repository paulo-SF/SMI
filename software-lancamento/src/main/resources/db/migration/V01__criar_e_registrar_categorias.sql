
CREATE TABLE categoria (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	descricao VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria (descricao) values ('Faturamento de cliente');
INSERT INTO categoria (descricao) values ('Aluguel de sala');
INSERT INTO categoria (descricao) values ('Conta de luz');