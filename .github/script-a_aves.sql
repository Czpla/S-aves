-- SCRIPT S_AVES - AEP - UNICESUMAR - 4� PERIODO

-- -----------------------------------------------------
-- Schema s_ave
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `s_ave` DEFAULT CHARACTER SET utf8
USE s_ave

-- -----------------------------------------------------
-- Table `s_ave`.`AVIARY`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `s_ave`.`AVIARY` (
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
-- Table `s_ave`.`BATCH`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `s_ave`.`BATCH` (
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
    REFERENCES `s_ave`.`AVIARY` (`ID`))
ENGINE = InnoDB
