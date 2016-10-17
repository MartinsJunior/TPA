import java.util.LinkedList;

/**
 * Created by JjMacbook on 14/10/16.
 */
public class Dictionary implements TADdictionary {
    private HashTable hTable;

    public Dictionary(int tam){
        this.hTable = new HashTable(tam);
    }
    @Override
    public int size() {//OK
        return hTable.getSize();
    }

    @Override
    public boolean isEmpty() {//OK
        if(hTable.getSize()>0)return false;
        else{
            return true;
        }
    }

    @Override
    public LinkedList<Object> keys() {//OK
        return hTable.getObjectLinkedList();
    }

    @Override
    public Element findElement(Object key) {//OK
        return hTable.getElement(key);

    }

    @Override
    public void insertItem(Object key, Element element) {//OK
        hTable.setElement(key,element);
    }

    @Override
    public void removeElement(Object key) {
    //may need to implement a flag when delete a item
    }
}
