
=== "Python"
    ```python linenums="1"
    def bfs(root):
        queue = deque([root])
        while len(queue) > 0:
            node = queue.popleft()
            for child in node.children:
                if is_goal(child):
                    return FOUND(child)
                queue.append(child)
        return NOT_FOUND

    ```

=== "Java"
    ```java linenums="1"
    public Node bfs(Node root) {
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() > 0) {
            Node node = queue.poll();
            for (Node child : node.children) {
                if (isGoal(child)) {
                    return FOUND(child);
                }
                queue.add(child);
            }
        }
        return NOT_FOUND;
    }

    ```

=== "C++"
    ```cpp linenums="1"
    Node<T>* bfs(Node<T>* root) {
        std::queue<Node<T>*> q;
        q.push(root);
        while (q.size() > 0) {
            Node<T>* node = queue.front();
            q.pop();
            for (Node<T>* child : node->children) {
                if (is_goal(child)) {
                    return FOUND(child);
                }
                q.push(child);
            }
        }
        return NOT_FOUND;
    }

    ```
