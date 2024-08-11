
=== "Python"
    ```python linenums="1"
    def bfs(root):
        queue = deque([root])
        visited = set([root])
        while len(queue) > 0:
            node = queue.popleft()
            for neighbor in get_neighbors(node):
                if neighbor in visited:
                    continue
                queue.append(neighbor)
                visited.add(neighbor)
    ```

=== "Java"
    ```java linenums="1"
    public void bfs(Node root) {
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.add(root);
        Set<Node> visited = new HashSet<>();
        visited.add(root);
        while (queue.size() > 0) {
            Node node = queue.pop();
            for (Node neighbor : getNeighbors(node)) {
                if (visited.contains(neighbor)) {
                    continue;
                }
                queue.add(neighbor);
                visited.add(neighbor);
            }
        }
    }
    ```

=== "C++"
    ```cpp linenums="1"
    void bfs(Node<int>* root) {
        std::queue<Node<int>*> q;
        q.push(root);
        std::unordered_set<Node<int>*> visited;
        visited.emplace(root);
        while (q.size() > 0) {
            Node<int>* node = q.front();
            for (Node<int>* neighbor : get_neighbors(node)) {
                if (visited.count(neighbor)) {
                    continue;
                }
                q.push(neighbor);
                visited.emplace(neighbor);
            }
            q.pop();
        }
    }
    ```
