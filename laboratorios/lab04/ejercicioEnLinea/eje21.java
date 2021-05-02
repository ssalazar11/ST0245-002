import java.util.ArrayList;
public class eje21
{
    public class Nod {
        public Nod left;
        public Nod right;
        public int dat;
        public Nod (int dat) {
            this.dat=dat;
        }
    }

    public Nod root;

    public void buildingTree (int [] preOrden) {
        
        root = new Nod(preOrden[0]);
        for(int i = 1; i < preOrden.length; i++){
            insert(root, preOrden[i]);
        }
    }

    public void insert (Nod node, int data) {
        
        if(data <= node.dat){
            
            if(node.left == null) {
                node.left = new Nod(data);

            } else if(node.left != null) {
                insert(node.left, data);

            } 
        }else {
            if(node.right == null) {
                node.right = new Nod(data);

            } else if(node.right != null) {
                insert(node.right,data);

            }
            
        }
        
    }

    public void preOrden(Nod node) {
        if(node != null){
            System.out.println(node.dat);
            preOrden(node.left);
            preOrden(node.right);
        }
    }

    public void posOrder(Nod node) {
        if(node != null){
            posOrder(node.left);
            posOrder(node.right);
            System.out.println(node.dat);
        }
    }

    public void eje21 (int [] input) {
        buildingTree(input);
        
        System.out.println("PosOrder");
        posOrder(root);
        System.out.println();
    }

    public static void main (String [] args) {
        int [] testi = {50,30,24,5,28,45,98,52,60};
        System.out.println("PreOrder");
        for(int i=0;i<testi.length;i++)
        {
            System.out.println(testi[i]);
        }
        eje21 testing = new eje21();
        testing.eje21(testi);
    }
}