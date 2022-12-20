class Solution
{
    private static int rec(Node ptr){
        if(ptr.next == null){
            ptr.data = (ptr.data+1);
            if(ptr.data > 9){
                ptr.data %= 10;
                return 1; // carry
            }
            else
                return 0; // no carry
        }
        ptr.data = ptr.data+rec(ptr.next);
        if(ptr.data > 9){
            ptr.data = ptr.data%10;
            return 1;
        }else
            return 0;
    }
    public static Node addOne(Node head) 
    { 
        if(rec(head) == 1){
            Node newNode = new Node(1);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
}
