
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaeitems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.aaeitems.block.ThanksForPlayingBlock;
import net.mcreator.aaeitems.block.OldEngieOreBlock;
import net.mcreator.aaeitems.block.OldDeepslateEngieOreBlock;
import net.mcreator.aaeitems.block.MetalTableBlock;
import net.mcreator.aaeitems.block.MetalChestWarpedBlock;
import net.mcreator.aaeitems.block.MetalChestSpruceBlock;
import net.mcreator.aaeitems.block.MetalChestOakBlock;
import net.mcreator.aaeitems.block.MetalChestJungleBlock;
import net.mcreator.aaeitems.block.MetalChestDarkOakBlock;
import net.mcreator.aaeitems.block.MetalChestCrimsonBlock;
import net.mcreator.aaeitems.block.MetalChestBlock;
import net.mcreator.aaeitems.block.MetalChestBirchBlock;
import net.mcreator.aaeitems.block.MetalChestAcaciaBlock;
import net.mcreator.aaeitems.block.EnragedEngieBlockBlock;
import net.mcreator.aaeitems.block.EngieOreBlock;
import net.mcreator.aaeitems.block.EngieBlockBlock;
import net.mcreator.aaeitems.block.DeepslateEngieOreBlock;
import net.mcreator.aaeitems.block.AngryEngieBlockBlock;
import net.mcreator.aaeitems.AaeItemsMod;

public class AaeItemsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AaeItemsMod.MODID);
	public static final RegistryObject<Block> ENGIE_BLOCK = REGISTRY.register("engie_block", () -> new EngieBlockBlock());
	public static final RegistryObject<Block> ANGRY_ENGIE_BLOCK = REGISTRY.register("angry_engie_block", () -> new AngryEngieBlockBlock());
	public static final RegistryObject<Block> ENRAGED_ENGIE_BLOCK = REGISTRY.register("enraged_engie_block", () -> new EnragedEngieBlockBlock());
	public static final RegistryObject<Block> ENGIE_ORE = REGISTRY.register("engie_ore", () -> new EngieOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_ENGIE_ORE = REGISTRY.register("deepslate_engie_ore", () -> new DeepslateEngieOreBlock());
	public static final RegistryObject<Block> METAL_TABLE = REGISTRY.register("metal_table", () -> new MetalTableBlock());
	public static final RegistryObject<Block> OLD_ENGIE_ORE = REGISTRY.register("old_engie_ore", () -> new OldEngieOreBlock());
	public static final RegistryObject<Block> OLD_DEEPSLATE_ENGIE_ORE = REGISTRY.register("old_deepslate_engie_ore", () -> new OldDeepslateEngieOreBlock());
	public static final RegistryObject<Block> THANKS_FOR_PLAYING = REGISTRY.register("thanks_for_playing", () -> new ThanksForPlayingBlock());
	public static final RegistryObject<Block> METAL_CHEST = REGISTRY.register("metal_chest", () -> new MetalChestBlock());
	public static final RegistryObject<Block> METAL_CHEST_OAK = REGISTRY.register("metal_chest_oak", () -> new MetalChestOakBlock());
	public static final RegistryObject<Block> METAL_CHEST_DARK_OAK = REGISTRY.register("metal_chest_dark_oak", () -> new MetalChestDarkOakBlock());
	public static final RegistryObject<Block> METAL_CHEST_SPRUCE = REGISTRY.register("metal_chest_spruce", () -> new MetalChestSpruceBlock());
	public static final RegistryObject<Block> METAL_CHEST_ACACIA = REGISTRY.register("metal_chest_acacia", () -> new MetalChestAcaciaBlock());
	public static final RegistryObject<Block> METAL_CHEST_BIRCH = REGISTRY.register("metal_chest_birch", () -> new MetalChestBirchBlock());
	public static final RegistryObject<Block> METAL_CHEST_WARPED = REGISTRY.register("metal_chest_warped", () -> new MetalChestWarpedBlock());
	public static final RegistryObject<Block> METAL_CHEST_CRIMSON = REGISTRY.register("metal_chest_crimson", () -> new MetalChestCrimsonBlock());
	public static final RegistryObject<Block> METAL_CHEST_JUNGLE = REGISTRY.register("metal_chest_jungle", () -> new MetalChestJungleBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			MetalTableBlock.registerRenderLayer();
			MetalChestBlock.registerRenderLayer();
			MetalChestOakBlock.registerRenderLayer();
			MetalChestDarkOakBlock.registerRenderLayer();
			MetalChestSpruceBlock.registerRenderLayer();
			MetalChestAcaciaBlock.registerRenderLayer();
			MetalChestBirchBlock.registerRenderLayer();
			MetalChestWarpedBlock.registerRenderLayer();
			MetalChestCrimsonBlock.registerRenderLayer();
			MetalChestJungleBlock.registerRenderLayer();
		}
	}
}
