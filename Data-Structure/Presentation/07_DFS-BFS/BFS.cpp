#include <iostream>

// Node structure
struct Node {
  int key;
  Node *left, *right;
};

// Function to create a new node
Node* newNode(int item) {
  Node* temp = new Node;
  temp->key = item;
  temp->left = temp->right = nullptr;
  return temp;
}

// Recursive function to insert a new key in BST
Node* insertRec(Node* root, int key) {
  if (root == nullptr) return newNode(key);

  if (key < root->key)
      root->left = insertRec(root->left, key);
  else if (key > root->key)
      root->right = insertRec(root->right, key);

  return root;
}

// Wrapper over insertRec()
Node* insert(Node* root, int key) {
  root = insertRec(root, key);
  return root;
}

// Function to search a key in a BST
bool search(Node* root, int key) {
  if (root == nullptr || root->key == key)
     return (root != nullptr);

  if (root->key < key)
    return search(root->right, key);
 
  return search(root->left, key);
}

// Driver code
int main() {
  Node* root = nullptr;

  root = insert(root, 50);
  insert(root, 30);
  insert(root, 20);
  insert(root, 40);
  insert(root, 70);
  insert(root, 60);
  insert(root, 80);

  int keyToFind = 6;
  if (search(root, keyToFind))
     std::cout << keyToFind << " found" << std::endl;
  else
     std::cout << keyToFind << " not found" << std::endl;

  keyToFind = 60;
  if (search(root, keyToFind))
     std::cout << keyToFind << " found" << std::endl;
  else
     std::cout << keyToFind << " not found" << std::endl;

  return 0;
}
