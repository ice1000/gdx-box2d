# LibGDX style binding for box2d 2.4.1

[![Java CI with Gradle](https://github.com/ice1000/gdx-box2d/actions/workflows/gradle.yml/badge.svg)](https://github.com/ice1000/gdx-box2d/actions/workflows/gradle.yml)
![Maven Central](https://img.shields.io/maven-central/v/org.aya-prover.gdx-box2d/core)

So I am using box2d in my game, and I saw box2c.
Then, I started following the updates of box2c,  and the `union_find` branch has stopped updating right after I started following it. So I went back to box2d, and realized even for box2d the libGDX binding is very old.
So I decided to update the box2d binding to 2.4.1 instead of creating one for box2c.

This project is again a multiplexed higher-order fork of @MobiDevelop's fork of libgdx's own box2d binding, with latest changes from official box2d adapted and the code is modified to support drawing ropes.

For development notes, see [notes](/notes/CHANGES.md).

## Gradle

Let `box2dVersion` be a string, whose value is the string displayed on the maven central badge.

```groovy
repositories {
  mavenCentral()
}
dependencies {
  implementation "org.aya-prover.gdx-box2d:core:$box2dVersion"
}
```
