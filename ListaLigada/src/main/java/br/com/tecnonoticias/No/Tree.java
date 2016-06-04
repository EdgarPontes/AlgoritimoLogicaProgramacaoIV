package br.com.tecnonoticias.No;

public class Tree {
	
	private TreeNode raiz;

    /**
     * Construtor de uma árvore BTree
     * 
     * @param raiz
     *            BTreeNode passado como raiz da árvore
     */
    public Tree(TreeNode raiz) {
        this.raiz = raiz;
    }

    public TreeNode getRaiz() {
        return raiz;
    }

    public void setRaiz(TreeNode raiz) {
        this.raiz = raiz;
    }

}
