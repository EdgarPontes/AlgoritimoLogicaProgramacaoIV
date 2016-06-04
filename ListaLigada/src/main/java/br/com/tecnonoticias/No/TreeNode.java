package br.com.tecnonoticias.No;

public class TreeNode {
	
	private String name; // identificação do nó de árvore
    private TreeNode left = null; // filho 1
    private TreeNode right = null; // filho 2
    private int custo1; // custo para 1
    private int custo2; // custo para 2
    private int hInfo; // informação heurística

    /**
     * Construtor para o TreeNode
     * 
     * @param name
     *            indica o nome para o TreeNode que está sendo criado
     */
    public TreeNode(String name) {
        this.name = name;
    }

    /**
     * Construtor para o TreeNode
     * 
     * @param name indica o nome para o TreeNode que está sendo criado
     * @param h indica o valor heuristico para o TreeNode que está sendo criado
     *            
     */
    public TreeNode(String name, int h) {
        this.name = name;
        this.hInfo = h;
    }

    /**
     * Insere os sucessores de um TreeNode. Tenta inserir no sucessor1. Caso
     * não esteja nulo, insere no sucessor2
     * 
     * @param node
     *            TreeNode a ser inserido
     * @param custo
     *            Custo de transição de um nó de árvore até o sucessor sendo
     *            inserido
     */
    public void setSucessor(TreeNode node, int custo) {

        if (this.left == null) {
            this.left = node;
            this.custo1 = custo;
        } else if (this.right == null) {
            this.right = node;
            this.custo2 = custo;
        }

    }

    public int gethInfo() {
        return hInfo;
    }

    public void sethInfo(int hInfo) {
        this.hInfo = hInfo;
    }

    public String getNome() {
        return name;
    }

    public TreeNode getSucessor1() {
        return left;
    }

    public TreeNode getSucessor2() {
        return right;
    }

    public int getCusto1() {
        return custo1;
    }

    public int getCusto2() {
        return custo2;
    }   

}
