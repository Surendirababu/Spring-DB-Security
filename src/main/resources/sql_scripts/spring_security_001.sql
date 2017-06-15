CREATE TABLE userdetail(
          id bigserial NOT NULL PRIMARY KEY,
          userName VARCHAR(50) NOT NULL,
          email VARCHAR(50) NOT NULL,
          password double precision NOT NULL
      );
/
CREATE TABLE roledetail(
            id bigserial NOT NULL PRIMARY KEY,
            roleName VARCHAR(50) NOT NULL
      );
/