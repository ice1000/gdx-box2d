import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class DesktopLauncher {

  public static void main(String[] argv) {
    launch(new Box2dLightTest());
  }

  public static void launch(ApplicationListener app) {
    Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
    config.setTitle("box2d lights test");
//    config.width = 800;
//    config.height = 480;
//    config.samples = 4;
//    config.depth = 0;
    config.useVsync(true);

    new Lwjgl3Application(app, config);
  }

}
