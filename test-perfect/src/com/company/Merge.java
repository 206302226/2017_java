package com.company;

/**
 * Created by hackeru on 2/19/2017.
 */
public class Merge {

    public static class Node {

        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }




    public static class NodeWithHead {

        Node value;
        NodeWithHead next;

        public NodeWithHead(Node value, NodeWithHead next) {
            this.value = value;
            this.next = next;
        }


        public NodeWithHead(Node value) {
            this.value = value;
        }
    }


    public static Node merge(Node a, Node b){

        Node anchor= new Node(123);
        Node tail=anchor;
        while (true){
            if(a==null){
                tail.next=b;
                break;
            }else if (b==null){
                tail.next=a;
                break;
            }
            if(a.value<=b.value){
                tail.next=a;
                a=a.next;
            }else {
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        return anchor.next;
    }


    public static Node First(NodeWithHead head)
    {

        if(head.next==null)
            return head.value;

        NodeWithHead temp;
        temp=head;


        while (head.next !=null&&temp.next.next!=null)
        {
            temp=temp.next;
            head.value=merge(head.value,head.next.value);

            head.next.next=temp.next;


        }

        return head.value;

    }

    public static Node sortKlists1(NodeWithHead head){

        if(head.next==null){
            return head.value;
        }
        Node newSortList=head.value;
        head=head.next;
        while(head!=null){

            newSortList=merge(newSortList, head.value);
            head=head.next;
        }
        return newSortList;
    }

    public  static  Node secend(NodeWithHead head)
    {

        Node node1;
        Node node2;

        while (head!=null)
        {
            node1=head.value;


        }


return head.value;





    }







}
