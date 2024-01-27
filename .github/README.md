# LibGDX style binding for box2d 2.4.1 and box2dLight

[![Java CI with Gradle](https://github.com/ice1000/gdx-box2d/actions/workflows/gradle.yml/badge.svg)](https://github.com/ice1000/gdx-box2d/actions/workflows/gradle.yml)
[![Maven Central](https://img.shields.io/maven-central/v/org.aya-prover.gdx-box2d/box2d)](https://repo1.maven.org/maven2/org/aya-prover/gdx-box2d)

**This project needs help on testing and feedbacks!**

This project is (again) a multiplexed higher-order fork of @MobiDevelop's fork of libgdx's own box2d binding, with latest changes from official box2d adapted and the code is modified to support drawing ropes.

Regarding box2c: I'll create a separate subproject box2c once Erin figured out the sorting thing in the `union_find` branch.

For development notes, see [notes](/notes/CHANGES.md).

Since box2dLight also depends on box2d, I've also ported box2dLight to this project, with deprecation fixes.

## Gradle

Let `box2dVersion` be a string, whose value is the string displayed on the maven central badge.

Note that previously, `box2d` was called `core`, but it is **renamed**
so to align better with the new subproject `box2c`.
Make sure you use `box2d` now.

```groovy
repositories {
  mavenCentral()
}
dependencies {
  // box2d
  implementation "org.aya-prover.gdx-box2d:box2d:$box2dVersion"
  // box2c, when available
  implementation "org.aya-prover.gdx-box2d:box2c:$box2dVersion"
  // box2dLight
  implementation "org.aya-prover.gdx-box2d:light:$box2dVersion"
}
```

## Compatibility

+ Java: 1.7 (let me know once RoboVM supports Java 8/11/17)
+ Ubuntu: 22.04 (if you know how to use Ubuntu 18.04 on GitHub Actions, please enlighten me)
+ libstdc++-dev: 12 (latest version supported by the Ubuntu image available)
+ macOS: latest, using GitHub Actions (I cannot afford Apple products)
+ libGDX: 1.12.1
+ RoboVM: 2.3.20
