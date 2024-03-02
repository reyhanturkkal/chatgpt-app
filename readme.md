# ChatGPT App

Bu projede, yalnızca metin istemleri kullanarak soru yanıtlama görevleri için OpenAI API kullanılmıştır. Light/night mode are adapted to the theme of the device.

## OpenAI API Usage

There are different models offering various possibilities, including specific pricing in exchange for certain features or services. For detailed information on the models and their use, see the <a href="https://platform.openai.com/docs/introduction">documentation page</a>

In this project text prompt was used. You can get an <a href="https://platform.openai.com/api-keys">API key</a> by paying a fee for the request limitations in the model you have chosen.

## Dependencies and Configurations

```kotlin
dependencies {
    implementation 'androidx.core:core-ktx:1.8.0'
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
}
```

```kotlin
android {
    compileSdkVersion 34
    defaultConfig {
        minSdkVersion 26
        targetSdkVersion 34
    }
```

```kotlin
// AndroidManifest.xml
<uses-permission android:name="android.permission.INTERNET"/>
```

## Images of the Application

### Light Mode / Dark Mode

<table style="border-collapse: collapse; width: 100%;">
  <tr>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/chatgpt-app/blob/master/assets/beginPage.jpg" alt="home page"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/chatgpt-app/blob/master/assets/chatPage.jpg" alt="chat page"></td>
  </tr>
</table>
