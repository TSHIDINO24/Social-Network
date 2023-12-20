/**
 * 
 */
package UserInfor;

import MyDrawer.IDrawVisitor;
import MyDrawer.IDrawable;

/**
 * @author tshid
 *
 */
public abstract class UserConnection implements Comparable<UserConnection>, IDrawable{


	protected String name;
	protected double xcod;
	protected double ycod;
	

	public UserConnection(String name, double x, double y) {
		this.name = name;
		xcod = x;
		ycod = y;
		
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getXcod() {
		return xcod;
	}
 
	
	public void setXcod(double xcod) {
		this.xcod = xcod;
	}

	
	

	public double getYcod() {
		return ycod;
	}

	public void setYcod(double ycod) {
		this.ycod = ycod;
	}


	@Override
	public void accept(IDrawVisitor visitor) {
		// TODO Auto-generated method stub
		
	}


	
	public int compareTo(Username o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
