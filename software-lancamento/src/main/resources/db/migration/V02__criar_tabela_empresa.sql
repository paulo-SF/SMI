CREATE TABLE empresa (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	cnpj VARCHAR(14)  NOT NULL,
	nome_responsavel VARCHAR(30),
	contato VARCHAR(30)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO empresa (nome, cnpj, nome_responsavel, contato) values ('SMI', '12332142565235', 'João', 'joão@gmail.com');
INSERT INTO empresa (nome, cnpj, nome_responsavel, contato) values ('SNI', '45685364759856', 'Pedro', 'pedro@gmail.com');
INSERT INTO empresa (nome, cnpj, nome_responsavel, contato) values ('SOI', '45689233512332', 'Paulo', 'paulo@gmail.com');
INSERT INTO empresa (nome, cnpj, nome_responsavel, contato) values ('SPI', '12365235586322', 'Tadeu', 'tadeu@gmail.com');
