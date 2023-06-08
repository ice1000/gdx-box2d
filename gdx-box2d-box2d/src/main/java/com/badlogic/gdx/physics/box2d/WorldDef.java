package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

public class WorldDef {
  public final Vector2 gravity;
  public boolean doSleep;

  public WorldDef(Vector2 gravity) {
    this(gravity, false);
  }

  public WorldDef(Vector2 gravity, boolean doSleep) {
    this.gravity = gravity;
    this.doSleep = doSleep;
  }
}
