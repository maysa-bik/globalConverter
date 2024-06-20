# globalConverter
# Programme de Conversion et Chiffrement

## Description

Ce programme permet de saisir une chaîne de caractères et de la traduire en différentes bases (octale, hexadécimale, binaire, ou texte). Il vérifie que la chaîne de caractères est valide, c'est-à-dire qu'elle ne contient que des caractères alphabétiques et/ou numériques. L'utilisateur peut choisir la base de traduction souhaitée et chaque caractère de la chaîne de caractères est converti en valeur ASCII. Le programme permet également de chiffrer et déchiffrer la chaîne de caractères en utilisant le chiffrement de César.

## Fonctionnalités

1. **Validation de la chaîne de caractères** : Le programme vérifie que la chaîne ne contient que des caractères alphanumériques.
2. **Chiffrement de César** : L'utilisateur peut spécifier une clé de chiffrement pour chiffrer et déchiffrer la chaîne de caractères.
3. **Conversion de base** : Convertir les valeurs ASCII des caractères en différentes bases (octale, hexadécimale, binaire, ou texte).
4. **Inversement des conversions** : Toute conversion peut être inversée, permettant de revenir à la chaîne de caractères d'origine.

## Exécution du programme

### Compilation

Pour compiler toutes les classes, utilisez la commande suivante :

```bash
javac Main.java InputValidator.java BaseSelector.java AsciiConverter.java BaseConverter.java InverseBaseConverter.java CaesarCipher.java
