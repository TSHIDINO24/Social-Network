package Display_GUI;




import graph.myGraph;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




public class Scenes{
	private Scene scene;
	private MinCanvas canv;
	private myGraph graph;
	private HBox root;
	private VBox options;

	
	public Scenes(Stage prim) {
		VBox space = new VBox();
		canv = new MinCanvas();
		graph = new myGraph();
		graph.read();
		canv.draw(graph);
		
		space.setSpacing(5);
		root = new HBox();
		root.getChildren().add(space);
		root.setSpacing(10);
		options = new VBox();
		
	/*
	 * setup user options
	 */

		Label username = new Label("\nUsername:");
		TextField usernametxt = new TextField();
		
	
		Label password = new Label("\nPassword");
		TextField passwordtxt = new TextField();
		
		Button signIn=new Button("Log in");
		signIn.setMinWidth(220);
	
		options.getChildren().addAll(new Label(),username,usernametxt,password,passwordtxt,signIn);
	
		
		
		root.getChildren().addAll(options, canv);
	
		scene = new Scene(root);
		
		prim.setScene(scene);
		prim.setWidth(canv.getWidth() + 250);
		prim.setTitle("Website Credential Intruder Tracker");
		prim.show();
		
	}
	
}


