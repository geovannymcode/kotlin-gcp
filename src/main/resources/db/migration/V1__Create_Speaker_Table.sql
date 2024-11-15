CREATE SEQUENCE speaker_id_seq START 1 INCREMENT BY 50;

CREATE TABLE speakers (
                         id BIGINT DEFAULT nextval('speaker_id_seq') NOT NULL,
                         name VARCHAR(255) NOT NULL,
                         country VARCHAR(255) NOT NULL,
                         PRIMARY KEY (id)
);