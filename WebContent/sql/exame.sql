CREATE TABLE `exame` (
  `id` INT  NOT NULL,
  `nome` VARCHAR(200) NOT NULL,
  `cpf` VARCHAR(15) NOT NULL,
  `telefone` VARCHAR(25) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `resultado` VARCHAR(100),
  PRIMARY KEY (`id`)
);