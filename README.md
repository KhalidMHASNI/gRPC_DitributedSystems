# gRPC

## => Première Partie :
### Reprendre les mêmes exemple de la démonstration vidéo pour implémenter les 4 modèles :
#### - Unary Model

![convert](https://user-images.githubusercontent.com/82038554/235723925-ede26ad4-595d-404f-b682-05ddaca9a082.PNG)
![ClientScreen1](https://user-images.githubusercontent.com/82038554/235723939-098939ec-2cf1-4c4f-a13c-a33a64d771ca.PNG)
![ClientScreen2](https://user-images.githubusercontent.com/82038554/235723948-1c3d2e2c-5a3d-426a-a1dc-0819c54bd5dc.PNG)

#### - Server Sreaming Model

![getCurrencystream](https://user-images.githubusercontent.com/82038554/235724129-38bb30f9-58d4-415f-addb-a9c90d0ea62f.PNG)
![ClientScreen3](https://user-images.githubusercontent.com/82038554/235724764-29a901c5-33a9-4bff-b378-c6eadad9d360.PNG)

#### - Client Streaming Model

![performStream](https://user-images.githubusercontent.com/82038554/235724152-50d74ae2-efea-43a7-9c8a-336d5782f0a2.PNG)
![ClientScreen4](https://user-images.githubusercontent.com/82038554/235725515-319f951f-30cd-46b3-a307-6cc96f43ce04.PNG)

#### - BiDirectional Streaming Model : Pour le cas d'une conversion de monnaie

![FullCurStream](https://user-images.githubusercontent.com/82038554/235723978-2c8e5ea4-921e-40a0-8351-340a31461748.PNG)
![ClientScreen5](https://user-images.githubusercontent.com/82038554/235725894-e66e7230-13f8-4b92-a945-3638ffa0493f.PNG)

## => Deuxième partie
### 1. Créer un serveur Chat GRPC
 ![Chatserver](https://user-images.githubusercontent.com/82038554/235730506-5745fc4b-481f-4f9c-8799-3a1e8b8b1497.PNG)

### 2. Tester le serveur Chat avec un client GRPC comme BloomRPC
![Chatbloomrpc](https://user-images.githubusercontent.com/82038554/235730165-aa9d7a32-c46f-4961-b0b3-baaa9a38493b.PNG)

### 3. Créer un client GRPC Java
![Chatclient](https://user-images.githubusercontent.com/82038554/235732655-47265b6e-0548-46d8-a597-89f9053ffeef.PNG)

### 4. Créer un client GRPC Python
![Chatclientpy](https://user-images.githubusercontent.com/82038554/235735735-933f88bf-1095-435a-843d-2138f96285bb.PNG)

## => Troisième partie
### Créer un serveur JEU GRPC :
     - Au démarrage le serveur choisit un nombre aléatoire entre 1 et 1000. 
     - Ensuite les clients GRPC doivent deviner en compétition le nombre secret.
     - le serveur répond à chaque fois avec les éventualités suivantes :
        . Votre nombre est plus grand
        . Votre nombre est plus petit
        . BRAVO vous avez gagné et envoyer le gagnant aux clients
        . Jeu terminé, le gagnant est ""Numéro du gagnant"
### 1.Créer le serveur Game gRPC

 ![final](https://user-images.githubusercontent.com/82038554/235746143-d784d4b1-54b1-4ca6-a6cc-99b7213b683a.PNG)

### 2.Tester le serveur avec BloomRPC

![gameserverbloom1](https://user-images.githubusercontent.com/82038554/235742999-bd292a40-b87d-469c-b06d-27ffc16d5c17.PNG)
![gameserverbloom2](https://user-images.githubusercontent.com/82038554/235743256-e602419c-15dd-4868-9ae8-f2970bf38e28.PNG)
![gameserverbloom3](https://user-images.githubusercontent.com/82038554/235743272-2d454ee9-c77f-4f02-b727-828cfe4694c7.PNG)

### 3.Créer des clients GRPC Java

 ![gameclientjava](https://user-images.githubusercontent.com/82038554/235743518-49ed1505-07d8-4d0d-9498-9f1d470a2324.PNG)

### 4.Créer client GRPC Python

 ![gameclientpython](https://user-images.githubusercontent.com/82038554/235745383-d306ae48-b7ff-49c6-9142-76ea4ae4db66.PNG)
