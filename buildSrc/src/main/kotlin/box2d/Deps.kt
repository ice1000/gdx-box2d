package box2d

object Deps {

    val gdx = "com.badlogicgames.gdx:gdx:${Versions.gdx}"

    object Android {
        val gdx = listOf(
            "com.badlogicgames.gdx:gdx-backend-android:${Versions.gdx}"
        )
        object Natives {
            val gdx = listOf(
                "com.badlogicgames.gdx:gdx-platform:${Versions.gdx}:natives-armeabi",
                "com.badlogicgames.gdx:gdx-platform:${Versions.gdx}:natives-armeabi-v7a",
                "com.badlogicgames.gdx:gdx-platform:${Versions.gdx}:natives-arm64-v8a",
                "com.badlogicgames.gdx:gdx-platform:${Versions.gdx}:natives-x86",
                "com.badlogicgames.gdx:gdx-platform:${Versions.gdx}:natives-x86_64"
            )
        }
    }

    object Desktop {
        val gdx = listOf(
            "com.badlogicgames.gdx:gdx-backend-lwjgl3:${Versions.gdx}"
        )
        object Natives {
            val gdx = listOf(
                "com.badlogicgames.gdx:gdx-platform:${Versions.gdx}:natives-desktop"
            )
        }
    }

    object IOS {
        val gdx = listOf(
            "com.badlogicgames.gdx:gdx-backend-robovm:${Versions.gdx}"
        )

        object Natives {
            val gdx = listOf(
                "com.badlogicgames.gdx:gdx-platform:${Versions.gdx}:natives-ios"
            )
        }

        val robovm = listOf(
            "com.mobidevelop.robovm:robovm-rt:${Versions.robovm}",
            "com.mobidevelop.robovm:robovm-cocoatouch:${Versions.robovm}"
        )
    }

}