package com.nick.collection;

/**
 * Created by Nick on 2021/1/30 13:07
 **/
//Node implements lianbioa
public class Node {
    private Node previews;
    private Object object;
    private Node next;

    public Node() {

    }

    public Node(Node previews, Object object, Node next) {
        this.previews = previews;
        this.object = object;
        this.next = next;
    }

    public Node getPreviews() {
        return previews;
    }

    public Object getObject() {
        return object;
    }

    public Node getNext() {
        return next;
    }

    public void setPreviews(Node previews) {
        this.previews = previews;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
