INSERT INTO tb_estado (nome) VALUES ('MG'), ('SP');

INSERT INTO tb_cidade (nome, estado_id) VALUES ('Belo Horizonte', 1), ('Brumadinho', 1), ('Ibirité', 1), ('Mário Campos', 1);
INSERT INTO tb_cidade (nome, estado_id) VALUES ('Diadema', 2), ('Guarulhos', 2), ('São Bernardo Do Campo', 2), ('São Paulo', 2);

INSERT INTO tb_endereco (logradouro, numero, bairro, cep, cidade_id) VALUES ('Rua Porto Feliz', 25, 'Jd. das Oliveiras', '09847305', 7);
INSERT INTO tb_endereco (logradouro, numero, bairro, cep, cidade_id) VALUES ('Rua Miro Vetorazzo', 1075, 'Demarchi', '09820135', 7);
INSERT INTO tb_endereco (logradouro, numero, bairro, cep, cidade_id) VALUES ('Estrada da Cama Patente', 200, 'Parque Esmeralda', '09842100', 7);

INSERT INTO tb_escola (nome, telefone, cnpj, endereco_id) VALUES ('Escola Estadual Jacob Casseb', '49123583', '25987459821234', 3);

INSERT INTO tb_livraria (nome, telefone, cnpj) VALUES ('Saraiva', '48215786', '95135785245684');

INSERT INTO tb_livraria_endereco (livraria_id, endereco_id) VALUES (1, 1);

INSERT INTO tb_escola_livraria (escola_id, livraria_id) VALUES (1, 1);

INSERT INTO tb_usuario (nome, telefone, escola_id) VALUES ('Bob Brown', '987568933', 1);
INSERT INTO tb_usuario (nome, telefone, escola_id) VALUES ('Maria Green', '963332156', 1);

INSERT INTO tb_material (nome) VALUES ('Lápis Preto'), ('Caderno 10 Matérias'), ('Borracha'), ('Mochila'), ('Caneta Azul'), ('Régua');

INSERT INTO tb_usuario_material (usuario_id, material_id) VALUES (1, 1);
INSERT INTO tb_usuario_material (usuario_id, material_id) VALUES (1, 3);
INSERT INTO tb_usuario_material (usuario_id, material_id) VALUES (1, 5);
INSERT INTO tb_usuario_material (usuario_id, material_id) VALUES (2, 2);
INSERT INTO tb_usuario_material (usuario_id, material_id) VALUES (2, 3);
INSERT INTO tb_usuario_material (usuario_id, material_id) VALUES (2, 4);
INSERT INTO tb_usuario_material (usuario_id, material_id) VALUES (2, 5);
INSERT INTO tb_usuario_material (usuario_id, material_id) VALUES (2, 6);

INSERT INTO tb_livraria_material (livraria_id, material_id) VALUES (1, 1);
INSERT INTO tb_livraria_material (livraria_id, material_id) VALUES (1, 2);
INSERT INTO tb_livraria_material (livraria_id, material_id) VALUES (1, 3);
INSERT INTO tb_livraria_material (livraria_id, material_id) VALUES (1, 4);
INSERT INTO tb_livraria_material (livraria_id, material_id) VALUES (1, 5);
INSERT INTO tb_livraria_material (livraria_id, material_id) VALUES (1, 6);