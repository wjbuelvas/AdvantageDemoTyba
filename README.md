# Automatización www.advantageonlineshopping.com - Tyba

### Descripción y contexto

Este repositorio contiene la automatización del escenario Creación de cuentas para la página www.advantageDemo.com
+ Acceso a www.advantageonlineshopping.com por medio del google Chrome
+ Creación de cuentas para usuarios
---
### Herramientas para la automatización
+ Java version 1.8.0_271
+ Chromedriver versión 106.0.4896.60
+ IntelliJ IDEA Community Edition versión 2022.2.2
+ Sistema Operativo Windows 10
+ Git versión 2.35.1

---
## Framework

### Serenity BDD
Se utiliza como framework para la automatización de escenarios de prueba, se construyen pruebas que verifiquen si el comportamiento de la aplicación es acorde a necesidades del negocio, partiendo de historias de usuario que tengan el siguiente modelo “Como [rol ] quiero [ característica ] para [los beneficios]”

---
## Gherkin 
Se utiliza Gherkin como lenguaje de desarrollo de las funcionalidades dado que es un lenguaje simple que permite ser comprendido por humanos y por ordenadores, con este vamos a definir los comportamientos de la página que vamos a automatizar. Utilizar Gherkin nos va a permitir crear una documentación mas clara y entendible a la hora de automatizar nuestros tests de cara al negocio.

Gherkin es un lenguaje fácil de leer, entender y escribir. 
Para hacer uso de Gherkin es necesario conocer 5 palabras (Feature, Scenario, Given, When, Then)

- Feature: Indica el nombre de la funcionalidad que se probará. Debe ser un título claro. Se incluye aquí una descripción en forma de historia de usuario: “Como [rol] quiero [característica] para que [los beneficios]”. Sobre esta descripción ese empiezan a construir los escenarios de prueba.

- Scenario: Describe cada escenario que vamos a probar.
-	Given: Indica los prerequisitos que necesitamos para ejecutar la prueba.
-	When: Especifica el conjunto de acciones accionan las funcionalidades que deseamos testear.
-	Then: Especifica el resultado esperado en el test.

---
## Cucumber
Se utiliza cucumber el cual nos permite ejecutar descripciones funcionales en texto plano como pruebas de software automatizadas. Totalmente compatible con el lenguaje Gherkin.

---
## Patrón de diseño: Screenplay

Screenplay trata acerca de escribir nuestras pruebas automatizadas basado en los principios de ingeniería de software tal como son el principio de responsabilidad única (SRP) y en el principio de abierto/cerrado (Open-Closed).

Screenplay promueve los bueno hábitos de testing y suites de pruebas bien organizadas las cuales son fáciles de seguir, fácil de mantener y fácil de extender; habilitando a los equipos a escribir pruebas automatizadas robustas y entendibles. Todo buen patrónn debe tener buenos hábitos de pruebas, pero en realidad, debemos poner atención en la implementación correcta.

### Capas principales 

#### Features
#### Runners
#### Step Definitions
#### Tasks
#### Interactions
#### Questions
#### User interfaces
### Capas transversales:
#### Models
#### Utils
#### Exceptions