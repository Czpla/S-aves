-- SCRIPT S_AVES - AEP - UNICESUMAR - 4º PERIODO

-- -----------------------------------------------------
-- Schema s_aves
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `s_aves` DEFAULT CHARACTER SET utf8
USE s_aves

-- -----------------------------------------------------
-- Table `s_aves`.`AVIARY`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `s_aves`.`AVIARY` (
  `ID` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `NAME` VARCHAR(50) NOT NULL,
  `CITY` VARCHAR(50) NOT NULL,
  `STATE` VARCHAR(50) NOT NULL,
  `STREET` VARCHAR(60) NOT NULL,
  `NUMBER` INT NOT NULL,
  `SIZE` INT NOT NULL,
  `CREATED_AT` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB


-- -----------------------------------------------------
-- Table `s_aves`.`BATCH`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `s_aves`.`BATCH` (
  `ID` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `START_DATE` DATE NOT NULL,
  `END_DATE` DATE NOT NULL,
  `AMOUNT` INT UNSIGNED ZEROFILL NOT NULL,
  `BREED` VARCHAR(50) NOT NULL,
  `CREATED_AT` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ID_AVIARY` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `FK_BATCH_AVIARY_IDX` (`ID_AVIARY`),
  CONSTRAINT `FK_BATCH_AVIARY`
    FOREIGN KEY (`ID_AVIARY`)
    REFERENCES `s_aves`.`AVIARY` (`ID`))
ENGINE = InnoDB
