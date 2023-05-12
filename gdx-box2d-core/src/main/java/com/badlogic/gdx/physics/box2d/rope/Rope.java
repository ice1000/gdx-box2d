package com.badlogic.gdx.physics.box2d.rope;

/**
 * b2_rope.h
 *
 * @author ice1000
 */
public class Rope {
    // @off
	/*JNI
#include <box2d/box2d.h>
	 */
    protected long addr;

    public Rope(long addr) {
        this.addr = addr;
    }
}
