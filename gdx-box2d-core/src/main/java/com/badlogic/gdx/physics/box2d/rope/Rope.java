package com.badlogic.gdx.physics.box2d.rope;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.JniUtil;
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

    @Override
    public void dispose() {
        jniDispose(addr);
    }

    private native void jniDispose(long addr); /*
        b2Rope* rope = (b2Rope*)addr;
        delete rope;
    */

//    ///
//    void Create(const b2RopeDef& def);

    public void create(RopeDef def) {
        RopeTuning tuning = def.tuning;
        float[] verts = JniUtil.arrayOfVec2IntoFloat(def.vertices);
        jniCreate(addr, def.count, verts, verts.length, def.masses, def.masses.length, def.gravity.x, def.gravity.y,
                tuning.stretchingModel.value, tuning.bendingModel.value, tuning.damping,
                tuning.stretchStiffness, tuning.stretchHertz, tuning.stretchDamping,
                tuning.bendStiffness, tuning.bendHertz, tuning.bendDamping,
                tuning.isometric, tuning.fixedEffectiveMass, tuning.warmStart);
    }

    private native void jniCreate(
            long addr, int count, float[] vertices, int vertLen, float[] masses, int massLen,
            float x, float y, int stretchingModel, int bendingModel, float damping, float stretchStiffness,
            float stretchHertz, float stretchDamping, float bendStiffness, float bendHertz,
            float bendDamping, boolean isometric, boolean fixedEffectiveMass, boolean warmStart); /*
        b2Rope* rope = (b2Rope*)addr;
        b2RopeDef def;
        def.count = count;
		int numVertices = vertLen / 2;
		b2Vec2* verticesOut = new b2Vec2[numVertices];
		int offset = 0;
		for(int i = 0; i < numVertices; i++) {
			verticesOut[i] = b2Vec2(verts[(i<<1) + offset], verts[(i<<1) + offset + 1]);
		}
		float* massesOut = new float[massLen];
		for(int i = 0; i < massLen; i++) {
		    massesOut[i] = masses[i];
        }
        def.vertices = verticesOut;
        def.masses = massesOut;
        def.gravity.Set(x, y);
        def.tuning.stretchingModel = (b2StretchingModel)stretchingModel;
        def.tuning.bendingModel = (b2BendingModel)bendingModel;
        def.tuning.damping = damping;
        def.tuning.stretchStiffness = stretchStiffness;
        def.tuning.stretchHertz = stretchHertz;
        def.tuning.stretchDamping = stretchDamping;
        def.tuning.bendStiffness = bendStiffness;
        def.tuning.bendHertz = bendHertz;
        def.tuning.bendDamping = bendDamping;
        def.tuning.isometric = isometric;
        def.tuning.fixedEffectiveMass = fixedEffectiveMass;
        def.tuning.warmStart = warmStart;
        rope->Create(def);
        delete[] verticesOut;
        delete[] massesOut;
    */

//    ///
//    void SetTuning(const b2RopeTuning& tuning);

    public void step(float timeStep, int iterations, Vector2 position) {
        jniStep(addr, timeStep, iterations, position.x, position.y);
    }

    private native void jniStep(long addr, float timeStep, int iterations, float x, float y); /*
        b2Rope* rope = (b2Rope*)addr;
        rope->Step(timeStep, iterations, b2Vec2(x, y));
    */

    public void reset(Vector2 position) {
        jniReset(addr, position.x, position.y);
    }

    private native void jniReset(long addr, float x, float y); /*
        b2Rope* rope = (b2Rope*)addr;
        rope->Reset(b2Vec2(x, y));
    */

//    ///
//    void Draw(b2Draw* draw) const;
}
