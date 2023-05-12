package com.badlogic.gdx.physics.box2d;

public class Rope {
    // Question: why not use .ordinal()?
    public enum BendingModel {
        SpringAngle(0),
        PbdAngle(1),
        XpbdAngle(2),
        PbdDistance(3),
        PbdHeight(4),
        PbdTriangle(5);

        public final int value;

        BendingModel(int value) {
            this.value = value;
        }
    }
}
