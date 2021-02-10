CREATE DATABASE nutrition;
USE nutrition;

CREATE TABLE food(
	id INT AUTO_INCREMENT PRIMARY KEY,
	description VARCHAR(255),
	moisture FLOAT(3,2),
	energy INT,
	cholesterol VARCHAR(255),
	ashes FLOAT(3,2),
	protein FLOAT(3,2),
	lipids FLOAT(3,2),
	carbohydrate FLOAT(3,2),
	dietary_fiber FLOAT(3,2),
	calcium FLOAT(3,2),
	magnesium FLOAT(3,2),
	manganese FLOAT(3,2),
	phosphor FLOAT(3,2),
	iron FLOAT(3,2),
	sodium FLOAT(3,2),
	potassium FLOAT(3,2),
	copper FLOAT(3,2),
	zinc FLOAT(3,2),
	retinol VARCHAR(30),
	RE VARCHAR(30),
	RAE VARCHAR(30),
	thiamine FLOAT(3,2),
	riboflavin FLOAT(3,2),
	pyridoxine FLOAT(3,2),
	niacin FLOAT(3,2),
	VitaminC FLOAT(3,2)
);