#include<stdio.h>
#include<limits.h>
struct node
{
	int data;
	struct node *left;
	struct node *right;
}
bool printPath (struct node *root,struct node *target_leaf)
{
	if (root == NULL)
		return false;
	if (root == target_leaf || printPath(root->left, target_leaf) ||		printPath(root->right, target_leaf) )
	{
		printf("%d ", root->data);
		return true;
}
