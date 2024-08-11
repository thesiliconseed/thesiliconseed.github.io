
=== "Python"
    ```python linenums="1"
    def dfs(root, visited):
        for neighbor in get_neighbors(root):
            if neighbor in visited:
                continue
            visited.add(neighbor)
            dfs(neighbor, visited)

    ```

=== "Java"
    ```java linenums="1"
    public void dfs(Node root, Set<Node> visited) {
        for (Node neighbor : node.neighbors) {
            if (visited.contains(node)) {
                continue;
            }
            visited.add(neighbor);
            dfs(neighbor, visited);
        }
    }
    ```

=== "C++"
    ```cpp linenums="1"
    void dfs(Node<int>* root, std::unordered_set<Node<int>*> visited) {
        for (Node<int>* neighbor : node->neighbors) {
            if (visited.count(neighbor)) {
                continue;
            }
            visited.emplace(neighbor);
            dfs(neighbor, visited);
        }
    }
    ```
