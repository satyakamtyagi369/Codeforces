import java.util.*;

public class fenwicktree{
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        int n= hariom.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=hariom.nextInt();
        }
        //Segment Tree banana
        SegmentTree st = new SegmentTree(arr);
        int q = hariom.nextInt();
        while(q-->0){
            int type = hariom.nextInt();
            if(type==1){
                int l=hariom.nextInt();
                int r=hariom.nextInt();
                System.out.println(st.query(l,r));
            }
            else if(type ==2){
                int idx= hariom.nextInt();
                int val = hariom.nextInt();
                st.update(idx,val);
            }
        }
    }
}
class SegmentTree{
    int tree[];
    int n;
    SegmentTree(int arr[]){
        n=arr.length;
        tree = new int[4*n];
        build(arr,0,0,n-1); // tree build karte hai root node se.
    }
    void build(int arr[], int node, int start, int end){
        if(start==end){
            tree[node]=arr[start];
        }
        else{
            int mid = (start+end)/2;
            build(arr,2*node+1,start,mid);
            build(arr,2*node+2,mid+1,end);
            tree[node]=tree[2*node+1] + tree[2*node+2];
        }
    }
    void update(int index,int value){
        update(0,0,n-1,index,value);// root node se start.
    }
    void update(int node,int start,int end,int index, int value){
        if(start == end){
            // jab exact index mil jaaye toh update kare.
            tree[node]=value;
        }
        else{
            int mid=(start+end)/2;
            if(index<=mid){
                update(2*node+1,start,mid,index,value);
            }
            else{
                update(2*node+2,mid+1,end,index,value);
            }
            tree[node]=tree[2*node+1] + tree[2*node+2];
        }
    }
     int query(int l, int r) {
        return query(0, 0, n - 1, l, r);
    }

    int query(int node, int start, int end, int l, int r) {
        if (r < start || end < l) {
            return 0;
        }
        if (l <= start && end <= r) {
            return tree[node];
        }
        int mid = (start + end) / 2;
        int left = query(2 * node + 1, start, mid, l, r);
        int right = query(2 * node + 2, mid + 1, end, l, r);
        return left + right;
    }
}