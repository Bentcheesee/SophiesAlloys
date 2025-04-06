package com.sophiecheese.alloys.init;

import java.util.function.Function;

import com.google.common.base.Supplier;
import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.block.NoFruitBlock;
import com.sophiecheese.alloys.block.OreberryBushBlock;
import com.sophiecheese.alloys.block.SophieFlammableLogBlock;
import com.sophiecheese.alloys.block.WeakLeverBlock;
import com.sophiecheese.alloys.item.consumables.FoodItemProperties;
import com.sophiecheese.alloys.worldgen.NoFruitTreeGrower;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.GravelBlock;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.LeverBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StoneButtonBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.WoodButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class OtherBlocksInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			SophiesAlloys.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = GeneralItemInit.ITEMS;

	
//No Fruit
	public static final WoodType NO_FRUIT_WT = WoodType.create("sophies_alloys:no_fruit");

	public static final RegistryObject<SaplingBlock> NO_FRUIT_SAPLING = register("no_fruit_sapling",
			() -> new SaplingBlock(new NoFruitTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.AZALEA_LEAVES)),
			object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<FlowerPotBlock> POTTED_NO_FRUIT_SAPLING = BLOCKS.register("potted_no_fruit_sapling",
			() -> new FlowerPotBlock(NO_FRUIT_SAPLING.get(), BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));

	public static final RegistryObject<NoFruitBlock> NO_FRUIT_BLOCK = register("no_fruit",
			() -> new NoFruitBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(0.1F).noCollission().sound(SoundType.SWEET_BERRY_BUSH)),
			object -> () -> new ItemNameBlockItem(object.get(), GeneralItemInit.tabAttributeFood().food(FoodItemProperties.NO_FRUIT)));

	public static final RegistryObject<RotatedPillarBlock> STRIPPED_NO_LOG = register("stripped_no_fruit_log",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).color(MaterialColor.TERRACOTTA_LIGHT_GREEN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<RotatedPillarBlock> NO_LOG = register("no_fruit_log",
			() -> new SophieFlammableLogBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).color(MaterialColor.DEEPSLATE), STRIPPED_NO_LOG), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<RotatedPillarBlock> STRIPPED_NO_WOOD = register("stripped_no_fruit_wood",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).color(MaterialColor.TERRACOTTA_LIGHT_GREEN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<RotatedPillarBlock> NO_WOOD = register("no_fruit_wood",
			() -> new SophieFlammableLogBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).color(MaterialColor.DEEPSLATE), STRIPPED_NO_WOOD), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<LeavesBlock> NO_FRUIT_LEAVES = register("no_fruit_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).color(MaterialColor.QUARTZ).noOcclusion()),
			object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> NO_FRUIT_PLANKS = register("no_fruit_planks",
			() -> new Block(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_LIGHT_GREEN).strength(2.0F, 3.0F).sound(SoundType.WOOD)),
			object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<StairBlock> NO_FRUIT_STAIRS = register("no_fruit_stairs",
			() -> new StairBlock(NO_FRUIT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).color(MaterialColor.TERRACOTTA_LIGHT_GREEN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<SlabBlock> NO_FRUIT_SLAB = register("no_fruit_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).color(MaterialColor.TERRACOTTA_LIGHT_GREEN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<DoorBlock> NO_FRUIT_DOOR = register("no_fruit_door",
			() -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_LIGHT_GREEN).strength(3.0F).sound(SoundType.WOOD).noOcclusion()), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<TrapDoorBlock> NO_FRUIT_TRAPDOOR = register("no_fruit_trapdoor",
			() -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).color(MaterialColor.TERRACOTTA_LIGHT_GREEN).noOcclusion()), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<FenceBlock> NO_FRUIT_FENCE = register("no_fruit_fence",
			() -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).color(MaterialColor.TERRACOTTA_LIGHT_GREEN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<FenceGateBlock> NO_FRUIT_FENCE_GATE = register("no_fruit_fence_gate",
			() -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE).color(MaterialColor.TERRACOTTA_LIGHT_GREEN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<PressurePlateBlock> NO_FRUIT_PRESSURE_PLATE = register("no_fruit_pressure_plate",
			() -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<WoodButtonBlock> NO_FRUIT_BUTTON = register("no_fruit_button",
			() -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.WOOD)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));

//Soul Stone
	public static final Material SOUL_MAT = (new Material.Builder(MaterialColor.COLOR_BROWN)).build();
	public static final Properties SOUL_STONES = BlockBehaviour.Properties.of(SOUL_MAT)
			.strength(1.8f).requiresCorrectToolForDrops().sound(SoundType.STONE);
	public static final Properties SOUL_COBBLES = BlockBehaviour.Properties.of(SOUL_MAT)
			.strength(2.3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE);

	public static final RegistryObject<Block> SOUL_STONE = register("soul_stone",
			() -> new Block(SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<StairBlock> SOUL_STONE_STAIRS = register("soul_stone_stairs",
			() -> new StairBlock(SOUL_STONE.get().defaultBlockState(), SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SOUL_STONE_SLAB = register("soul_stone_slab",
			() -> new SlabBlock(SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SOUL_STONE_WALL = register("soul_stone_wall",
			() -> new WallBlock(SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SOUL_STONE_BRICKS = register("soul_stone_bricks",
			() -> new Block(SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<StairBlock> SOUL_STONE_BRICK_STAIRS = register("soul_stone_brick_stairs",
			() -> new StairBlock(SOUL_STONE_BRICKS.get().defaultBlockState(), SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SOUL_STONE_BRICK_SLAB = register("soul_stone_brick_slab",
			() -> new SlabBlock(SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SOUL_STONE_BRICK_WALL = register("soul_stone_brick_wall",
			() -> new WallBlock(SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SOUL_STONE_BRICK_CRACKED = register("soul_stone_bricks_cracked",
			() -> new Block(SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SOUL_STONE_TILES = register("soul_stone_tiles",
			() -> new Block(SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<StairBlock> SOUL_STONE_TILE_STAIRS = register("soul_stone_tile_stairs",
			() -> new StairBlock(SOUL_STONE_TILES.get().defaultBlockState(), SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SOUL_STONE_TILE_SLAB = register("soul_stone_tile_slab",
			() -> new SlabBlock(SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SOUL_STONE_TILE_WALL = register("soul_stone_tile_wall",
			() -> new WallBlock(SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SOUL_STONE_TILE_CRACKED = register("soul_stone_tiles_cracked",
			() -> new Block(SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));

	public static final RegistryObject<StoneButtonBlock> SOUL_STONE_BUTTON = register("soul_stone_button",
			() -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F)),
			object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<LeverBlock> SOUL_STONE_LEVER = register("soul_stone_lever",
			() -> new WeakLeverBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F).sound(SoundType.STONE)),
			object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
		
	public static final RegistryObject<Block> SOUL_COBBLESTONE = register("soul_cobblestone",
			() -> new Block(SOUL_COBBLES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<StairBlock> SOUL_COBBLESTONE_STAIRS = register("soul_cobblestone_stairs",
			() -> new StairBlock(SOUL_COBBLESTONE.get().defaultBlockState(), SOUL_STONES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SOUL_COBBLESTONE_SLAB = register("soul_cobblestone_slab",
			() -> new SlabBlock(SOUL_COBBLES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SOUL_COBBLESTONE_WALL = register("soul_cobblestone_wall",
			() -> new WallBlock(SOUL_COBBLES), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));

//Slate
	public static final Material SLATE_MAT = (new Material.Builder(MaterialColor.CLAY)).build();
	public static final Properties SLATE_BLOCKS = BlockBehaviour.Properties.of(SLATE_MAT)
			.strength(2.1f, 2.0f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_TILES);

	public static final RegistryObject<Block> SLATE = register("slate",
			() -> new GravelBlock(BlockBehaviour.Properties.of(SLATE_MAT)
				.strength(1.2f, 0.75f).requiresCorrectToolForDrops().sound(SoundType.DRIPSTONE_BLOCK)), 
			object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));

	public static final RegistryObject<Block> SLATE_COMPRESSED = register("compressed_slate",
			() -> new Block(SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<StairBlock> SLATE_COMPRESSED_STAIRS = register("slate_stairs",
			() -> new StairBlock(SLATE_COMPRESSED.get().defaultBlockState(), SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SLATE_SLAB = register("slate_slab",
			() -> new SlabBlock(SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SLATE_WALL = register("slate_wall",
			() -> new WallBlock(SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SLATE_BRICK = register("slate_bricks",
			() -> new Block(SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<StairBlock> SLATE_BRICK_STAIRS = register("slate_brick_stairs",
			() -> new StairBlock(SLATE_BRICK.get().defaultBlockState(), SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SLATE_BRICK_SLAB = register("slate_brick_slab",
			() -> new SlabBlock(SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SLATE_BRICK_WALL = register("slate_brick_wall",
			() -> new WallBlock(SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SLATE_BRICK_CRACKED = register("slate_bricks_cracked",
			() -> new Block(SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SLATE_TILE = register("slate_tiles",
			() -> new Block(SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<StairBlock> SLATE_TILE_STAIRS = register("slate_tile_stairs",
			() -> new StairBlock(SLATE_TILE.get().defaultBlockState(), SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SLATE_TILE_SLAB = register("slate_tile_slab",
			() -> new SlabBlock(SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SLATE_TILE_WALL = register("slate_tile_wall",
			() -> new WallBlock(SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> SLATE_TILE_CRACKED = register("slate_tiles_cracked",
			() -> new Block(SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<RotatedPillarBlock> SLATE_PILLAR = register("slate_pillar",
			() -> new RotatedPillarBlock(SLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
		
//Mossy Cobbled Deepslate
	public static final Material DEEPSLATE_MAT = (new Material.Builder(MaterialColor.DEEPSLATE)).build();
	public static final Properties DEEPSLATE_BLOCKS = BlockBehaviour.Properties.of(DEEPSLATE_MAT)
			.strength(3.5F, 6.0F).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE);

	public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE = register("mossy_cobbled_deepslate",
			() -> new Block(DEEPSLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<StairBlock> MOSSY_COBBLED_DEEPSLATE_STAIRS = register("mossy_cobbled_deepslate_stairs",
			() -> new StairBlock(MOSSY_COBBLED_DEEPSLATE.get().defaultBlockState(), DEEPSLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_SLAB = register("mossy_cobbled_deepslate_slab",
			() -> new SlabBlock(DEEPSLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> MOSSY_COBBLED_DEEPSLATE_WALL = register("mossy_cobbled_deepslate_wall",
			() -> new WallBlock(DEEPSLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK = register("mossy_deepslate_bricks",
			() -> new Block(DEEPSLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<StairBlock> MOSSY_DEEPSLATE_BRICK_STAIRS = register("mossy_deepslate_brick_stairs",
			() -> new StairBlock(MOSSY_DEEPSLATE_BRICK.get().defaultBlockState(), DEEPSLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_SLAB = register("mossy_deepslate_brick_slab",
			() -> new SlabBlock(DEEPSLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<Block> MOSSY_DEEPSLATE_BRICK_WALL = register("mossy_deepslate_brick_wall",
			() -> new WallBlock(DEEPSLATE_BLOCKS), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
		
//Oreberries
	public static final RegistryObject<OreberryBushBlock> OREBERRY_BUSH_BLOCK = register("oreberry_bush",
			() -> new OreberryBushBlock(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).lightLevel((p_50870_) -> {return 4;})),
			object -> () -> new ItemNameBlockItem(object.get(), GeneralItemInit.tabAttributeFood().food(FoodItemProperties.OREBERRY)));
	public static final RegistryObject<FlowerPotBlock> POTTED_OREBERRY_BUSH = BLOCKS.register("potted_oreberry_bush",
			() -> new FlowerPotBlock(OREBERRY_BUSH_BLOCK.get(), BlockBehaviour.Properties.copy(POTTED_NO_FRUIT_SAPLING.get()).noOcclusion()));
	public static final RegistryObject<FlowerPotBlock> POTTED_SWEETBERRY_BUSH = BLOCKS.register("potted_sweetberry_bush",
			() -> new FlowerPotBlock(Blocks.SWEET_BERRY_BUSH, BlockBehaviour.Properties.copy(POTTED_NO_FRUIT_SAPLING.get()).noOcclusion()));

//Chains and Lanterns
	public static final RegistryObject<ChainBlock> FOXITE_CHAIN = register("foxite_chain",
			() -> new ChainBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.CHAIN).noOcclusion()), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<LanternBlock> FOXITE_LANTERN = register("foxite_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<LanternBlock> FOXITE_SOUL_LANTERN = register("foxite_soul_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<ChainBlock> GOLD_CHAIN = register("gold_chain",
			() -> new ChainBlock(BlockBehaviour.Properties.copy(FOXITE_CHAIN.get())), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<LanternBlock> GOLD_LANTERN = register("gold_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<LanternBlock> GOLD_SOUL_LANTERN = register("gold_soul_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<ChainBlock> NETHERITE_CHAIN = register("netherite_chain",
			() -> new ChainBlock(BlockBehaviour.Properties.copy(GOLD_CHAIN.get())), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<LanternBlock> NETHERITE_LANTERN = register("netherite_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<LanternBlock> NETHERITE_SOUL_LANTERN = register("netherite_soul_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<ChainBlock> SILVER_CHAIN = register("silver_chain",
			() -> new ChainBlock(BlockBehaviour.Properties.copy(GOLD_CHAIN.get())), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<LanternBlock> SILVER_LANTERN = register("silver_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<LanternBlock> SILVER_SOUL_LANTERN = register("silver_soul_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<ChainBlock> TRITONIUM_CHAIN = register("tritonium_chain",
			() -> new ChainBlock(BlockBehaviour.Properties.copy(GOLD_CHAIN.get())), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<LanternBlock> TRITONIUM_LANTERN = register("tritonium_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<LanternBlock> TRITONIUM_SOUL_LANTERN = register("tritonium_soul_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy()));
	public static final RegistryObject<ChainBlock> TUNGSTEN_CHAIN = register("tungsten_chain",
			() -> new ChainBlock(BlockBehaviour.Properties.copy(GOLD_CHAIN.get())), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<LanternBlock> TUNGSTEN_LANTERN = register("tungsten_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy().fireResistant()));
	public static final RegistryObject<LanternBlock> TUNGSTEN_SOUL_LANTERN = register("tungsten_soul_lantern",
			() -> new LanternBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_LANTERN)), object -> () -> new BlockItem(object.get(), GeneralItemInit.tabAttributeAlloy().fireResistant()));

		
	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
		return BLOCKS.register(name, block);
	}
	
	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}
}