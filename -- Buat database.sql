-- Buat database
CREATE DATABASE test_db;

-- Gunakan database
USE test_db;

-- Buat tabel untuk formulir kontak
CREATE TABLE contacts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    message TEXT NOT NULL
);

-- Buat tabel untuk data pengguna
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

-- Masukkan data contoh ke tabel users
INSERT INTO users (name, email) VALUES ('John Doe', 'john@example.com');
