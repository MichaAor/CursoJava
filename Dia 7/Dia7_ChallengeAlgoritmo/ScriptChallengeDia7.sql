CREATE DATABASE IF NOT EXISTS spotify;

USE spotify;

CREATE TABLE User (
   idUser INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   userName VARCHAR(45) NULL,
   mail VARCHAR(45) NULL,
   password VARCHAR(45) NULL,
   country VARCHAR(45) NULL,
   type ENUM('Basic', 'Premium') NULL
   );


CREATE TABLE Artist (
   idArtist INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(45) NULL ,
   age INT NULL,
   surname VARCHAR(45) NULL,
   country VARCHAR(45) NULL
   );


CREATE TABLE Album(
   idAlbum INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   title VARCHAR(45) NULL,
   releaseDate DATE NULL UNIQUE,
   gender VARCHAR(45) NULL,
   artist INT NOT NULL,
    FOREIGN KEY (artist)
    REFERENCES Artist (idArtist)
    );


CREATE TABLE Song (
   idSong INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   titulo VARCHAR(45) NULL,
   pista VARCHAR(45) NULL,
   anio VARCHAR(45) NULL,
   genero VARCHAR(45) NULL,
   duration VARCHAR(45) NULL,
   Album_idAlbum INT NOT NULL,
    FOREIGN KEY (Album_idAlbum)
    REFERENCES Album (idAlbum)
  );

CREATE TABLE Playlist (
   idPlaylist INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(45) NULL ,
   User_idUser INT NOT NULL,
    FOREIGN KEY (User_idUser)
    REFERENCES User (idUser)
    );

CREATE TABLE PlaylistSongs(
   idPlaylistSongs INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   Song_idSong INT NOT NULL,
   Playlist_idPlaylist  INT NOT NULL,
    FOREIGN KEY (Song_idSong)
    REFERENCES Song (idSong),
    FOREIGN KEY (Playlist_idPlaylist)
    REFERENCES Playlist (idPlaylist)
   );


