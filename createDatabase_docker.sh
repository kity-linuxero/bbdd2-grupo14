#!/bin/bash
docker exec -it bd mysql -u root -p -e "drop database if exists grupo14;
                  create database grupo14;
                  CREATE USER IF NOT EXISTS 'grupo14'@'%' IDENTIFIED WITH mysql_native_password BY 'password';
		        GRANT ALL PRIVILEGES ON *.* TO 'grupo14'@'%';
                  FLUSH PRIVILEGES;
                  "
