/**
 * 
 */
package MyDrawer;

import com.jwetherell.algorithms.data_structures.Graph.Edge;

import UserInfor.UserConnection;
import UserInfor.Username;
import UserInfor.Username2;
/**
 * @author tshid
 *
 */
public interface IDrawVisitor {



	void draw(Edge<UserConnection> e);

	void draw(Username username);

	void draw(Username2 username2);

}
