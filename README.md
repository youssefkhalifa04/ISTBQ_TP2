
# 🧪 ISTBQ_TP2 : Tests Unitaires en Java avec JUnit 5

Ce dépôt contient un projet Java illustrant l'utilisation de tests unitaires avec JUnit 5. Il fait partie des travaux pratiques du module ISTBQ (Ingénierie des Systèmes et Tests Basés sur la Qualité).

## 📄 Description

Le projet comprend une classe Java avec des méthodes à tester, ainsi qu'une suite de tests unitaires visant à valider leur bon fonctionnement. L'objectif est de démontrer l'importance des tests dans le cycle de développement logiciel.

## 🛠️ Technologies utilisées

- Java
- JUnit 5
- Maven (pour la gestion des dépendances et la compilation)

## 📁 Structure du projet

```
.
├── .idea/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── [paquetage]/MaClasse.java
│   └── test/
│       └── java/
│           └── [paquetage]/MaClasseTest.java
├── pom.xml
└── README.md
```

*Remplacez `[paquetage]` par le nom réel du paquetage utilisé dans votre projet.*

## ⚙️ Installation et exécution

1. **Cloner le dépôt** :

   ```bash
   git clone https://github.com/youssefkhalifa04/ISTBQ_TP2.git
   cd ISTBQ_TP2
   ```

2. **Compiler le projet avec Maven** :

   ```bash
   mvn compile
   ```

3. **Exécuter les tests unitaires** :

   ```bash
   mvn test
   ```
