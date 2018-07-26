Basic example showing how to use `swagger-codegen-maven-plugin` to generate Java Model classes from swagger.json file
For post at: https://melissapalmer.github.io/documentation/2018/07/27/swagger-codegen-2generatejavamodels.html


To build the code
===
	`mvn clean compile`

To Run: 
===
	`mvn spring-boot:run`
	
After which you should see the following printed to the console:

```
==================================================
Using pet generated code:
class Pet {
    id: 1
    category: class Category {
        id: 1
        name: Cats
    }
    name: Black Cat
    photoUrls: []
    tags: null
    status: available
}

==================================================
```