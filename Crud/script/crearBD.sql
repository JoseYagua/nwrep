/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Analista Sistemas
 * Created: 01-mar-2017
 */


DROP DATABASE IF EXISTS tmp_bd;


CREATE DATABASE IF NOT EXISTS tmp_bd;
USE tmp_bd;
CREATE TABLE agenda (id INT NOT NULL AUTO_INCREMENT, nombre CHAR(60),direccion CHAR(90), telefono CHAR(20), email CHAR(60), KEY (id) );