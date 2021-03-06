CREATE DATABASE banklist;

CREATE TABLE `user` (
  `userid` INT NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `surename` varchar(45) NOT NULL,
  PRIMARY KEY (`userid`) 
);

CREATE TABLE `account` (
  `accountid` INT NOT NULL AUTO_INCREMENT,
  `account` INT NOT NULL,
  `userid` INT NOT NULL,
  PRIMARY KEY (`accountid`)
 );

ALTER TABLE `account` ADD CONSTRAINT `account_fk0` FOREIGN KEY (`userid`) REFERENCES `user`(`userid`);

INSERT user(name, surename) values ('James', 'Cunningham');

INSERT user(name, surename) values ('Evan', 'Redgrave');

INSERT user(name, surename) values ('Albert', 'DeSalvo');

INSERT user(name, surename) values ('Marko', 'Legrand');

INSERT user(name, surename) values ('Emma', 'Hazer');

INSERT user(name, surename) values ('George', 'Hemnitz');

INSERT user(name, surename) values ('Carl', 'Shteyn');

INSERT user(name, surename) values ('Claus', 'Shimmer');

INSERT user(name, surename) values ('Sara', 'Wottermakh');

INSERT user(name, surename) values ('John', 'Smith');

INSERT account (account, userid) values (32, 1);

INSERT account (account, userid) values (100, 2);

INSERT account (account, userid) values (15, 3);

INSERT account (account, userid) values (99, 4);

INSERT account (account, userid) values (90, 5);

INSERT account (account, userid) values (25, 6);

INSERT account (account, userid) values (38, 7);

INSERT account (account, userid) values (8, 8);

INSERT account (account, userid) values (40, 9);

INSERT account (account, userid) values (32, 10);
