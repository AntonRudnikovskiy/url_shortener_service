CREATE TABLE IF NOT EXISTS url (
    hash varchar(6) PRIMARY KEY NOT NULL,
    url text,
    created_at timestamptz DEFAULT current_timestamp
);

CREATE TABLE IF NOT EXISTS hash (
    hash varchar(256) PRIMARY KEY NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS unique_number_seq