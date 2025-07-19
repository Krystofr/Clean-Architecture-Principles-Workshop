# 🧱 Android Clean Architecture Template (Jetpack Compose + Hilt)

Covered in the **Ravyncore Mobile Android Bootcamp**, this project is built with best practices in mind to help you scale, test, and maintain production-level Android apps using modern tools like Jetpack Compose, Hilt, and Kotlin.

---

## 🔧 Tech Stack

- Kotlin
- Jetpack Compose
- Hilt for Dependency Injection
- Flow + Coroutines
- Room (Local DB)
- Ktor or Retrofit (Networking)
- Modular Codebase

---

## 📐 Project Structure (Clean Architecture)


---

## 💡 Layer-by-Layer Explanation

### 1. **Domain Layer** (`domain/`)
**Purpose**: Contains core business logic. This is the most stable and independent layer.

- `model/` – Clean Kotlin data models (no Android/DB/Network code)
- `usecase/` – Application-specific operations (e.g., `GetUserUseCase`)
- `repository/` – Abstract contract definitions (interfaces)

**✅ Benefits**:
- Fully testable
- Completely framework-agnostic
- Portable to other platforms (e.g. Compose Multiplatform)

---

### 2. **Data Layer** (`data/`)
**Purpose**: Acts as a bridge between `domain` and data sources (`network`, `database`).

- `repository/` – Implements domain interfaces
- `mapper/` – Converts between DTO ↔ Entity ↔ Domain
- `source/local/` – Room DAO interfaces
- `source/remote/` – API clients

**✅ Benefits**:
- Clear separation of responsibilities
- Easily swap sources (e.g., offline-first logic)
- Improves unit testing with mockable sources

---

### 3. **Presentation Layer** (`presentation/`)
**Purpose**: Handles `ViewModel` logic and UI state management.

- `viewmodel/` – One ViewModel per screen or feature
- `state/` – UI state classes (`sealed`, `data`, or `UiState`)
- `events/` – User-driven or app-driven events (optional)

**✅ Benefits**:
- Clear state-driven UI
- Improved reusability and testability
- Keeps UI logic out of the Composable functions

---

### 4. **App Layer (UI)** (`app/`)
**Purpose**: Contains the Jetpack Compose UI, navigation, DI setup, and screen definitions.

- `MainActivity.kt` – App entry point
- `screens/` – Feature-based Composables
- `navigation/` – Route definitions with NavController
- `di/` – Hilt modules (bindings for use cases, repos)
- `theme/` – Compose Material theme setup

**✅ Benefits**:
- UI stays declarative and reactive
- Composables remain stateless
- Easy navigation handling and dependency wiring

---

### 5. **Network Layer** (`network/`)
**Purpose**: Contains API clients and DTOs (data transfer objects).

- `api/` – Retrofit or Ktor interfaces
- `dto/` – Data models from APIs

**✅ Benefits**:
- Keeps network models separate from domain/UI
- Swappable without affecting core logic
- Centralized API structure

---

### 6. **Database Layer** (`database/`)
**Purpose**: Manages local storage using Room.

- `entity/` – Room entities
- `dao/` – Data access interfaces

**✅ Benefits**:
- Clear and isolated local persistence
- Supports caching and offline mode
- Easy unit testing via in-memory DBs

---

### 7. **Core Layer** (`core/`)
**Purpose**: Holds reusable components and utilities.

- `designsystem/` – Custom buttons, loaders, dialogs
- `result/` – `Result`, `Resource`, or `Either` wrapper classes
- `utils/` – Extensions, constants, formatters

**✅ Benefits**:
- Promotes code reuse
- Centralized UI styles
- Consistent handling of success/failure

---

### 8. **Testing Layer** (`testing/`)
**Purpose**: Shared mocks and test setup across modules.

**✅ Benefits**:
- Organized and scalable test setup
- Reuse fake data sources, models, and test helpers

---

## 📦 Scalability & Maintainability

This structure is built for long-term success:
- **Feature isolation** enables multiple devs to work in parallel
- **Clear separation of concerns** keeps bugs contained to layers
- **Testability** is improved due to pure Kotlin `domain` logic
- **Pluggable**: You can switch Room with SQLDelight, Retrofit with Ktor, or add new modules easily

---

## 🚀 Getting Started

1. Clone this repo
2. Open in Android Studio
3. Run `app` module on an emulator or a physical device
