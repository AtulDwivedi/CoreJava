package myPackage;

class Link {
    public int data1;
    public double data2;
    public Link nextLink;

    //Link constructor
    public Link(int d1, double d2) {
	    data1 = d1;
	    data2 = d2;
    }

    //Print Link data
    public void printLink() {
	    System.out.print("{" + data1 + ", " + data2 + "} ");
    }
}

class LinkList {
    private Link first;
    private Link last;

    //LinkList constructor
    public LinkList() {
	    first = null;
	    last = null;
    }

    //Returns true if list is empty
    public boolean isEmpty() {
	    return first == null;
    }

    //Inserts a new Link at the first of the list
   /* public void insert(int d1, double d2) {
	    Link link = new Link(d1, d2);
	    link.nextLink = first;
	    first = link;
    }
*/
    public void insert(int d1, double d2) { 
        Link link = new Link(d1, d2); 

       
		if(first==null){
            link.nextLink = null;
            first = link; 
            last=link;
        }
        else{
            last.nextLink=link;
            link.nextLink=null;
            last=link;
        }
    } 
    
    
    
    //Deletes the link at the first of the list
    public Link delete() {
	    Link temp = first;
	    first = first.nextLink;
	    return temp;
    }

    //Prints list data
    public void printList() {
	    Link currentLink = first;
	    System.out.print("List: ");
	    while(currentLink != null) {
		    currentLink.printLink();
		    currentLink = currentLink.nextLink;
	    }
	    System.out.println("");
    }
}  

public class LinkListTest {
    public static void main(String[] args) {
	    LinkList list = new LinkList();

	    list.insert(1, 1.01);
	    list.insert(2, 2.02);
	    list.insert(3, 3.03);
	    list.insert(4, 4.04);
	    list.insert(5, 5.05);

	    list.printList();

	    while(!list.isEmpty()) {
		    Link deletedLink = list.delete();
		    System.out.print("deleted: ");
		    deletedLink.printLink();
		    System.out.println("");
	    }
	    list.printList();
    }
}