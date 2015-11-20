package domain;
import java.util.HashMap;

public class Card
{
    private String name;
    private int    id;
    private HashMap<String, Object> attributes;
    
    private static int nextId;
    
    public synchronized int getNextId() {
        int id = nextId;
        nextId++;
        return id;
    }
    
    public Card(String name) {
        this.name = name;
        this.id = getNextId();
        this.attributes = new HashMap<String, Object>(2);
    }
    
    public String getName() { return name; }
    public int    getId()   { return id;   }
    
    public boolean nameEquals(String otherName) {
        return name.equals(otherName);
    }
    
    public boolean idEquals(int otherId) {
        return id == otherId;
    }
    
    public void addAttribute(String attrName, Object attr) {
        attributes.put(attrName, attr);
    }
    
    public Object getAttribute(String name) {
        return attributes.get(name);
    }
    
    public void clearAttributes() {
        attributes.clear();
    }
}
