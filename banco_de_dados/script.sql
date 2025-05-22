-- DELETE FROM tb_pessoa WHERE cod_pessoa = 2;

-- SELECT * FROM tb_pessoa ORDER BY nome DESC;
-- SELECT * FROM tb_pessoa;

-- UPDATE tb_pessoa SET nome = 'Ana Maria'
-- WHERE cod_pessoa = 1;

-- --cláusula where
-- SELECT * FROM tb_pessoa WHERE cod_pessoa IN (1, 3);

-- SELECT * FROM tb_pessoa WHERE cod_pessoa = 1 OR cod_pessoa = 3;

-- SELECT * FROM tb_pessoa WHERE cod_pessoa = 1;

-- --projeção
-- SELECT nome, email FROM tb_pessoa;

-- INSERT INTO tb_pessoa(nome, fone, email)
-- VALUES
-- ('Pedro', '78945612', 'pedro@email.com'),
-- ('Maria', '45612312', 'maria@email.com');
-- SELECT * FROM tb_pessoa;

-- INSERT INTO tb_pessoa(nome, fone, email)
-- VALUES ('Ana', '12345678', 'ana@email.com');


-- CREATE TABLE tb_pessoa(
--   cod_pessoa SERIAL PRIMARY KEY,
--   nome VARCHAR(200) NOT NULL,
--   fone VARCHAR(200) NOT NULL,
--   email VARCHAR(200) NULL
-- );