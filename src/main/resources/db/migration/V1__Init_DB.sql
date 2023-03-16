CREATE TABLE IF NOT EXISTS role
(
    id serial NOT NULL PRIMARY KEY,
    name character varying(10) NOT NULL
);

CREATE TABLE IF NOT EXISTS usr
(
    id serial NOT NULL PRIMARY KEY,
    role_id int NOT NULL,
    name character varying(50) NOT NULL,
    login character varying(50) NOT NULL,
    password character varying(50) NOT NULL,
    CONSTRAINT fk_role FOREIGN KEY(role_id) REFERENCES role(id)
);

CREATE TABLE IF NOT EXISTS plant
(
    id serial NOT NULL PRIMARY KEY,
    name character varying(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS plant_description
(
    id int PRIMARY KEY references plant(id),
    watering character varying(100) NOT NULL,
    lighting character varying(100) NOT NULL,
    temperature character varying(100) NOT NULL,
    spraying character varying(100) NOT NULL,
    transplant character varying(100) NOT NULL,
    fertilizer character varying(100) NOT NULL,
    description text NOT NULL
);

ALTER TABLE plant
ADD CONSTRAINT fk_plant_description
    FOREIGN KEY (id) references plant_description (id) deferrable initially deferred;


CREATE TABLE IF NOT EXISTS usr_plant
(
    usr_id int REFERENCES usr(id) ON UPDATE CASCADE ON DELETE CASCADE,
    plant_id int REFERENCES plant(id) ON UPDATE CASCADE,
    CONSTRAINT usr_plant_pkey PRIMARY KEY (usr_id, plant_id)
);
