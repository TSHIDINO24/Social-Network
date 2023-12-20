/**
 * 
 */
package MyDrawer;

import com.jwetherell.algorithms.data_structures.Graph.Edge;

import UserInfor.UserConnection;
import UserInfor.Username;
import UserInfor.Username2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * @author tshid
 *
 */
public class DrawObject implements IDrawVisitor {

	private GraphicsContext gc;

	private static final Color coal_s = Color.WHITE;
	 
	public DrawObject(GraphicsContext gc) {
		this.gc = gc;
	}
	
	@Override
	public void draw(Username ps) {
		// TODO Auto-generated method stub
		
		double x = ps.getXcod();
		double y = ps.getYcod();
		gc.setFill(Color.BLACK);
		gc.fillText(ps.getName()+ "-" + (int)x + - + (int)y, (int)x - 20, (int)y - 8, 500);
		
		gc.setFill(Color.ALICEBLUE);
		gc.fillRect(ps.getXcod(), ps.getYcod(), 15, 15);
	}

	@Override
	 public void draw(Username2 cs) { 
		  double x = cs.getXcod();
		  double y = cs.getYcod();
		  
		  gc.setFill(Color.BLACK);
		  gc.fillText(cs.getName()+ "-" + (int)x + - + (int)y, (int)x - 20, (int)y - 8, 500);
		  gc.setFill(coal_s);
		  gc.fillOval(x, y, 15, 15);
	  }
	/**
	 * draws an edge between respective nodes
	 * @param allEdges 
	 */
	@Override
	public void draw(Edge<UserConnection> e) {
		gc.setStroke(Color.BLACK);
		double x = e.getFromVertex().getValue().getXcod() + 5;
		double y = e.getFromVertex().getValue().getYcod() + 5;
		double x2 = e.getToVertex().getValue().getXcod() + 5;
		double y2 = e.getToVertex().getValue().getYcod() + 5;
		
		gc.strokeLine(x, y, x2, y2);
		gc.setStroke(Color.BLACK);
		if(e.getFromVertex().getValue() instanceof Username2) {
			gc.strokeText(Integer.toString(e.getCost()),(x+x2)/2 -5 , (y+y2)/2, 50);
		}

    }
}
