# UAD/Rest services demo

This Liferay Workspace is meant to showcase a couple of interesting things. The project citytours inside modules shows the creation of a JAX-RS service meant to be called from a Liferay Forms DataProvider. The project promociones shows how to integrate custom entities with Liferay's UAD systems, to provide anonymization and the ability to export custom entities as personal data.

## Getting Started

This is a [Liferay Workspace](https://dev.liferay.com/es/develop/tutorials/-/knowledge_base/7-0/development-lifecycle-for-a-liferay-workspace), so clone the repo, build it with gradle and deploy the modules from the osgi/modules/ folder in your server. Or you can use Blade to [manage your server](https://dev.liferay.com/es/develop/tutorials/-/knowledge_base/7-0/managing-module-projects-with-blade-cli) and [deploy the application](https://dev.liferay.com/es/develop/tutorials/-/knowledge_base/7-0/deploying-modules-with-blade-cli)

You choose!

### Prerequisites

This examples have been tested in a Liferay DXP 7.1 fp2 version. Check the gradle dependencies for your system!

## JAX-RS

The citytours project will create two entities Tipo and Subtipo, and expose a JAX-RS endpoint at /city-tour-rest.

The following methods are available:

* /city-tour-rest/: Returns a message if the endpoint is found
* /city-tour-rest/tipos: Returns a list of all Tipos created
* /city-tour-rest/tipo/{tipoid}: Returns a single Tipo with the provided id as a query param
* /city-tour-rest/subtipos: Returns a list of all Subtipos created
* /city-tour-rest/subtipos/porid/: Returns a list of all Subtipos with the associated tipoId as a form param (eg. ?tipoId=XX)
* /city-tour-rest/subtipos/porid/: Returns a list of all Subtipos with the associated tipoId as a form param (eg. ?tipoId=XX)

These endpoints are meant to be consumed via the Form DataProvider shown in Javier Ahedo's demo. 

## UAD P.O.C.

This proof of concept creates an entity called Promocion meant to model a Travel Agency promo, with personal user data included. The uad process enables the user to export or delete all personal data, including Promociones.

The poc consists of the following projects:

* promociones-api: Interfaces for the service builder project
* promociones-service: Implementation and business logic for the service builder project
* promociones-uad: UAD logic, anonymization and exporting logic for Promociones.
* promociones-uad-test: Tests for promociones UAD project
* promociones-web: Portlet to CRUD Promociones.

### How to anoynmize or export?

Once all modules have been deployed, you will need to:

* Create a new user (you won't see anything if you only use Test Test)
* Deploy promociones-web portlet in a page (it's in the Sample category)
* Create a couple Promociones with different users
* Login in with an administrator
* Go to Users and Organizations --> The user you want to delete --> options --> Export and delete
* Go through all the steps and you should see all personal data has disappeared


## Warning

This project is not meant to be used in production, just to showcase some features. There are probably bugs and monsters hidden in the dark that I'm not even aware of, so use at your own risk.


