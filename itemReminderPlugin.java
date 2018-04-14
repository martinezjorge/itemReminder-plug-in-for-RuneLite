package net.runelite.client.plugins.itemreminder;

import com.google.inject.Provides;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

//import net.runelite.api.Client;
//import net.runelite.api.InventoryID;
//import net.runelite.api.ItemID;
//import net.runelite.api.Item;
//import net.runelite.api.ItemContainer;



// user will be able to specify which item we need the plug in to keep an eye on
// user will also be able to save their settings as different watch-lists in a drop down menu

//I need to check whether the bank is open or not

// If the bank is open then we won't check if the items are equipped or in inventory yet

// when the bank is closed then we will check
// if the item specified is not in bank or equipped than it will either give you a notification in



@PluginDescriptor(
        name = "Item Reminder",
        enabledByDefault = false
)
public class itemReminderPlugin extends Plugin
{

    @Provides
    itemReminderConfig provideConfig(ConfigManager configManager) { return configManager.getConfig(itemReminderConfig.class );}

}

    /*
    string testShield = "Anti-dragon shield";
    string testInvenItem = "Holy wrench";

    ItemContainer equipContainer = client.getItemContainer(InventoryID.EQUIPMENT);
    ItemContainer invenContainer = client.getItemContainer(InventoryID.INVENTORY);
    //public static final InventoryID[] values();
    */