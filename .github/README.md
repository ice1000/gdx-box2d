# LibGDX style binding for box2d 2.4.1

[![Java CI with Gradle](https://github.com/ice1000/gdx-box2d/actions/workflows/gradle.yml/badge.svg)](https://github.com/ice1000/gdx-box2d/actions/workflows/gradle.yml)
![Maven Central](https://img.shields.io/maven-central/v/org.aya-prover.gdx-box2d/core)

When I started following the updates of box2c, the project has not been developed for more than a week.
So I decided to update the box2d binding to 2.4.1 instead of creating one for box2c.

This project is again a multiplexed higher-order fork from libgdx's own box2d binding to @MobiDevelop's fork, with latest changes from official box2d adapted and the code is modified to support drawing ropes.

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
