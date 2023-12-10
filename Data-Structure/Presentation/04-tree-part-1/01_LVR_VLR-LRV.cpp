#include <iostream>

using namespace std; // Add this line to use the std namespace

// Node structure for the binary tree
template <typename Key, typename Value>
struct TreeNode {
    Key key;
    Value data;
    TreeNode* left;
    TreeNode* right;

    TreeNode(Key k, Value v) : key(k), data(v), left(nullptr), right(nullptr) {}
};

// Binary Search Tree class
template <typename Key, typename Value>
class BinaryTree {
private:
    TreeNode<Key, Value>* root;

    // Helper function to insert a key-value pair into the tree
    TreeNode<Key, Value>* insert(TreeNode<Key, Value>* node, Key key, Value data) {
        if (node == nullptr) {
            return new TreeNode<Key, Value>(key, data);
        }

        if (key < node->key) {
            node->left = insert(node->left, key, data);
        } else if (key > node->key) {
            node->right = insert(node->right, key, data);
        } else {
            // Duplicate key, update the value or handle accordingly
            node->data = data;
        }

        return node;
    }

    // Helper function for pre-order traversal
    void preOrderTraversal(TreeNode<Key, Value>* node) {
        if (node != nullptr) {
            cout << node->key << " ";
            preOrderTraversal(node->left);
            preOrderTraversal(node->right);
        }
    }

    // Helper function for in-order traversal
    void inOrderTraversal(TreeNode<Key, Value>* node) {
        if (node != nullptr) {
            inOrderTraversal(node->left);
            cout << node->key << " ";
            inOrderTraversal(node->right);
        }
    }

    // Helper function for post-order traversal
    void postOrderTraversal(TreeNode<Key, Value>* node) {
        if (node != nullptr) {
            postOrderTraversal(node->left);
            postOrderTraversal(node->right);
            cout << node->key << " ";
        }
    }

public:
    BinaryTree() : root(nullptr) {}

    // Public function to insert a key-value pair
    void insert(Key key, Value data) {
        root = insert(root, key, data);
    }

    // Public function to display pre-order traversal
    void displayPreOrder() {
        preOrderTraversal(root);
        cout << endl;
    }

    // Public function to display in-order traversal
    void displayInOrder() {
        inOrderTraversal(root);
        cout << endl;
    }

    // Public function to display post-order traversal
    void displayPostOrder() {
        postOrderTraversal(root);
        cout << endl;
    }
};

int main() {
    // Example usage
    BinaryTree<std::string, int> myTree;

    // Inserting data into the tree
    myTree.insert("John", 25);
    myTree.insert("Alice", 30);
    myTree.insert("Bob", 22);

    // Displaying tree in different traversals
    cout << "Pre-order traversal: ";
    myTree.displayPreOrder();

    cout << "In-order traversal: ";
    myTree.displayInOrder();

    cout << "Post-order traversal: ";
    myTree.displayPostOrder();

    return 0;
}
