/**
 * 
 */
package Display_GUI;

import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;

import MyDrawer.DrawObject;
import UserInfor.UserConnection;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * @author tshid
 *
 */
public class MinCanvas extends Canvas{

	private static final int HEIGHT = 729;
	private static final int WIDTH = 930;
	
	private DrawObject drawer;
	
	private GraphicsContext gc;
	
	public MinCanvas() { 
		super();
		setHeight(HEIGHT);
		setWidth(WIDTH);
		
		gc = getGraphicsContext2D();
		drawer = new DrawObject(gc);
	}
	
	public void draw(Graph<UserConnection> g) {
		
		gc = this.getGraphicsContext2D();
		gc.setFill(Color.ANTIQUEWHITE);
		gc.clearRect(0, 0, getWidth(), getHeight());
		gc.fillRect(0, 0, getWidth(), getHeight());
		
		
		for(Edge<UserConnection> e : g.getEdges()) 
			drawer.draw(e);
 		
		for (Vertex<UserConnection> v : g.getVertices()) 
			v.getValue().accept(drawer);
		
	}
}
