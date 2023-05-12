## 11 May 2023

This is an attempt to port box2d 2.4.1 to Java.

0. Lots of the old_changes todos are cleared by @MobiDevelop
0. Attempted to implement `Shape::testPoint`
1. Ropes and the corresponding test. `setTuning` is left because it's just a subset of `create`
2. No-ops for now:
   * `com.badlogic.gdx.physics.box2d.World#setDestructionListener`
   * `com.badlogic.gdx.physics.box2d.World.setUseDefaultContactFilter`
