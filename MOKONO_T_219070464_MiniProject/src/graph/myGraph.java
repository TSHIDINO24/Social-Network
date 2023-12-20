package graph;

import java.io.File;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.jwetherell.algorithms.data_structures.Graph;



import UserInfor.Username2;
import UserInfor.UserConnection;

public class myGraph extends Graph<UserConnection> {
	
	private final static String USERNAME = "USERNAME";

	
	
	private String path = "src//graph//Username.txt";
	private File file;
	private Scanner scanner;
	private StringTokenizer st;
	private StringTokenizer st_2;
	
	public myGraph() {
		super();
		file = new File(path);
		
		
		try {
			File f = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
			path =  f.getParent() + "src//graph//Username.txt";
			
			scanner = new Scanner(file);
		}catch(URISyntaxException e){
			
		} catch (FileNotFoundException e) {
			System.err.println("File path: " + file.getAbsolutePath() + "\n");
			System.err.println(" not exist");
		}
	}
	/**
	 * 
	 * read data from file to make graph
	 */
	public void read() {
		String line = "";
		
		while(scanner.hasNext()) {
			line = scanner.nextLine();
			st = new StringTokenizer(line,"#");
			
			String the_obj = st.nextToken();
			st_2 = new StringTokenizer(the_obj);
			/*
			 * read station details	
			 */
			String type = st_2.nextToken();
			switch(type) {
			case USERNAME:{
				double x = Double.parseDouble(st_2.nextToken());
				double y = Double.parseDouble(st_2.nextToken());
				Username2 ps = new Username2(st_2.nextToken(), x, y);
				/*
				 * create vertex
				 */
				Vertex<UserConnection> vertex = new Vertex<>(ps);
				getVertices().add(vertex);
				/*
				 * read all relationships
				 */
				while(st.hasMoreTokens()) {
					StringTokenizer coord = new StringTokenizer(st.nextToken());
					double x1 = Double.parseDouble(coord.nextToken());
					double y2 = Double.parseDouble(coord.nextToken());
					
				Username2 U2 = new Username2("compare", x1, y2);
					
					for (Vertex<UserConnection> v : getVertices()) {
						
						/**
						 * create relationship between power stations
						 */
						if(v.getValue().compareTo(U2) == 0) {
							Edge<UserConnection> rel = new Edge<>(0, vertex, v);
							Edge<UserConnection> rel2 = new Edge<>(0, v, vertex);
							
							getEdges().add(rel);
							getEdges().add(rel2);
							
							vertex.addEdge(rel);
							v.addEdge(rel2);
						}
					}
					
					
					U2 = null;
				}
			}
				break;
			
			}
		}
		}
		
	
	/**
	 * @return Graph graph of the network
	 */
	public Graph<UserConnection> Graph(){
		return this;
	}
	
	
	public Vertex<UserConnection> getVertex(double x, double y) {		
		for(Vertex<UserConnection> v : getVertices()) 
			if((v.getValue().getXcod() == x) || (v.getValue().getYcod() == y)) return v;

		return null;
		
	}
	
	
}
