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

- **Abstract Creator:** Declares a factory method.

- **Concrete Subclasses:** Implement this method to create specific objects.

- **Product Interface:** The created objects implement a common interface.

- **Client Usage:** Uses the creator’s interface without depending on concrete classes.

- Separates object creation logic from object usage logic.

### Diagram of example

![Factory_Mehtod](images/factory_method.png)


### 🚀 When to use it

| Situation | Description |
|-----------|------------|
| Unknown object type | When a class cannot anticipate the type of objects it needs to create. |
| Decoupling | When you want to decouple the client from concrete implementations. |
| Frequent new products | When you plan to introduce new product types frequently. |
| Centralized creation | To centralize object creation logic in subclasses. |

### 💡Benefists

| Benefit | Description |
|---------|------------|
| Reduce coupling | Reduces coupling between client and concrete classes. |
| Open/Closed | Easier to extend without modifying existing code. |
| Maintainability | Centralizes creation logic. |
| Flexibility | Add new types without changing existing code. |

### ⚠️ Disadvanteges 

- Can increase the number of classes in the project.

- Might be overkill for simple object creation.

### 🧪 Example output
```text
---- Trying EmailService ----
Sending Email to user...
---- Trying SMSService ----
Sending SMS to user...
---- Trying PushService ----
Sending PUSH message  to user...

---




### 🧠 General Description


### Diagram of example


### 🚀 When to use it

### 💡Benefists

### ⚠️ Disadvanteges 

### 🧪 Example output
