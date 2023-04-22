
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.amiriastudio.twithersextreme.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import fr.amiriastudio.twithersextreme.block.FirechargerBlock;
import fr.amiriastudio.twithersextreme.TwithersextremeMod;

public class TwithersextremeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TwithersextremeMod.MODID);
	public static final RegistryObject<Block> FIRECHARGER = REGISTRY.register("firecharger", () -> new FirechargerBlock());
}
