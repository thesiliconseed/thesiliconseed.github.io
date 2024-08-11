
=== "Python"
    ```python linenums="1"
    def dfs(start_index, [...additional states]):
        if is_leaf(start_index):
            return 1
        ans = initial_value
        for edge in get_edges(start_index, [...additional states]):
            if additional states: 
                update([...additional states])
            ans = aggregate(ans, dfs(start_index + len(edge), [...additional     states]))
            if additional states: 
                revert([...additional states])
        return ans
    ```

=== "Java"
    ```java linenums="1"
    private static int dfs(Integer startIndex, List<T> target) {
        if (isLeaf(startIndex)) {
            return 1;
        }

        ans = initialValue;
        for (T edge : getEdges(startIndex, [...additional states])) {
            if (additional states) {
                update([...additional states]);
            }
            ans = aggregate(ans, dfs(startIndex + edge.length(), [...  additional states])
            if (additional states) {
                revert([...additional states]);
            }
        }
        return ans;
    }
    ```

=== "C++"
    ```cpp linenums="1"
    int dfs(int startIndex, std::vector<T>& target) {
        if (isValid(target[startIndex:])) {
            return 1;
        }
        int counter = 0;
        for (auto edge : getEdges(startIndex, [...additional states])) {
            if (additional states) {
                update([...additional states]);
            }
            ans = aggregate(ans, dfs(startIndex + edge.length(), [...additional states])
            if (additional states) {
                revert([...additional states]);
            }
    }
    return ans;
    ```
