-- Schema: sp

-- DROP SCHEMA sp;

CREATE SCHEMA sp
  AUTHORIZATION serviceproject;
  
  -- Table: sp.projects_t

-- DROP TABLE sp.projects_t;

CREATE TABLE sp.projects_t
(
  project_id SERIAL NOT NULL,
  project_name character varying(255) NOT NULL,
  project_customer character varying(255) NOT NULL,
  project_ts timestamp with time zone
)
WITH (
  OIDS=FALSE
);
ALTER TABLE sp.projects_t OWNER TO serviceproject;


CREATE TABLE sp.tasks_t
(
  task_id SERIAL NOT NULL,
  task_name character varying(255) NOT NULL,
  task_docurl character varying(255) NOT NULL,
  task_eta character varying(255) NOT NULL,
  task_initdate timestamp with time zone,
  task_enddate timestamp with time zone,
  task_type integer NOT NULL,
  
  project_customer character varying(255) NOT NULL,
  
)
WITH (
  OIDS=FALSE
);
ALTER TABLE sp.projects_t OWNER TO serviceproject;