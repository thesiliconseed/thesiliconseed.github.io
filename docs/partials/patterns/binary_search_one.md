=== "Python"
    ```python linenums="1"
    def binary_search(arr: List[int], target: int) -> int:
        left, right = 0, len(arr) - 1
        first_true_index = -1
        while left <= right:
            mid = (left + right) // 2
            if feasible(mid):
                first_true_index = mid
                right = mid - 1
            else:
                left = mid + 1

        return first_true_index
    ```

=== "Java"
    ```java linenums="1"
    public static int binarySearch(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;
        int firstTrueIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (feasible(mid)) {
                firstTrueIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return firstTrueIndex;
    }
    ```

=== "C++"
    ```cpp linenums="1"
    int binary_search(std::vector<int> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;
        int firstTrueIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (feasible(mid)) {
                firstTrueIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return firstTrueIndex;
    }
    ```
