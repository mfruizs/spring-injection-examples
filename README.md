# spring-injection-examples
Example project to show the various ways we have to inject packages in the context of springboot


## Autowired
> In Spring Boot, the @Autowired annotation is used for dependency injection. When placed on a field, a setter method, or a constructor, Spring will automatically search for an instance of the corresponding class and inject it into that field, method, or constructor during bean initialization.

* **GET** - http://localhost:8080/api/autowired

```java
@Service
public class AutowiredService {

	@Autowired
	public Repository repository;

}
```

## Create a new instance

* **GET** - http://localhost:8080/api/created

```java
@Service
public class CreateInstanceService {

	private final Repository repository;

	public CreateInstanceService() {

		this.repository = new Repository();
	}
}
```

## Using lombok with final modifier

* **GET** - http://localhost:8080/api/final

```java
@Service
@RequiredArgsConstructor
public class FinalService {

	private final Repository repository;
	
}
```
## Listing an implementation methods from one interface

> When we load a list of interfaces, what we will get is a list of all the implementations created for that interface

* **GET** - http://localhost:8080/api/interfaces/A
* **GET** - http://localhost:8080/api/interfaces/B

```java
@Service
@RequiredArgsConstructor
public class MainInterfaceService {

	private final List<ServiceInterface> services;

}
```
## Loading an Optional class

> In this case, `OptionalService` is conditioned to a property `service.optional.enabled` indicating that a class must be loaded, otherwise, 
> the context would not have the class loaded and would be null.

* **GET** - http://localhost:8080/api/optional

```java
@Service
@RequiredArgsConstructor
public class MainOptionalService {

	private Optional<OptionalService> optionalService;

	@Autowired
	public MainOptionalService(final Optional<OptionalService> optionalService) {

		this.optionalService = optionalService;
	}
}

@ConditionalOnProperty(name = "service.optional.enabled", havingValue = "true")
public class OptionalService {
    ...
}

```