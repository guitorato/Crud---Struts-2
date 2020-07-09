CREATE TABLE `exame` (
   id INT PRIMARY KEY AUTO_INCREMENT,
  `nome` VARCHAR(200) NOT NULL,
  `cpf` VARCHAR(15) NOT NULL,
  `telefone` VARCHAR(25) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `resultado` VARCHAR(100)
);

CREATE TABLE `exame` (
  `nome` VARCHAR(200) NOT NULL,
  `cpf` VARCHAR(15) NOT NULL,
  `telefone` VARCHAR(25) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `resultado` VARCHAR(100),
   PRIMARY KEY (`cpf`)
);