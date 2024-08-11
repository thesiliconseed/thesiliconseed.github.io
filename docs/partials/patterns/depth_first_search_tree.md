
=== "Python"
    ```python linenums="1"
    def dfs(root, target):
        if root is None:
            return None
        if root.val == target:
            return root
        left = dfs(root.left, target)
        if left is not None:
            return left
        return dfs(root.right, target)

    ```

=== "Java"
    ```java linenums="1"
    public static Node dfs(Node root, int target) {
        if (root == null) return null;
        if (root.val == target) {
            return root;
        }
        Node left = dfs(root.left, target);
        if (left != null) {
            return left;
        }
        return dfs(root.right, target);
    }
    ```

=== "C++"
    ```cpp linenums="1"
    Node<T>* dfs(Node<T>* root, int target) {
        if (root == nullptr) return nullptr;
        if (root->val == target) {
            return root;
        }
        Node<T>* left = dfs(root->left, target);
        if (left != nullptr) {
            return left;
        }
        return dfs(root->right, target)  
    }
    ```
