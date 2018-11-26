/*
Created by Arazoo Hoseyni on 11/25/2018
 */

package priorityqueue;

class Node<T extends Comparable<T>> {

    public T data;
    
    public Node<T> next;
    
    public boolean equals(Node<T> node){
        if(data.equals(node.data)){
            return true;
        }
        return false;
    }
    
    public boolean lower(Node<T> node){
        if(data.compareTo(node.data)>0){
            return true;
        }
        return false;
    }
    
    public int hashCode(){
        return data.hashCode();
    }
}