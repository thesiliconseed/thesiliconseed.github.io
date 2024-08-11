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
    