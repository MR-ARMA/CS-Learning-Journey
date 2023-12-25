#include <bits/stdc++.h>
using namespace std;

struct Node {
   int key;
   struct Node* left, *right;
};

// A utility function to create a new BST node
Node* newNode(int item) {
   Node* temp = new Node;
   temp->key = item;
   temp->left = temp->right = NULL;
   return temp;
}

// A utility function to do inorder traversal of BST
void inorder(Node* root) {
   if (root != NULL) {
       inorder(root->left);
       printf("%d ", root->key);
       inorder(root->right);
   }
}

// A utility function to insert a new node with given key in BST
Node* insert(Node* node, int key) {
   // If the tree is empty, return a new node
   if (node == NULL) return newNode(key);

   // Otherwise, recur down the tree
   if (key < node->key)
       node->left = insert(node->left, key);
   else
       node->right = insert(node->right, key);

   // return the (unchanged) node pointer
   return node;
}

// Returns the node with minimum value
Node* minValueNode(Node* node) {
   Node* current = node;

   /* loop down to find the leftmost leaf */
   while (current && current->left != NULL)
       current = current->left;

   return current;
}

// Given a binary search tree and a key, this function deletes the key and returns the new root
Node* deleteNode(Node* root, int key) {
   // Base case
   if (root == NULL) return root;

   // If the key to be deleted is smaller than the root's key,
   // then it lies in left subtree
   if (key < root->key)
       root->left = deleteNode(root->left, key);

   // If the key to be deleted is greater than the root's key,
   // then it lies in right subtree
   else if (key > root->key)
       root->right = deleteNode(root->right, key);

   // If key is same as root's key, then This is the node
   // to be deleted
   else {
       // Node with only one child or no child
       if ((root->left == NULL) || (root->right == NULL)) {
           Node* temp = root->left ? root->left : root->right;

           // No child case
           if (temp == NULL) {
               temp = root;
               root = NULL;
           }
           else // One child case
               *root = *temp; // Copy the contents of the non-empty child

           free(temp);
       }
       else {
           // Node with two children: Get the inorder successor (smallest in the right subtree)
           Node* temp = minValueNode(root->right);

           // Copy the inorder successor's content to this node
           root->key = temp->key;

           // Delete the inorder successor
           root->right = deleteNode(root->right, temp->key);
       }
   }
   return root;
}

// Driver Code
int main() {
   Node* root = NULL;
   root = insert(root, 50);
   root = insert(root, 30);
   root = insert(root, 20);
   root = insert(root, 40);
   root = insert(root, 70);
   root = insert(root, 60);
   root = insert(root, 80);

   printf("Inorder traversal of the given tree \n");
   inorder(root);

   printf("\nDelete 20\n");
   root = deleteNode(root, 20);
   printf("Inorder traversal of the modified tree \n");
   inorder(root);

   printf("\nDelete 30\n");
   root = deleteNode(root, 30);
   printf("Inorder traversal of the modified tree \n");
   inorder(root);

   printf("\nDelete 50\n");
   root = deleteNode(root, 50);
   printf("Inorder traversal of the modified tree \n");
   inorder(root);

   return 0;
}
