# PageCurlEffectLikeBook
 
  This repository contains how you can easily use this code to make a page curl effect like book. 
  
  Add this dependency in your build.gradle(module:app)  : 
dependencies {

    implementation 'app.num.numandroidpagecurleffect:numandroidpagecurleffect:1.0'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    
}

Add this line in gradle.properties : 

      android.enableJetifier=true

Add these 2 lines in settings.gradle : 
      dependencyResolutionManagement {  
      
        maven { url 'https://jitpack.io' }
        jcenter()
        
}
  
To see the full tutorial see this video on my youtube channel : https://youtu.be/ycLkVmQ2VUA

Hope it helps you.
