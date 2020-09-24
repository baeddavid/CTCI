class bfs {
    // V is the number of vertices in the graph
    boolean[] visisted = new boolean[V];

    LinkedList<Integer> queue = new LinkedList<>();
    // Set the vertex s as visited as s is the source of our BFS
    visited[s] = true;
    queue.add(s);

    while(queue.size() != 0) {
        s = queue.poll();
        System.out.println(s+ " ");

        Iterator<Integer> it = adj[s].listIterator();
        while(it.hasNext()) {
            int n = it.next();
            if(!visisted[n]) {
                visisted[n] = true;
                queue.add(n);
            }
        }
    }
}
