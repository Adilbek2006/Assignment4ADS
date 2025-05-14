import java.util.*;

public class BreadthFirstSearch<T> extends Search<T> {

    public BreadthFirstSearch(WeightedGraph<T> graph, Vertex<T> start) {
        super(start);
        bfs(graph, start);
    }

    private void bfs(WeightedGraph<T> graph, Vertex<T> start) {
        Queue<Vertex<T>> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);
    }
}
