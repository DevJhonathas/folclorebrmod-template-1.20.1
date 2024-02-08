package net.johnny.folclorebr;

import net.fabricmc.api.ModInitializer;

import net.johnny.folclorebr.item.CustomItems;
import net.johnny.folclorebr.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Folclorebrmod implements ModInitializer {
	public static final String MOD_ID = "folclorebrmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		CustomItems.registerModItems();
	}
}