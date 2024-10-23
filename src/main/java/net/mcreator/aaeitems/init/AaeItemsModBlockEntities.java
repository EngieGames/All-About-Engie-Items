
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aaeitems.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.aaeitems.block.entity.MetalTableBlockEntity;
import net.mcreator.aaeitems.block.entity.MetalChestWarpedBlockEntity;
import net.mcreator.aaeitems.block.entity.MetalChestSpruceBlockEntity;
import net.mcreator.aaeitems.block.entity.MetalChestOakBlockEntity;
import net.mcreator.aaeitems.block.entity.MetalChestJungleBlockEntity;
import net.mcreator.aaeitems.block.entity.MetalChestDarkOakBlockEntity;
import net.mcreator.aaeitems.block.entity.MetalChestCrimsonBlockEntity;
import net.mcreator.aaeitems.block.entity.MetalChestBlockEntity;
import net.mcreator.aaeitems.block.entity.MetalChestBirchBlockEntity;
import net.mcreator.aaeitems.block.entity.MetalChestAcaciaBlockEntity;
import net.mcreator.aaeitems.AaeItemsMod;

public class AaeItemsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, AaeItemsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> METAL_TABLE = register("metal_table", AaeItemsModBlocks.METAL_TABLE, MetalTableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST = register("metal_chest", AaeItemsModBlocks.METAL_CHEST, MetalChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_OAK = register("metal_chest_oak", AaeItemsModBlocks.METAL_CHEST_OAK, MetalChestOakBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_DARK_OAK = register("metal_chest_dark_oak", AaeItemsModBlocks.METAL_CHEST_DARK_OAK, MetalChestDarkOakBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_SPRUCE = register("metal_chest_spruce", AaeItemsModBlocks.METAL_CHEST_SPRUCE, MetalChestSpruceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_ACACIA = register("metal_chest_acacia", AaeItemsModBlocks.METAL_CHEST_ACACIA, MetalChestAcaciaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_BIRCH = register("metal_chest_birch", AaeItemsModBlocks.METAL_CHEST_BIRCH, MetalChestBirchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_WARPED = register("metal_chest_warped", AaeItemsModBlocks.METAL_CHEST_WARPED, MetalChestWarpedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_CRIMSON = register("metal_chest_crimson", AaeItemsModBlocks.METAL_CHEST_CRIMSON, MetalChestCrimsonBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_JUNGLE = register("metal_chest_jungle", AaeItemsModBlocks.METAL_CHEST_JUNGLE, MetalChestJungleBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
