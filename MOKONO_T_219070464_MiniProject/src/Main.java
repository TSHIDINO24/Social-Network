import javafx.application.Application;
import javafx.stage.Stage;
import Display_GUI.Scenes;
/**
 * 
 */

/**
 * @author mbula
 *
 */
public class Main extends Application{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);
              
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Scenes s = new Scenes(primaryStage);
	}



}
