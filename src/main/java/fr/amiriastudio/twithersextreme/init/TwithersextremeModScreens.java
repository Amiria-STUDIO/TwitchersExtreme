
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.amiriastudio.twithersextreme.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import fr.amiriastudio.twithersextreme.client.gui.GuifirechargerScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TwithersextremeModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TwithersextremeModMenus.GUIFIRECHARGER, GuifirechargerScreen::new);
		});
	}
}
