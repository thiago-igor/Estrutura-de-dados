package Faculdade.Aulas.Arvore;
 class Node {
    int valor;
    Node left;
    Node right;
    
    public Node(int valor) {
        this.valor = valor;
    }  
    public Node(int valor, Node left, Node right) {
        this.valor = valor;
        this.left = left;
        this.right = right;
    }

    

}
