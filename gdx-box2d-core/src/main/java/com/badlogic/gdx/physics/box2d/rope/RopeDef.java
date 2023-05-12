package com.badlogic.gdx.physics.box2d.rope;

import com.badlogic.gdx.math.Vector2;

public class RopeDef {
    public float[] masses;
    public int count;
    public RopeTuning tuning;
    public Vector2[] vertices;
    public Vector2 position;
    public Vector2 gravity;

    public RopeDef() {
        position = new Vector2();
        vertices = null;
        count = 0;
        masses = null;
        gravity = new Vector2();
        tuning = new RopeTuning();
    }
}
