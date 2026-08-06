import java.util.*;

class Solution {
    private boolean dfs(int node, int[] vis, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1; // Mark as visiting (in active recursion stack)

        for (int neighbor : adj.get(node)) {
            if (vis[neighbor] == 1) {
                return true; // Cycle detected
            }
            if (vis[neighbor] == 0) {
                if (dfs(neighbor, vis, adj)) {
                    return true;
                }
            }
        }

        vis[node] = 2; // Mark as fully processed
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            adj.get(edge[1]).add(edge[0]);
        }

        int[] vis = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (vis[i] == 0) {
                if (dfs(i, vis, adj)) {
                    return false; // Found a cycle, cannot finish all courses
                }
            }
        }

        return true;
    }
}