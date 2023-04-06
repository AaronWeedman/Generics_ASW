/*
 * The TestLinkedList class creates three instances of the GenericLinkedList class
 * and two instances of the GenericNode class.
 * 
 * @author rkelley/njohnson/Aaron Weedman
 * Programming Project 1 Start Project
 * CS131 Spring 2023
 */

public class TestLinkedList {

	public static void main(String[] args) {
		
		GenericLinkedList<Integer> integerList = new GenericLinkedList<>();
        GenericNode<Integer> integerNode1 = new GenericNode<Integer>(9);
        GenericNode<Integer> integerNode2 = new GenericNode<Integer>(3);
        integerList.addNode(integerNode1);
        integerList.addNode(integerNode2);

        GenericLinkedList<Double> doubleList = new GenericLinkedList<>();
        GenericNode<Double> doubleNode1 = new GenericNode<Double>(9.9);
        GenericNode<Double> doubleNode2 = new GenericNode<Double>(3.1415);
        doubleList.addNode(doubleNode1);
        doubleList.addNode(doubleNode2);

        GenericLinkedList<String> stringList = new GenericLinkedList<>();
        GenericNode<String> stringNode1 = new GenericNode<String>("Horse");
        GenericNode<String> stringNode2 = new GenericNode<String>("Dog");
        stringList.addNode(stringNode1);
        stringList.addNode(stringNode2);

        System.out.println("Integer List: ");
        GenericNode<Integer> IntegerNode = integerList.getList();
        
        while (IntegerNode != null) {
            System.out.println(IntegerNode.getData());
            IntegerNode = IntegerNode.getNextNode();
        }

        System.out.println("\nDouble List: ");
        GenericNode<Double> DoubleNode = doubleList.getList();
        while (DoubleNode != null) {
            System.out.println(DoubleNode.getData());
            DoubleNode = DoubleNode.getNextNode();
        }

        System.out.println("\nString List: ");
        GenericNode<String> StringNode = stringList.getList();
        while (StringNode != null) {
            System.out.println(StringNode.getData());
            StringNode = StringNode.getNextNode();
        }


	}//end main

}//end class
