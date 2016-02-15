# Generic DAO vs JPA Repository

Small _Spring Boot_ application with 2 REST services to fetch _manuals_ containing _rules_: One made with JPA Repository, the other using a Generic DAO.

### Usage

The available REST mapping are:
* __get all__ : /[method]/manuals
* __get by id__ : /[method]/manuals/{id}
* __get rules for given manual__ : /[method]/manuals/{id}/rules

for each of those paths, [method] can be either __generic__ or __jpa__

The output with both method should be identical