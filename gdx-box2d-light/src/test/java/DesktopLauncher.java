import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class DesktopLauncher {

  public static void main(String[] argv) {
    Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
    config.setTitle("box2d lights test");
//    config.width = 800;
//    config.height = 480;
//    config.samples = 4;
//    config.depth = 0;
    config.useVsync(true);

    new Lwjgl3Application(new Box2dLightTest(), config);
  }

}
