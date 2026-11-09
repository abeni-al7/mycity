# My City

A city guide app: browse categories of places, pick one, and see its details.

Built while following Google's [Android Basics with Compose](https://developer.android.com/courses/android-basics-compose/course) course (the "My City" project).

## Features

- Categories screen: Coffee, Restaurants, Kids, Parks, Shopping Centers
- Places screen listing the places in the chosen category (e.g. Tomoca Coffee, Unity Park, Entoto Park)
- Detail screen with a large image and description
- Up navigation in the app bar

## Built with

- Kotlin, Jetpack Compose, Material 3
- Navigation Compose (`NavHost` with Categories / Places / Detail routes)
- `ViewModel` with `StateFlow<MyCityUiState>`
- Static data objects per category in `data/`
- Min SDK 24, target/compile SDK 35

## Run it

1. Open the project folder in Android Studio and let Gradle sync.
2. Run the `app` configuration on an emulator or device (Android 7.0 / API 24 or newer).

Or, with a device or emulator connected:

```sh
./gradlew installDebug
```
