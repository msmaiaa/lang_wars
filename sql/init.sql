CREATE TABLE IF NOT EXISTS users (
	id bigserial PRIMARY KEY NOT NULL,
	username TEXT NOT NULL UNIQUE,
	password TEXT NOT NULL
);