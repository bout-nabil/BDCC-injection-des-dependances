# Mini Framework d'Injection de Dépendances
## 📚 Description
Ce projet est réalisé en deux parties :

Partie 1 : Mise en œuvre de l'injection des dépendances en Java avec une approche classique et via Spring (XML & Annotations).

Partie 2 : Développement d'un mini framework d'injection de dépendances, inspiré de Spring IoC.

## 🔧 Fonctionnalités
Injection de dépendances :

Par instanciation statique

Par instanciation dynamique (via Class.forName)

En utilisant Spring Framework :
  - Configuration XML
  - Annotations

Mini Framework maison :
- Support de configuration via fichier XML (JAXB / OXM)
- Support de configuration via annotations personnalisées
-Types d'injection pris en charge :
    - Injection par constructeur
    - Injection par setter
    - Injection par attribut direct (Field injection)

## 🛠️ Technologies
- Java 8+
- Spring Core
- JAXB (Java Architecture for XML Binding)

## 🗂️ Organisation
IDao et DaoImpl
IMetier et MetierImpl

Mini Framework :
  - Lecture XML
  - Analyse des annotations
  - Instanciation et injection

## 🚀 Lancer le projet
# Compiler le projet
mvn clean install

# Exécuter
java -jar target/ton-projet.jar

## 📄 Exemple de configuration XML
Copy code
```xml
<beans>
    <bean id="dao" class="com.example.DaoImpl"/>
    <bean id="metier" class="com.example.MetierImpl">
        <property name="dao" ref="dao"/>
    </bean>
</beans>
```
