DESC tbl_movimentacao;
DESC tbl_preco;

SELECT * FROM tbl_movimentacao;
SELECT * FROM tbl_preco;

INSERT INTO tbl_preco (valor_primeira_hora, valor_demais_horas, tempo_tolerancia)
VALUES (5, 3, 5);

INSERT INTO tbl_movimentacao (placa, modelo_carro, data_hora_entrada)
VALUES ('JGN-7852', 'Crossfox', now());

UPDATE tbl_movimentacao SET tempo_permanencia = 0, valor_pago = 0
WHERE cod_movimento > 0;

ALTER TABLE tbl_preco
CHANGE COLUMN valor_hora1 valor_primeira_hora DECIMAL(5, 2) NOT NULL AFTER cod_preco;

ALTER TABLE tbl_movimentacao
CHANGE COLUMN cod_entrada cod_movimento INT NOT NULL AUTO_INCREMENT;

ALTER TABLE tbl_movimentacao
CHANGE COLUMN modelo modelo_carro VARCHAR(20) NOT NULL AFTER placa;

ALTER TABLE tbl_movimentacao
CHANGE COLUMN hora_saida data_hora_saida DATETIME AFTER data_hora_entrada;

ALTER TABLE tbl_movimentacao
CHANGE COLUMN tempo_permanencia tempo_permanencia INT default 0 after data_hora_saida ;

ALTER TABLE tbl_movimentacao
CHANGE COLUMN valor_pago valor_pago decimal(5, 2) default 0 after tempo_permanencia ;

DROP DATABASE db_estaciona_facil;

DELETE FROM tbl_movimentacao where cod_movimento > 0;