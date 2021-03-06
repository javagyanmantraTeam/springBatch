drop table  if exist PERSON;

CREATE TABLE PERSON
(
PERSON_ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
FIRST_NAME VARCHAR(255),
LAST_NAME VARCHAR(255),
PHONE_NO INTEGER(12),
STATUS_ID INTEGER,
ADDRESS_ID INTEGER,
FOREIGN KEY (STATUS_ID) REFERENCES PERSONSTATUS(STATUS_ID),
FOREIGN KEY (ADDRESS_ID) REFERENCES ADDRESS(ADDRESS_ID)
);