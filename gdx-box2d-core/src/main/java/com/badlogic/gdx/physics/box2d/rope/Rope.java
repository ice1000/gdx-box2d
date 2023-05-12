package com.badlogic.gdx.physics.box2d.rope;

import com.badlogic.gdx.utils.Disposable;

/**
 * b2_rope.h
 *
 * @author ice1000
 */
public class Rope implements Disposable {
    // @off
	/*JNI
#include <box2d/box2d.h>
	 */
    protected long addr;

    protected Rope(long addr) {
        this.addr = addr;
    }

    public Rope() {
        this(newRope());
    }

    private static native long newRope(); /*
        return (jlong)(new b2Rope());
    */

    @Override public void dispose() {
        jniDispose(addr);
    }

    private native void jniDispose(long addr); /*
        b2Rope* rope = (b2Rope*)addr;
        delete rope;
    */

//    ///
//    void Create(const b2RopeDef& def);
//
//    ///
//    void SetTuning(const b2RopeTuning& tuning);
//
//    ///
//    void Step(float timeStep, int32 iterations, const b2Vec2& position);
//
//    ///
//    void Reset(const b2Vec2& position);
//
//    ///
//    void Draw(b2Draw* draw) const;
}
