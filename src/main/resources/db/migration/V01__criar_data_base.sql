--teste
CREATE TABLE pessoa (
  codigo bigint(20) NOT NULL AUTO_INCREMENT,
  dt_nasc_fundacao datetime NOT NULL,
  nome_razao varchar(225) NOT NULL,
  tipo_pessoa varchar(20) NOT NULL,
  rg varchar(11) DEFAULT NULL,
  cpf_cnpj varchar(14) NOT NULL,
  municipio varchar(255) NOT NULL,
  uf varchar(255) NOT NULL,
  PRIMARY KEY (codigo),
  UNIQUE KEY rg_UNIQUE (rg),
  UNIQUE KEY cpf_cnpj_UNIQUE (cpf_cnpj))
  ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;