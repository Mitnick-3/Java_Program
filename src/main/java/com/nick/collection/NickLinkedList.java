package com.nick.collection;

/**
 * Created by Nick on 2021/1/30 13:24
 **/

public class NickLinkedList {
    private Node first;
    private Node last;
    private int size;

    public int size(){
        return size;
    }

    public void add(Object n){
        Node node = new Node();
        if (first == null){
            node.setPreviews(null);
            node.setObject(n);
            node.setNext(null);
            last = node;
            first = node;
        }else{
            node.setPreviews(last);
            node.setObject(n);
            node.setNext(null);
            last.setNext(node);
            last = node;
        }
        size++;
    }
    public Object find(int index){
        Node temp = null;
        if (first !=null){
            temp = first;
            for (int i = 0; i<index;i++){
                temp = temp.getNext();
            }
        }
        return temp.getObject();

    }
    
    public static void main(String[] ars){
        NickLinkedList list = new NickLinkedList();
        list.add("aaa");
        list.add("bbb");
        System.out.println(list.size());
        System.out.println(list.find(0));
    }
}
