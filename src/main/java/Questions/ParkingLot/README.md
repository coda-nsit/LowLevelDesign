# Parking Lot System (Java Design Patterns)

## Overview

This project implements a **Parking Lot System** using **Object-Oriented Design** and several **Design Patterns**.

The system supports:

* Vehicle creation
* Parking spot allocation
* Spot reservation
* Payment processing

Design patterns used in the project:

* **Factory Pattern** → Vehicle creation
* **Singleton Pattern** → ParkingLot instance
* **Strategy Pattern** → Payment processing

---

# System Components

The main components of the system are:

* `IVehicle` interface
* `Car` and `Truck` implementations
* `VehicleCreatorFactory`
* `ParkingLot` (Singleton)
* `ParkingSpot`
* `PaymentStrategy`
* `CreditCardPaymentStrategy`
* `CashPaymentStrategy`
* `PaymentInfo`

---

# Design Patterns Used

## 1. Factory Pattern (Vehicle Creation)

The **Factory Pattern** is used to create vehicles without exposing the instantiation logic to the client.

### Vehicle Interface

```java
public interface IVehicle {
    String getVehicleNumber();
}
```

### Concrete Implementations

```text
Car
Truck
```

### Vehicle Factory

```java
IVehicle vehicle = VehicleCreatorFactory.createVehicle("CAR");
```

The factory decides which concrete vehicle object (`Car` or `Truck`) to return.

### Benefits

* Encapsulates object creation
* Makes the system easily extensible
* Reduces dependency on concrete classes

---

# 2. Singleton Pattern (ParkingLot)

The **ParkingLot** is implemented using the **Singleton Pattern** to ensure only **one instance of the parking lot exists**.

### Example

```java
ParkingLot parkingLot = ParkingLot.getInstance();
```

### Responsibilities

* Manage all parking floors
* Maintain parking spots
* Allocate parking spots
* Reserve spots for vehicles
* Trigger payment processing

### Benefits

* Ensures centralized parking management
* Prevents inconsistent parking states
* Provides a global access point

---

# 3. Strategy Pattern (Payment Processing)

The **Strategy Pattern** is used to support **multiple payment methods**.

Instead of hardcoding payment logic, the system selects a **payment strategy dynamically**.

---

## PaymentStrategy Interface

Defines the common payment behavior.

```java
public interface PaymentStrategy {
    PaymentInfo pay(Ticket parkingTicket);
}
```

---

## Concrete Payment Strategies

### Credit Card Payment

```text
CreditCardPaymentStrategy
```

Handles payments made using a credit card.

---

### Cash Payment

```text
CashPaymentStrategy
```

Handles payments made using cash.

---

## PaymentInfo Class

The `PaymentInfo` class stores payment transaction details.

### Example Fields

```java
public class PaymentInfo {

    private Double amount;
    private LocalDate paymentDate;
    private Integer transactionId;
    private Ticket ticket;
    private PaymentStatus paymentStatus;

}
```

### Responsibilities

* Store payment details
* Maintain transaction information
* Track payment status

---

# Parking Spot

Each parking spot contains:

* `spotNumber`
* `floorNumber`
* `isAvailable`

### Example

```java
public class ParkingSpot {

    private int spotNumber;
    private int floorNumber;
    private boolean isAvailable;

}
```

Responsibilities:

* Track spot availability
* Reserve parking spot
* Release spot when vehicle exits

---

# Parking Flow

The complete system workflow is shown below.

### Step 1: Vehicle Creation

User selects vehicle type.

```
VehicleCreatorFactory
        ↓
Car / Truck object created
```

---

### Step 2: Enter Parking Lot

```
ParkingLot.getInstance()
```

---

### Step 3: Find Available Parking Spot

ParkingLot searches for an available spot based on:

* Floor number
* Spot availability

---

### Step 4: Reserve Spot

If an available spot is found:

```
ParkingSpot.isAvailable = false
```

The spot is reserved for the vehicle.

---

### Step 5: Payment Processing

User selects payment method.

```
PaymentStrategy
     ↓
CashPaymentStrategy OR CreditCardPaymentStrategy
     ↓
pay(ticket)
     ↓
PaymentInfo generated
```

---

# Example Flow

```
User selects vehicle type
        ↓
VehicleCreatorFactory creates Car
        ↓
Vehicle enters ParkingLot
        ↓
ParkingLot finds available ParkingSpot
        ↓
Spot reserved
        ↓
User selects payment method
        ↓
PaymentStrategy executes payment
        ↓
PaymentInfo generated
        ↓
Parking confirmed
```

---

# Advantages of the Design

✔ **Extensible vehicle creation** using Factory Pattern
✔ **Single parking lot instance** using Singleton Pattern
✔ **Flexible payment methods** using Strategy Pattern
✔ **Loose coupling between components**
✔ **Easy to add new vehicle types or payment methods**

---

# Future Improvements

Possible enhancements:

* Add **Bike / Electric Vehicle**
* Add **different spot sizes**
* Add **ticket generation**
* Implement **entry and exit gates**
* Support **online payments / UPI**
* Real-time **parking availability dashboard**

---

# Technologies Used

* Java
* Object-Oriented Programming
* Design Patterns

    * Factory Pattern
    * Singleton Pattern
    * Strategy Pattern
