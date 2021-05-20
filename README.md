# Trabajo de referencia UNLP – BBDD2 Cursada 2021

## Grupo 14



### Crear base de datos, usuario y permisos

Ejecutar `./createDatabase.sh`. Se pedirá la contraseña de root de la base de datos.

### Correr tests
Ejecutar `mvn clean install`

## Ejecutar con Docker:

### Requerimientos
- Docker
- Docker-compose

```bash
docker-compose up -d
```

### Verificar funcionamiento:

```bash
docker-compose ps

Name              Command               State                 Ports              
---------------------------------------------------------------------------------
bd     docker-entrypoint.sh --def ...   Up      0.0.0.0:3306->3306/tcp, 33060/tcp
```

### Crear base de datos y usuario

```bash
./createDatabase_docker.sh
```
