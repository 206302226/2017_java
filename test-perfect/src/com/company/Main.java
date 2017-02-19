package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Merge.Node n1 = new Merge.Node(1);

        Merge.Node n2 = new Merge.Node(2);

        Merge.Node n3 = new Merge.Node(3);

        Merge.Node n4 = new Merge.Node(4);

        Merge.Node n5 = new Merge.Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;


        Merge.Node n6 = new Merge.Node(2);

        Merge.Node n7 = new Merge.Node(2);

        Merge.Node n8 = new Merge.Node(3);

        Merge.Node n9 = new Merge.Node(4);

        Merge.Node n10 = new Merge.Node(5);

        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;


        Merge.Node n11 = new Merge.Node(3);

        Merge.Node n12 = new Merge.Node(2);

        Merge.Node n13 = new Merge.Node(3);

        Merge.Node n14 = new Merge.Node(4);

        Merge.Node n15 = new Merge.Node(5);

        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;

        /*Merge.Node temp = n1;


        while (temp != null) {

            System.out.println(temp.value);
            temp = temp.next;

        }*/


        Merge.NodeWithHead h1 = new Merge.NodeWithHead(n1);

        Merge.NodeWithHead h2 = new Merge.NodeWithHead(n6);

        Merge.NodeWithHead h3 = new Merge.NodeWithHead(n11);

        h1.next = h2;
        h2.next = h3;

        /*Merge.NodeWithHead temp1 = h1;
        Merge.Node temp = n1;

        while (temp1 != null) {

            while (temp != null){

                System.out.print(temp.value + " ");

                temp = temp.next;
        }


            System.out.println();
            temp1=temp1.next;
            temp=temp1.value;


        }*/

        Merge.Node merge;
        merge=Merge.First(h1);
        while (merge!=null)
        {
            System.out.print(merge.value);
            merge=merge.next;
        }






    }



}
