import java.util.LinkedList;
import java.util.Objects;

/**
 * Created by JjMacbook on 13/10/16.
 */

public class HashTable implements HashEngine {
    private static double SCALE =0.4; //not applied ?
    private Element hTable[];
    private int size=0;

    private LinkedList<Object> objectLinkedList = new LinkedList();

    public HashTable(int tam){
        this.hTable = new Element[CalcTamVec(tam)];
    }

    public long compressIndex(Object obj){
        long hashNumber = hashFunction(obj,33);
        return (Math.abs(hashNumber) % this.hTable.length);
    }

    int CalcTamVec(int tamVec){
        return (int) (SCALE*tamVec);
    }

    public void setElement(Object obj, Element element){
        long hashNumber = compressIndex(obj);
        while(hTable[(int)hashNumber]!=null)hashNumber++;//resize
        hTable[(int)hashNumber]= element;
        objectLinkedList.addLast(obj);
        size++;

    }

    public Element getElement(Object obj){
        long hashNumber = compressIndex(obj);
        String key = obj.toString();
        while(!key.equals(hTable[(int)hashNumber].getKey()))hashNumber++;
        return hTable[(int)hashNumber];
    }

    public LinkedList<Object> getObjectLinkedList() {
        return objectLinkedList;
    }
    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object b1, Objects b2) {
        return false;
    }

    @Override
    public long hashFunction(Object obj, int parameter) {
        long wordInt = 0;
        String nome = obj.toString();
        for (int i = 0; i < nome.length(); i++) {
            wordInt += (long) nome.charAt(i) * Math.pow(parameter, nome.length() -(i+1));
        }
        return wordInt;
    }
}
