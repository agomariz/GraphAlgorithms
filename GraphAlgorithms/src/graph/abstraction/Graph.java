/**
 * 
 */
package graph.abstraction;

import graph.DefaultEdge;
import graph.Path;
import graph.implementation.GraphImpl;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * @author agomariz
 *
 */
public abstract class Graph<Node,Edge extends DefaultEdge> {

	private Set<Node> nodes; // I am not sure if we should include both nodes and edges since we have a graph implementation. Wow!!
	private Set<Edge> edges; // I am not sure if we should include both nodes and edges since we have a graph implementation. Wow!!
	
	private GraphImpl graphImplementation;
	
	public void addNode(Node node){
		throw new UnsupportedOperationException();
	}
	
	public void addNodes(Collection<Node> nodes){
		throw new UnsupportedOperationException();
	}
	
	public Node removeNode(Node node){
		throw new UnsupportedOperationException();
	}
	
	public Collection<Node> removeNodes(Collection<Node> nodes){
		throw new UnsupportedOperationException();
	}
	
	public void addEdge(Edge edge){
		throw new UnsupportedOperationException();
	}
	
	public void addEdges(Collection<Edge> edges){
		throw new UnsupportedOperationException();
	}
	
	public Edge removeEdge(Edge edge){
		throw new UnsupportedOperationException();
	}
	
	public Collection<Edge> removeEdges(Collection<Edge> edges){
		throw new UnsupportedOperationException();
	}
	
	public List<Node> breadthFirstSearch(){
		throw new UnsupportedOperationException();
	}
	
	public List<Node> depthFirstSearch(){
		throw new UnsupportedOperationException();
	}
	
	public List<Path> shortestPath(Node s){
		throw new UnsupportedOperationException();
	}
	
	public Path shortestPath(Node s, Node t){
		throw new UnsupportedOperationException();
	}
	
	public List<Path> allShortestPath(){
		throw new UnsupportedOperationException();
	}

	/**
	 * @return the nodes
	 */
	public Set<Node> getNodes() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @return the edges
	 */
	public Set<Edge> getEdges() {
		throw new UnsupportedOperationException();
	}
}
