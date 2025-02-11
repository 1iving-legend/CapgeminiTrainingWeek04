package smart_house_management_system;

import java.util.ArrayList;

public class WarehouseUtil{
    public static  void displayItems(ArrayList<? extends WareHouseItem> items)
    {
        for(WareHouseItem  item:items)
        {
            item.showDetails();
        }
    }
}
