public class Main {
    public static void main(String[] args) {
       Tree intTree = new Tree();

       intTree.insert(25);
       intTree.insert(20);
       intTree.insert(15);
       intTree.insert(27);
       intTree.insert(30);
       intTree.insert(29);
       intTree.insert(26);
       intTree.insert(22);
       intTree.insert(32);
       intTree.insert(17);
       intTree.insert(34);
       intTree.insert(9);

       intTree.traverseInOrder();

       System.out.println(intTree.get(26));
       System.out.println(intTree.get(22));

       System.out.println(intTree.max());
       System.out.println(intTree.min());
    }
}