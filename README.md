# admin-app-openapi

# Projet Admin OpenAPI

Ce projet est une configuration Maven pour la génération et le déploiement d'une API OpenAPI. 
# NB : Faut savoir que c'est un projet dispatcher en 3 modules : le backend avec du java springboot, l'openapi pour la gestion des api et le front avec Angular
#       Il est aussi importeant de noter que open api va nous gerer nos DTO.

## Informations Générales

- **Groupe:** com.groupeisi
- **Artéfact:** admin-open-api
- **Version:** 1.0-SNAPSHOT

## Propriétés du Projet

- Version Java Source et Target: 17
- Encodage Source: UTF-8
- Version des Plugins:
  - Maven Assembly: 3.3.0
  - Maven Release: 3.0.0-M4
  - Maven JAR: 3.2.0
  - OpenAPI CDS: 0.1.0
  - OpenAPI Internal: 0.1.0

## Build

Le projet utilise Maven pour la gestion du build.

- **Nom Final:** openapi

### Ressources

Les fichiers YAML d'OpenAPI sont inclus dans le répertoire `src/main/resources/openapi`. Ils sont copiés dans `target/classes/openapi` lors du build.

### Plugins

- Maven Assembly: Utilisé pour créer des assemblages.
- Maven JAR: Utilisé pour créer un JAR avec un classifier `api`.

## Utilisation

Pour construire le projet, utilisez la commande Maven suivante :

##bash
mvn clean install

# API Produit

## Informations Générales

- **Version OpenAPI:** 3.0.0
- **Titre:** API Produit
- **Version:** 1.0
- **Description:** API pour la gestion des produits.

## Serveurs

- [http://localhost:8080/backend-admin/api](http://localhost:8080/backend-admin/api)

## Tags

- **Produit:** Données spécifiques aux produits.

## Endpoints

### Get All Products

- **Endpoint:** `/produits`
- **Méthode:** GET
- **Tags:** Produit
- **Résumé:** Récupérer tous les produits
- **Operation ID:** getAllProducts
- **Paramètres:**
  - `currentPage` (query, required, int32): Numéro de la page actuelle.
  - `sizePage` (query, required, int32): Taille de la page.
- **Réponses:**
  - `200`: SUCCESS
    - Contenu: [ProduitsResultListDTO](../model/produits/ProduitsResultListDTO.yml)
  - `404`: NOT FOUND
  - `400`: BAD REQUEST

### Retrieve a Product

- **Endpoint:** `/produits-reference`
- **Méthode:** GET
- **Tags:** Produit
- **Résumé:** Récupérer un produit par ID
- **Operation ID:** getProduit
- **Paramètres:**
  - `idProduit` (path, required, int32): ID du produit.
- **Réponses:**
  - `200`: SUCCESS
    - Contenu: [ProduitDTO](../model/produits/ProduitDTO.yml)
  - `404`: NOT FOUND
  - `400`: BAD REQUEST

### Get All Products by User

- **Endpoint:** `/produitsByUser`
- **Méthode:** GET
- **Tags:** Produit
- **Résumé:** Récupérer tous les produits d'un utilisateur
- **Operation ID:** getProductsByUser
- **Paramètres:**
  - `currentPage` (query, required, int32): Numéro de la page actuelle.
  - `sizePage` (query, required, int32): Taille de la page.
- **Réponses:**
  - `200`: SUCCESS
    - Contenu: [ProduitResultListByUserDTO](../model/produits/ProduitResultListByUserDTO.yml)
  - `404`: NOT FOUND
  - `400`: BAD REQUEST

# User DTO

## Description

Description de l'objet de transfert de données utilisateur (DTO), représentant les informations d'un utilisateur.

## Properties

- **idUtilisateur (idUser):**
  - Type: Integer
  - Description: User's ID
  - Format: int32

- **nom:**
  - Type: String
  - Description: User's last name

- **prenom:**
  - Type: String
  - Description: User's first name

- **email:**
  - Type: String
  - Description: User's email

- **password:**
  - Type: String
  - Description: User's password

- **etat:**
  - Type: Integer
  - Description: User's state
  - Format: int32

- **produits:**
  - Type: Array
  - Items:
    - Type: Object
    - Reference: [ProduitDTO](../produits/ProduitDTO.yml)
  - Description: User's product list

# ProduitDTO

## Description

Description de l'objet de transfert de données produit (DTO), représentant des informations sur un produit.

## Properties

- **idProduit:**
  - Type: Integer
  - Description: Product's ID
  - Format: int32

- **name:**
  - Type: String
  - Description: Product's name

- **user:**
  - Description: User who added the product
  - Type: Object
  - Reference: [AppUserDTO](../app-users/AppUserDTO.yml)


# Documentation API - User, Roles, Products

 Description de l'API RESTful pour les entités "AppRoles", "AppUser", et "Produit". Le projet utilise la version OpenAPI 3.0.0.

## Informations Générales

- **Titre:** User, roles, products Api handler
- **Version:** 1.0
- **Serveur API:** [http://localhost:8080/backend-admin/api](http://localhost:8080/backend-admin/api)

## Tags

- **AppRoles:** Données spécifiques aux rôles d'application.
- **AppUser:** Données spécifiques aux utilisateurs de l'application.
- **Produit:** Données spécifiques aux produits.

## Endpoints

### API AppRoles

#### Récupérer tous les rôles d'application

- Endpoint: `/roles`
- Méthode: GET
- Référence: [app-roles.yml](../components/api/app-roles.yml#/paths/~1roles)

#### Récupérer un rôle d'application par ID

- Endpoint: `/roles/{id}`
- Méthode: GET
- Référence: [app-roles.yml](../components/api/app-roles.yml#/paths/~1roles-reference)

### API AppUser

#### Récupérer tous les utilisateurs de l'application

- Endpoint: `/users`
- Méthode: GET
- Référence: [app-users.yml](../components/api/app-users.yml#/paths/~1users)

#### Récupérer un utilisateur par ID

- Endpoint: `/users/{id}`
- Méthode: GET
- Référence: [app-users.yml](../components/api/app-users.yml#/paths/~1users-reference)

### API Produit

#### Récupérer tous les produits

- Endpoint: `/produits`
- Méthode: GET
- Référence: [produits.yml](../components/api/produits.yml#/paths/~1produits)

#### Récupérer un produit par ID

- Endpoint: `/produits/{id}`
- Méthode: GET
- Référence: [produits.yml](../components/api/produits.yml#/paths/~1produits-reference)

