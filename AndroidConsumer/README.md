# Urbanizer Consumer Android App (Kotlin, Jetpack Compose)

A modern Android app for booking on-demand services (beauty, wellness, home repairs, and more) as part of the Urbanizer platform.

- **Jetpack Compose UI**
- **MVVM + Clean Architecture**
- **Hilt Dependency Injection**
- **Navigation with Compose**
- **Room, Retrofit, Coil**

## What I Learned

- How to structure a scalable Android app using MVVM and Clean Architecture
- How to set up Jetpack Compose navigation for multi-screen flows
- How to use Hilt for dependency injection across ViewModels and repositories
- How to organize data, domain, and presentation layers for testability
- How to implement ViewModels for state management and business logic
- How to theme and style apps with Compose
- How to modularize features for maintainability

## Project Structure

```
AndroidConsumer/
└── app/
    ├── build.gradle.kts
    ├── proguard-rules.pro
    └── src/
        ├── androidTest/
        │   └── java/com/urbanizer/consumer/
        │       └── ExampleInstrumentedTest.kt
        ├── main/
        │   ├── AndroidManifest.xml
        │   ├── java/com/urbanizer/consumer/
        │   │   ├── data/           # API, local storage, models, repositories
        │   │   ├── di/             # Hilt DI setup (MyApp.kt)
        │   │   ├── domain/         # Business logic, use cases, domain models
        │   │   ├── navigation/     # Compose navigation setup
        │   │   ├── presentation/   # UI screens, ViewModels, components
        │   │   ├── ui/theme/       # Theming and styling
        │   │   ├── utils/          # Utility classes and helpers
        │   └── res/
        │       ├── drawable/
        │       ├── navigation/
        │       ├── values/
        │       │   ├── colors.xml
        │       │   ├── strings.xml
        │       │   └── themes.xml
        │       └── xml/
        └── test/
            └── java/com/urbanizer/consumer/
                └── ExampleUnitTest.kt
```

## Key Features

- Phone number authentication with OTP
- Location-based service discovery
- Real-time booking and tracking
- Multiple payment options
- Rating and review system
- Subscription management

## Development

- Open `AndroidConsumer/app/` in Android Studio
- Sync Gradle and run on an emulator or device
- All navigation, ViewModel, and DI setup is ready for feature development

---

This project is a solid foundation for scalable, maintainable Android apps using modern best practices! 