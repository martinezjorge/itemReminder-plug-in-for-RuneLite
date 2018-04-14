package net.runelite.client.plugins.itemreminder;


import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;


@ConfigGroup(
        keyName = "itemReminder",
        name = "Item Reminder",
        description = "Configuration for the Item Reminder plugin"
)
public interface itemReminderConfig extends Config
{

    @ConfigItem(
            keyName = "itemReminder",
            name = "Item Reminder",
            description = "Set reminders for items when you leave the bank")
    default boolean myCheckbox()
    {
        return true;
    }
    default boolean quickLookUp() { return true; }
}


