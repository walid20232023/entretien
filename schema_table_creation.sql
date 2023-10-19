
-- Requête 1 : Création du schéma exam_inf201

CREATE SCHEMA exam_inf201; 



-- Requête 2: Création creation de la table "patient"

CREATE TABLE exam_inf2011.patient (
	id serial ,
	firstname varchar ,
	lastname varchar ,
	birth_date date ,
	first_allele bpchar(1) ,
	second_allele bpchar(1) ,
	patient_gender varchar,
	birth_place varchar ,
	parent1_id integer ,
	parent2_id integer ,
	CONSTRAINT patient_pkey PRIMARY KEY (id)
);  



