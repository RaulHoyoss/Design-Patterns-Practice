# 🧩 Design Patterns Practice (Java)

A reporitory for practicing and learning the implementation of Design Patterns in Java. 
Each pattern includes a description, a diagram with an example, guidance on when to use it, and its benefits.

---

## 📚 Index

- [Factory Method](#factory-method)
- [Singleton](#singleton)
- [Observer](#observer)
- [Strategy](#strategy)
- [Decorator](#decorator)

---

## 🏭 Factory Method

### 🧠 General Description

- Defines an abstract creator class that declares a factory method.

- Concrete subclasses implement this method to create specific objects.

- The created objects implement a common interface (product).

- The client uses the creator’s interface without depending on concrete classes.

- Separates object creation logic from object usage logic.


### Diagram of example

![Factory_Mehtof](Images/factory_method.png)


### 🚀 When to use it

- When a class cannot anticipate the type of objects it needs to create.

- When you want to decouple the client from concrete implementations.

- When you plan to introduce new product types frequently.

- To centralize object creation logic in subclasses.

### 💡Benefists

- Reduces coupling between client and concrete classes.

- Makes code easier to extend (follows the Open/Closed Principle).

- Centralizes creation logic, improving maintainability.

- Allows flexibility in adding new types without modifying existing code

### ⚠️ Disadvanteges 

- Can increase the number of classes in the project.

- Might be overkill for simple object creation.

### 🧪 Example output

---- Trying EmailService ----
Sending Email to user...
---- Trying SMSService ----
Sending SMS to user...
---- Trying PushService ----
Sending PUSH message  to user...

---


## 🏭 Factory Method

### 🧠 General Description


### Diagram of example


### 🚀 When to use it

### 💡Benefists

### ⚠️ Disadvanteges 

### 🧪 Example output
