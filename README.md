# Documentation de l'Application Spring Java - Gestion des Patients

Ce projet est une application Spring Java conçue pour gérer les informations des patients. Elle propose un ensemble de fonctionnalités pour créer, récupérer un ou tous, compter et créer de nouveaux patients. Cette documentation vous guidera à travers chaque aspect de l'API.

## Table des matières

1. [Introduction](#introduction)
2. [Enregistrement d'un patient](#enregistrement-dun-patient)
3. [Récupération des données d'un patient](#récupération-des-données-dun-patient)
4. [Récupération paginée de tous les patients](#récupération-paginée-de-tous-les-patients)
5. [Comptage des patients par genre](#comptage-des-patients-par-genre)
6. [Création d'un nouveau patient à partir de deux parents](#création-dun-nouveau-patient-à-partir-de-deux-parents)
7. [Exécution du projet](#exécution-du-projet)
8. [Contributions](#contributions)

## 1. Introduction

Ce projet est une application Spring Java destinée à la gestion des patients. Il offre une API RESTful permettant de réaliser les opérations suivantes.

## 2. Enregistrement d'un patient

- **Chemin** : api/patient
- **Méthode** : POST
- **Paramètre d'entrée** : Un DTO contenant les caractéristiques du patient à créer à l'exception de l'ID qui est généré. Les paramètres à renter sont: 
  "firstname": le prénom du patient en chaine de caractères,
  "lastname": son nom de famille en chaine de caractères
  "gender": son genre
  "birthdate": sa date de naissance sous le format indiqué
  "birthplace": le numéro de département de naissance en chaine de caractères
  "firstAllele": le premiere allèle pour le groupe sanguin (A ou B ou O)
  "secondAllele": le deuxième allèle pour le groupe sanguin (A ou B ou O)

- **Paramètre de sortie** : Les informations du patient nouvellement créé.

## 3. Récupération des données d'un patient

- **Chemin** : api/patient/{id}
- **Méthode** : GET
- **Paramètre d'entrée** : L'ID du patient de type entier. 
- **Paramètre de sortie** : Les données du patient correspondant à l'ID, ou null si le patient n'existe pas dans la base.

## 4. Récupération paginée de tous les patients

- **Chemin** : api/patient/all
- **Méthode** : GET
- **Paramètre de sortie** : Une page contenant tous les patients avec leurs caractéristiques

## 5. Comptage des patients par genre

- **Chemin** : api/patient/count
- **Méthode** : GET
- **Paramètre d'entrée** : Aucun.
- **Paramètre de sortie** : Le résultat du dénombrement des patients par genre.

## 6. Création d'un nouveau patient à partir de deux parents

- **Chemin** : api/patient/create
- **Méthode** : POST
- **Paramètre d'entrée** : les ID des deux parents et les caractéristiques propres au patient à créer à l'exception du groupage ABO, qui est géré par l'application.
- **Paramètre de sortie** : Le patient nouvellement créé avec ses caractéristiques.

## 7. Exécution du projet

Pour exécuter ce projet, vous devrez disposer d'un environnement Java et Spring correctement configuré. Assurez-vous également d'avoir une base de données PostgreSQL pour stocker les informations des patients.
- Clonez ce référentiel sur votre machine.
- Configurez les propriétés de base de données dans le fichier `application.properties`: nous vous avons mis un example dans appelé "application.properties.example.properties", copier puis coller son contenu dans votre fichier `application.properties`. Ensuite,  remplacez : *[Your_Datatbase] par le nom de voter base de données PostgreSQL;
            *[Your_Username] par votre nom d'utilisateur pour cette base;
            *[Your_Password] par votre mot de passe.
- Exécutez l'application en utilisant votre IDE préféré.

Assurez-vous de consulter la documentation de l'API pour obtenir des détails supplémentaires sur l'utilisation des différentes fonctionnalités.

## 8. Contributions

Les contributions à ce projet sont les bienvenues. N'hésitez pas à ouvrir des problèmes ou à proposer des demandes d'extraction si vous trouvez des bogues ou souhaitez ajouter des fonctionnalités supplémentaires.

Nous vous remercions d'utiliser notre application !

        -------------------------------------MERCI-----------------------------------------------------

