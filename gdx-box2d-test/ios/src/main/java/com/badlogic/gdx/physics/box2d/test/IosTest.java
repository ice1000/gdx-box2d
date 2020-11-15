package com.badlogic.gdx.physics.box2d.test;

import com.badlogic.gdx.physics.box2d.Box2DTestCollection;
import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.uikit.UIApplication;

import com.badlogic.gdx.backends.iosrobovm.IOSApplication;
import com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration;

/** Launches the iOS (RoboVM) application. */
public class IosTest extends IOSApplication.Delegate {
	@Override
	protected IOSApplication createApplication() {
		IOSApplicationConfiguration configuration = new IOSApplicationConfiguration();
		return new IOSApplication(new Box2DTestCollection(), configuration);
	}

	public static void main(String[] argv) {
		NSAutoreleasePool pool = new NSAutoreleasePool();
		UIApplication.main(argv, null, IosTest.class);
		pool.close();
	}
}