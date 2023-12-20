/**
 * 
 */
package UserInfor;

import MyDrawer.IDrawVisitor;

/**
 * @author tshid
 *
 */
public class Username2 extends UserConnection{

	public Username2(String name, double x, double y) {
		super(name, x, y);
		// TODO Auto-generated constructor stub
	}
	
	
	public void accept(IDrawVisitor visitor) {
		visitor.draw(this);
	}

	public int compareTo(UserConnection n) {
		if((n.xcod != this.xcod)) return -1;
		if((n.ycod != this.ycod)) return -1;
			

		return 0;
	}

}
