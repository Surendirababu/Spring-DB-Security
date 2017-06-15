CREATE TABLE userdetail(
          id bigserial NOT NULL PRIMARY KEY,
          user_name VARCHAR(50) NOT NULL,
          email VARCHAR(50) NOT NULL,
          password VARCHAR(50)NOT NULL
      );
/
 CREATE TABLE roledetail(
            id bigserial NOT NULL PRIMARY KEY,
            role_name VARCHAR(50) NOT NULL
      );
 /
 insert into userdetail values(1,'babu','babusuren@hotmail.com','password')
 /
 insert into roledetail values(1,'ADMIN',1)
 /