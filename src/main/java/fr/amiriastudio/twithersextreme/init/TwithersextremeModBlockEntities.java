
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.amiriastudio.twithersextreme.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import fr.amiriastudio.twithersextreme.block.entity.FirechargerBlockEntity;
import fr.amiriastudio.twithersextreme.TwithersextremeMod;

public class TwithersextremeModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			TwithersextremeMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FIRECHARGER = register("firecharger", TwithersextremeModBlocks.FIRECHARGER,
			FirechargerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
