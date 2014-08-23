javassist-build-plugin-api [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.stephanenicolas.javassist/javassist-build-plugin-api/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.stephanenicolas.javassist/javassist-build-plugin-api)
==========================
**Common API to transform classes via Javassist during gradle and maven builds. Works on Android too.**

## Why ?

This API allows to create `IClassTransfomer`s that can be used interchangeably in gradle and maven builds.

It introduces a few classes and interfaces in the package name space of [Javassist](//github.com/jboss-javassist/javassist) : `javassist.build`.  


## Usage 

Basically, you will define a [`IClassTransfomer`](https://github.com/stephanenicolas/javassist-build-plugin-api/blob/master/src/main/java/javassist/build/IClassTransformer.java) and use Javassist to perform transformations of classes (class files).

```java
public interface IClassTransformer {
	void applyTransformations(CtClass ctClass) throws JavassistBuildException;
	boolean shouldTransform(CtClass ctClass) throws JavassistBuildException;
}
```

For more instructions to use javassist based transfomations during builds, please refer to :

* [Javassist Maven Plugin](//github.com/icon-Systemhaus-GmbH/javassist-maven-plugin)
* [Javassist Gradle Plugin](//github.com/darylteo/javassist-gradle-plugin)
* [Morpheus, Android gradle plugin](//github.com/stephanenicolas/morpheus)

Some libs that may help to create powerfull transformers :
* [AfterBurner](https://github.com/stephanenicolas/afterburner)
* [Mimic](https://github.com/stephanenicolas/mimic)





