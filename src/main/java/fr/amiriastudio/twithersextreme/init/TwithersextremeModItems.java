
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.amiriastudio.twithersextreme.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import fr.amiriastudio.twithersextreme.TwithersextremeMod;

public class TwithersextremeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TwithersextremeMod.MODID);
	public static final RegistryObject<Item> FIRECHARGER = block(TwithersextremeModBlocks.FIRECHARGER, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
