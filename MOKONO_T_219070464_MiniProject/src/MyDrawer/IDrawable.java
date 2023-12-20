/**
 * 
 */
package MyDrawer;

/**
 * @author tshid
 *
 */
public interface IDrawable {
	
	public void accept(IDrawVisitor visitor);
}
