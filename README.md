# Bataille navale

Travail pratique Java consacré à la modélisation d’une bataille navale : plateau, positions, cases et bateaux.

> **État : prototype incomplet.** La version fournie ne compile pas et ne permet pas encore de jouer une partie. Elle est publiée comme travail d’apprentissage de la programmation orientée objet.

## Éléments présents

- Initialisation d’une grille carrée.
- Modèle de bateau avec positions et suivi des impacts.
- Modèles de position et de case, directions et résultats de tir.
- Ébauche de point d’entrée dans `battleship.game.Game`.

## Technologies

Java · programmation orientée objet · application console.

## Compilation prévue

Prérequis : un JDK fournissant `javac` et `java`. Depuis la racine, sous PowerShell :

```powershell
$sources = Get-ChildItem src -Recurse -Filter *.java | ForEach-Object FullName
javac -encoding UTF-8 -d classes $sources
```

**La compilation échoue actuellement**, notamment à cause d’un point-virgule manquant dans la déclaration du package de `ResultShot.java`. La lecture du code révèle aussi des références à des champs et méthodes absents (`row`, `hit`, méthodes de placement des bateaux), ainsi qu’une exception vérifiée non gérée dans `Position`.

Le point d’entrée prévu est `battleship.game.Game`, mais aucune commande de lancement fonctionnelle n’est annoncée tant que ces erreurs ne sont pas corrigées. Aucun test automatisé n’est fourni.

## Origine

TP5 réalisé par **Boukais Sabine**, groupe 3, daté du 7 octobre 2025 dans le README fourni. L’archive ne contient pas d’historique Git. Le code est conservé dans son état d’origine ; cette préparation porte sur sa présentation et sa publication.

Aucune licence de redistribution n’est fournie pour ce TP ; aucune licence n’a été ajoutée arbitrairement.
