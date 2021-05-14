#!/bin/bash
mysql -u root -p -e "drop database if exists grupo14;
                  create database grupo14;
                  CREATE USER IF NOT EXISTS 'grupo'@'localhost' IDENTIFIED BY 'pa$$word';
                  GRANT ALL PRIVILEGES ON grupo14. * TO 'grupo14'@'localhost';
                  FLUSH PRIVILEGES;
                  "
                  
                  
                  
