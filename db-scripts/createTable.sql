CREATE DATABASE nutrition;
USE nutrition;

CREATE TABLE food(
	id            INT AUTO_INCREMENT PRIMARY KEY,
	description   VARCHAR(255),
	moisture      FLOAT(10,2),
	energy        INT,
	protein       FLOAT(10,2),
    lipids        FLOAT(10,2),
    cholesterol   VARCHAR(255),
    carbohydrate  FLOAT(10,2),
    dietary_fiber FLOAT(10,2),
	ashes         FLOAT(10,2),
	calcium       FLOAT(10,2),
	magnesium     FLOAT(10,2),
	manganese     FLOAT(10,2),
	phosphor      FLOAT(10,2),
	iron          FLOAT(10,2),
	sodium        FLOAT(10,2),
	potassium     FLOAT(10,2),
	copper        FLOAT(10,2),
	zinc          FLOAT(10,2),
	retinol       VARCHAR(30),
	RE            VARCHAR(30),
	RAE           VARCHAR(30),
	thiamine      FLOAT(10,2),
	riboflavin    FLOAT(10,2),
	pyridoxine    FLOAT(10,2),
	niacin        FLOAT(10,2),
	VitaminC      FLOAT(10,2)
);