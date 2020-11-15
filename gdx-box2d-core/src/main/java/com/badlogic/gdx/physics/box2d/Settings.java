package com.badlogic.gdx.physics.box2d;

public class Settings {
    // @off
	/*JNI
#include <box2d/box2d.h>
	 */

//    public static native void setLengthUnitsPerMeter(float value); /*
//        b2_lengthUnitsPerMeter = value;
//    */

    public static native float getLengthUnitsPerMeter(); /*
        return b2_lengthUnitsPerMeter;
    */

}
