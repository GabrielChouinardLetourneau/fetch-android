# Android coding exercise
This Android application targets the SDK **35** with a minimum of **21**. Since this is considered as a production-ready application, the first step of signature for release have been started.

## Setup
For the debug config, a keystore needs to be created with the alias/passwords inclueded in `build.gradle.kts` and moved to the root of the project. The signingConfigs in debug needs to be adjusted to correct path of the keystore file.

## Dependencies
### Compilation
- Java and jvm: **17**
- Gradle: **8.12**
- Gradle JDK: **21.0.3**
- Android Studio: **Android Studio Ladybug | 2024.2.1 Patch 3**

### Librairies
- Kotlin: **2.1.0**
- Dagger: **2.54**
- HiltAndroid: **2.54**
- EspressoCore: **3.6.1**
- Lifecycle: **2.8.7**
- JUnit: **4.13.2**
- Retrofit: **2.11.0**
- Mockito: **5.14.2**
- agp: **8.7.3**