import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Courses {
	public boolean canFinish(int numCourses, int[][] prerequisites) {

		List<Integer> graph[] = new ArrayList[numCourses];
		for (int i = 0; i < numCourses; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		boolean[] visited = new boolean[numCourses];
		boolean[] current = new boolean[numCourses];
		for (int i = 0; i < prerequisites.length; i++) {
			graph[prerequisites[i][1]].add(prerequisites[i][0]);
		}
		for (int i = 0; i < numCourses; i++) {
			if (isCycle(graph, visited, current, i)) {
				return false;
			}
		}

		return true;
	}

	private boolean isCycle(List<Integer> adj[], boolean[] visited, boolean[] current, int start) {
		visited[start] = true;
		current[start] = true;
		Iterator<Integer> it = adj[start].iterator();
		while (it.hasNext()) {
			int temp = it.next();
			if (!visited[temp] && isCycle(adj, visited, current, temp)) {
				return true;
			} else if (current[temp]) {
				return true;
			}
		}
		current[start] = false;

		return false;

	}
    public static void main (String [] args) {
    	Courses course = new Courses();
    	int numCourses = 2; int[][] prerequisites = {{1,0}, {0,1}};
    	System.out.print(course.canFinish(numCourses, prerequisites));
	 
 }
}
