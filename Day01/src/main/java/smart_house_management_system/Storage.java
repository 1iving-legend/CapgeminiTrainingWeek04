package smart_house_management_system;

import java.util.ArrayList;

public class Storage<T extends WareHouseItem>{
    private ArrayList<T> items= new ArrayList<>();

    public void addItem(T item)
    {
        items.add(item);
    }

    public void removeItem(T item)
    {
        items.remove(item);
    }

    public ArrayList<T> getItems(){
        return items;
    }
}
