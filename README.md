# Projet Java avec Spring

Ce projet démontre l'utilisation de Spring Framework pour gérer l'injection de dépendances dans une application Java.

## Contenu du projet

### Packages

- **dao**: Contient l'interface `IDao` et son implémentation `IDaoImp`.
- **metier**: Contient l'interface `IMetier` et son implémentation `IMetierImp`.
- **pres**: Contient des classes de présentation pour illustrer différentes méthodes d'instanciation des objets métier.

## Méthodes d'instanciation

1. **Instanciation Statique**: Les objets sont instanciés directement dans le code.
2. **Version Dynamique**: Les classes sont instanciées dynamiquement à partir de noms de classe lus depuis un fichier de configuration.
3. **Spring avec Annotation**: Utilisation de Spring avec des annotations pour la configuration.
4. **Spring avec XML**: Utilisation de Spring avec une configuration XML.

## Comment exécuter

Exécutez les classes de présentation correspondantes pour tester chaque méthode d'instanciation. Assurez-vous d'avoir toutes les dépendances de Spring dans votre projet et, pour l'instanciation dynamique, un fichier de configuration `config.txt` contenant les noms de classe des implémentations `IDao` et `IMetier`.
