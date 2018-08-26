SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS `sistema_vendas` ;
CREATE SCHEMA IF NOT EXISTS `sistema_vendas` ;
USE `sistema_vendas` ;

-- -----------------------------------------------------
-- Table `sistema_vendas`.`categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sistema_vendas`.`categoria` ;

CREATE  TABLE IF NOT EXISTS `sistema_vendas`.`categoria` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `nome` VARCHAR(50) NOT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sistema_vendas`.`produto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `sistema_vendas`.`produto` ;

CREATE  TABLE IF NOT EXISTS `sistema_vendas`.`produto` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `id_categoria` INT NOT NULL ,
  `nome` VARCHAR(50) NOT NULL ,
  `valor_unitario` DECIMAL(7,2) NOT NULL ,
  `quantidade_estoque` INT NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_produto_categoria1` (`id_categoria` ASC) ,
  CONSTRAINT `fk_produto_categoria1`
    FOREIGN KEY (`id_categoria` )
    REFERENCES `sistema_vendas`.`categoria` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
