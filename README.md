# jaxws-soap-client-async

## SQL

### database
```
CREATE DATABASE `jax_ws_soap` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
```

### etudiant
```
CREATE TABLE `etudiant` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `specialite` varchar(45) NOT NULL,
  `age` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```

### cours
```
CREATE TABLE `cours` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titre` varchar(45) NOT NULL,
  `duree` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
```

### Generate client class 
```
wsimport -keep -p fr.doranco.jaxws.webservice http://localhost:9991/ws/etudiant-service?wsdl -b binding.xml

```