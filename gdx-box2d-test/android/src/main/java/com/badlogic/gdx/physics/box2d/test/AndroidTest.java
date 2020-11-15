package com.badlogic.gdx.physics.box2d.test;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.physics.box2d.Box2DTestCollection;

public class AndroidTest extends AndroidApplication {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize(new Box2DTestCollection());
    }

}
