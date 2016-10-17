import java.util.LinkedList;

/**
 * Created by JjMacbook on 13/10/16.
 */
public interface TADdictionary {
    int size();
    boolean isEmpty();
    LinkedList<Object> keys();
    Element findElement(Object key);
    void insertItem(Object key, Element element);
    void removeElement(Object key);
}
