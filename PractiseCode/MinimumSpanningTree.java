package PractiseCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSpanningTree {
	//Find the minimum spanning tree of a connected, undirected graph with weighted edges.

	class vertex {
		private int id;
		private boolean visited;

		public vertex(int id, boolean visited) {
			super();
			this.id = id;
			this.visited = visited;
		}

		int getId() {
			return id;
		}

		void setId(int id) {
			this.id = id;
		}

		boolean isVisited() {
			return visited;
		}

		void setVisited(boolean visited) {
			this.visited = visited;
		}
	}

	static class edge {
		private int weight;
		private boolean visited;
		private vertex src;
		private vertex dest;

		public edge(int weight, boolean visited, vertex src,
					vertex dest) {
			this.weight = weight;
			this.visited = visited;
			this.src = src;
			this.dest = dest;
		}

		int getWeight() {
			return weight;
		}

		void setWeight(int weight) {
			this.weight = weight;
		}

		boolean isVisited() {
			return visited;
		}

		void setVisited(boolean visited) {
			this.visited = visited;
		}

		vertex getSrc() {
			return src;
		}

		void setSrc(vertex src) {
			this.src = src;
		}

		vertex getDest() {
			return dest;
		}

		void setDest(vertex dest) {
			this.dest = dest;
		}
	}

	class graph {
		private List<vertex> g;   //vertices
		private List<edge> e;     //edges

		public graph(List<vertex> g, List<edge> e) {
			super();
			this.g = g;
			this.e = e;
		}

		public List<vertex> getG() {
			return g;
		}

		public void setG(List<vertex> g) {
			this.g = g;
		}

		public List<edge> getE() {
			return e;
		}

		public void setE(List<edge> e) {
			this.e = e;
		}

		// This method returns the vertex with a given id if it
		// already exists in the graph, returns NULL otherwise
		vertex vertex_exists(int id) {
			for (int i = 0; i < g.size(); i++) {
				if (g.get(i).getId() == id) {
					return g.get(i);
				}
			}
			return null;
		}

		// This method generates the graph with v vertices
		// and e edges
		void generate_graph(int vertices,
							List<ArrayList<Integer>> edges) {
			// create vertices
			for (int i = 0; i < vertices; i++) {
				vertex v = new vertex(i + 1, false);
				g.add(v);
			}

			// create edges
			for (int i = 0; i < edges.size(); i++) {
				vertex src = vertex_exists(edges.get(i).get(1));
				vertex dest = vertex_exists(edges.get(i).get(2));
				edge e = new edge(edges.get(i).get(0), false, src,
						dest);
				getE().add(e);
			}
		}

		// This method finds the MST of a graph using
		// Prim's Algorithm
		// returns the weight of the MST
		int find_min_spanning_tree() {
			int vertex_count = 0;
			int weight = 0;

			// Add first vertex to the MST
			vertex current = g.get(0);
			current.setVisited(true);
			vertex_count++;

			// Construct the remaining MST using the
			// smallest weight edge
			while (vertex_count < g.size()) {
				edge smallest = null;
				for (int i = 0; i < e.size(); i++) {
					if (e.get(i).isVisited() == false) {
						if (e.get(i).getSrc().isVisited() == true
								&& e.get(i).getDest().isVisited() == false) {
							if (smallest == null) {
								smallest = e.get(i);
							} else if (e.get(i).getWeight() < smallest.getWeight()) {
								smallest = e.get(i);
							}
						}
					}
				}

				smallest.setVisited(true);
				smallest.getDest().setVisited(true);
				weight += smallest.getWeight();
				vertex_count++;
			}
			return weight;
		}

		void print_graph() {
			for (int i = 0; i < g.size(); i++) {
				System.out.println(
						g.get(i).getId() + " " + g.get(i).isVisited());
			}
			System.out.println();
			for (int i = 0; i < e.size(); i++) {
				System.out.println(e.get(i).getSrc().getId() + "->"
						+ e.get(i).getDest().getId() + "["
						+ e.get(i).getWeight() + ", "
						+ e.get(i).isVisited() + "]  ");
			}
			System.out.println("\n");
		}

		void print_mst(int w) {
			System.out.println("MST");
			for (int i = 0; i < e.size(); i++) {
				if (e.get(i).isVisited() == true) {
					System.out.println(e.get(i).getSrc().getId() + "->"
							+ e.get(i).getDest().getId());
				}
			}
			System.out.println("weight: " + w);
			System.out.println();
		}
	};


	}

