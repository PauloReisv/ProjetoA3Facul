-- Active: 1712273963568@@pg-36109b25-paulovprvpr-f7ae.a.aivencloud.com@25961@defaultdb@public
CREATE TABLE tb_usuario(
    cod_usuario SERIAL PRIMARY KEY,
    login VARCHAR(200) NOT NULL,
    senha VARCHAR(200) NOT NULL
);
--cadastrar um usuario

INSERT INTO tb_usuario
(login, senha) VALUES
('admin', 'admin');

SELECT cod_usuario, login, senha
FROM tb_usUario;

UPDATE tb_usuario SET 
login='admin', senha='admin'
WHERE cod_usuario = 1

