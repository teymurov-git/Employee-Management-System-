# Employee Management System

## About the Project
This project represents an **Employee Management System** for a bank. The system is designed to be open for extension and closed for modification, following the **SOLID principles**, especially the **Open/Closed Principle (OCP)**.

Currently, the system supports two types of employees:
- **Developer**
- **Manager**

Each employee has the following fields:
- `name` (String) – employee's name
- `id` (int) – employee's ID
- `salary` (double) – employee's salary

Additional fields:
- **Developer** – `programmingLanguage`
- **Manager** – `teamSize`

## Structure and Technologies
- **Java**
- **Abstraction** – `Employee` abstract class
- **Polymorphism** – `calculateBonus()` and `work()` methods are called polymorphically
- **Interface** – `IWorkable` interface ensures all employees implement the `work()` method

## Requirements and Implementation
1. **Employee abstract class**
    - Fields: `name`, `id`, `salary`
    - Constructor and getters
    - `calculateBonus()` – abstract method, implemented differently for each employee type
    - `toString()` method overridden

2. **Developer and Manager**
    - Extend the `Employee` class
    - Override the `calculateBonus()` method
    - Bonus calculation:
        - Developer: **20%**
        - Manager: **30%**
    - Implement the `IWorkable` interface and provide the `work()` method

3. **IWorkable interface**
   ```java
   public interface IWorkable {
       void work();
   }
   ``
