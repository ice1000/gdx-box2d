package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class DesktopTest {
    public static void main(String[] args) {
        new Lwjgl3Application(new Box2DTestCollection(), new Lwjgl3ApplicationConfiguration());
    }
}
