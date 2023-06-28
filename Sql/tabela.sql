DROP database lpoo2;
create database LPOO2;
use LPOO2;

CREATE TABLE IF NOT EXISTS cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(30),
    sobrenome VARCHAR(50),
    rg VARCHAR(9) UNIQUE,
    cpf VARCHAR(11) UNIQUE,
    endereco VARCHAR(100),
    salario DECIMAL(10, 2)
);

CREATE TABLE IF NOT EXISTS conta (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente_id INT UNIQUE,
    tipo_conta ENUM('Conta_Corrente', 'Conta_Investimento'),
    deposito_inicial DECIMAL(10, 2),
    limite DECIMAL(10, 2),
    montante_minimo DECIMAL(10, 2),
    deposito_minimo DECIMAL(10, 2),
    saldo DECIMAL(10, 2),
    FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);

INSERT INTO cliente (nome, sobrenome, rg, cpf, endereco, salario)
VALUES
    ('João', 'Silva', '123456789', '10101010101', 'Rua A, 123', 4000.00),
    ('Maria', 'Santos', '987654321', '21212121212', 'Avenida B, 456', 5000.00),
    ('Pedro', 'Souza', '456789123', '31313131313', 'Rua C, 789', 1000.00),
    ('Ana', 'Ferreira', '321654987', '42424242424', 'Avenida D, 321', 2500.00),
    ('Carlos', 'Oliveira', '654987321', '55555555555', 'Rua E, 654', 1500.00),
    ('Mariana', 'Rocha', '987321654', '66666666666', 'Avenida F, 987', 1200.00),
    ('Lucas', 'Lima', '258369147', '77777777777', 'Rua G, 258', 3000.00),
    ('Laura', 'Gomes', '147258369', '88888888888', 'Avenida H, 147', 7000.00),
    ('Paulo', 'Castro', '369147258', '99999999999', 'Rua I, 369', 5500.00),
    ('Isabela', 'Almeida', '741852963', '00000000000', 'Avenida J, 741', 1400.00),
	('Joao', 'Teste', '123458718', '1010101018', 'Rua A, 123', 4000.00),
	('Joao1', 'Teste1', '123458768', '1010101019', 'Rua A, 123', 4000.00),
    ('Vlademir', 'Teste', '123458728', '1010101029', 'Rua A, 123', 4000.00),
    ('Valdemir', 'Teste', '123458738', '1010101039', 'Rua A, 123', 4000.00),
    ('Terminar', 'Teste', '123458778', '1010101089', 'Rua A, 123', 4000.00);
INSERT INTO conta (cliente_id, tipo_conta, deposito_inicial, limite, montante_minimo, deposito_minimo, saldo)
VALUES
    (1, 'Conta_Corrente', 1000.00, 5000.00, NULL, NULL, 1000.00),
    (2, 'Conta_Investimento', NULL, NULL, 1000.00, 500.00, NULL),
    (3, 'Conta_Corrente', 1500.00, 3000.00, NULL, NULL, 1500.00),
    (4, 'Conta_Corrente', 2000.00, 4000.00, NULL, NULL, 2000.00),
    (5, 'Conta_Investimento', NULL, NULL, 2000.00, 1000.00, NULL),
    (6, 'Conta_Corrente', 3000.00, 6000.00, NULL, NULL, 3000.00),
    (7, 'Conta_Investimento', NULL, NULL, 1500.00, 800.00, NULL),
    (8, 'Conta_Corrente', 2500.00, 5000.00, NULL, NULL, 2500.00),
    (9, 'Conta_Investimento', NULL, NULL, 3000.00, 1500.00, NULL),
    (10, 'Conta_Corrente', 5000.00, 10000.00, NULL, NULL, 5000.00);