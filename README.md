<h1 align="center">Flashbar</h1></br>

<p align="center">
  <a href="https://jitpack.io/#airalpha/flashbar/1.0.1"><img alt="License" src="https://badgen.net/badge/Jitpack/1.0.1/orange?icon=github"/></a>
  <a href="https://github.com/airalpha"><img alt="Profile" src="https://badgen.net/badge/Github/airalpha/green?icon=github"/></a>
</p><br>

<p align="center">
Flashbar is a custom snackbar library for Android Jetpack Compose, 🚀 designed to make displaying stylish and customizable snackbars a breeze while supporting the Material 3 design system. 💫
</p><br>

<p align="center">
<img src="https://github.com/airalpha/flashbar/blob/main/capture/success.png?raw=true" width="268"/>
<img src="https://github.com/airalpha/flashbar/blob/main/capture/error.png?raw=true" width="268"/>
</p>

## Download 📥
<a href="https://jitpack.io/#airalpha/flashbar/1.0.1"><img alt="License" src="https://badgen.net/badge/Jitpack/1.0.1/orange?icon=github"/></a>

### Gradle 🐘
Add the dependency below to your module's `build.gradle` or `build.gradle.kts` file:
```gradle
dependencies {
    implementation "com.github.airalpha:flashbar:1.0.1"
}
```
Add a repository in your `settings.gradle` file:
```
dependencyResolutionManagement {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

## Usage Example 
```kotlin
// In your Compose UI code
Scaffold(
    snackbarHost = { FlashbarHost() }
) {
    // Your Compose content here
}

// Displaying a success message
Flash.success("Welcome to flashbar")
// Displaying a error message
Flash.error(Exception("The user is not connected"))
```

## Like what you see? :yellow_heart:
⭐ Give a star to this repository. <br />


# License
```xml
Designed and developed by 2023 airalpha (Idrice A.)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```