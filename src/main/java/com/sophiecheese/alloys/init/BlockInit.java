package com.sophiecheese.alloys.init;

import com.sophiecheese.alloys.SophiesAlloys;
import com.sophiecheese.alloys.block.DustyLampBlock;
import com.sophiecheese.alloys.block.OreberryBushBlock;
import com.sophiecheese.alloys.block.WeakLeverBlock;
import com.sophiecheese.alloys.block.quartzglass.LeadedQuartzGlassBlock;
import com.sophiecheese.alloys.block.quartzglass.LeadedQuartzGlassPaneBlock;
import com.sophiecheese.alloys.block.quartzglass.StainedLeadedQuartzGlassBlock;
import com.sophiecheese.alloys.block.quartzglass.StainedLeadedQuartzGlassPaneBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.ColorRGBA;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class BlockInit {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SophiesAlloys.MOD_ID);
	public static final DeferredRegister.Blocks BLOCKS_TEST_GEN = DeferredRegister.createBlocks(SophiesAlloys.MOD_ID);

	private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
		DeferredBlock<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}

	private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
		ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}

//Properties Builders
	//Ores
	private static final BlockBehaviour.Properties STONE_ORES = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY)
			.requiresCorrectToolForDrops().sound(SoundType.STONE).strength(3.0f);
	private static final BlockBehaviour.Properties DEEPSLATE_ORES = BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE)
			.requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE).strength(4.5f, 3.0f);
	private static final BlockBehaviour.Properties NETHERRACK_ORES = BlockBehaviour.Properties.of().mapColor(MapColor.NETHER)
			.requiresCorrectToolForDrops().sound(SoundType.NETHER_ORE);
	private static final BlockBehaviour.Properties END_ORES = BlockBehaviour.Properties.of().mapColor(MapColor.SAND)
			.requiresCorrectToolForDrops().sound(SoundType.STONE);
	private static final BlockBehaviour.Properties SOUL_ORES = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN)
			.requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS);

	//Palettes
	private static final BlockBehaviour.Properties SOUL_STONES = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN)
		.strength(1.8f, 6.5f).requiresCorrectToolForDrops().sound(SoundType.STONE);
	private static final BlockBehaviour.Properties SOUL_COBBLES = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN)
		.strength(2.3f, 7.5f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE);
	private static final BlockBehaviour.Properties SLATES = BlockBehaviour.Properties.of().mapColor(MapColor.CLAY)
		.strength(2.1f, 1.9f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS);
	private static final BlockBehaviour.Properties CALCITES = BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE)
		.strength(1.0f).requiresCorrectToolForDrops().sound(SoundType.CALCITE).instrument(NoteBlockInstrument.BASEDRUM);
	private static final BlockBehaviour.Properties BLACKSTONES = BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
		.strength(1.5f, 6.0f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE);
	private static final BlockBehaviour.Properties GRANITES = BlockBehaviour.Properties.of().mapColor(MapColor.DIRT)
		.strength(1.5f, 6.0f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE);
	private static final BlockBehaviour.Properties DIORITES = BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ)
		.strength(1.5f, 6.0f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE);

	private static final BlockBehaviour.Properties DEEPSLATES = BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE)
		.strength(3.5f, 6.0f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE);

	private static final BlockBehaviour.Properties LAMPS = BlockBehaviour.Properties.of().mapColor(MapColor.NONE)
		.strength(1.2f).sound(SoundType.GLASS).emissiveRendering(BlockInit::always);
	private static final BlockBehaviour.Properties LQ_GLASS = BlockBehaviour.Properties.ofFullCopy(Blocks.GLASS).mapColor(MapColor.NONE)
		.strength(0.5f).sound(SoundType.GLASS).noOcclusion().isRedstoneConductor(BlockInit::always).isSuffocating(BlockInit::never).isViewBlocking(BlockInit::never);

	private static final UniformInt DEB_0_1 = UniformInt.of(0,1);
	private static final UniformInt DEB_0_2 = UniformInt.of(0,2);
	private static final UniformInt DEB_1_2 = UniformInt.of(1,2);
	private static final UniformInt DEB_2_3 = UniformInt.of(2,3);
	private static final UniformInt DEB_3_6 = UniformInt.of(3,6);
	private static final UniformInt DEB_4_5 = UniformInt.of(4,5);
	private static final UniformInt DEB_5_6 = UniformInt.of(5,6);
	private static final UniformInt DEB_6_8 = UniformInt.of(6,8);


// Silver
	public static final DeferredBlock<Block> SILVER_ORE = registerBlock("silver_ore",
			() -> new DropExperienceBlock(DEB_0_2, STONE_ORES));
	public static final DeferredBlock<Block> DEEPSLATE_SILVER_ORE = registerBlock("silver_deepslate_ore",
			() -> new DropExperienceBlock(DEB_1_2, DEEPSLATE_ORES));
	public static final DeferredBlock<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
			() -> new Block(BlockBehaviour.Properties.of()
				.strength(5.5f, 6.5f).requiresCorrectToolForDrops()
				.mapColor(MapColor.COLOR_LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM)));
	public static final DeferredBlock<Block> SILVER_BLOCK = registerBlock("silver_block",
			() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY)
				.strength(3.9f).requiresCorrectToolForDrops()
				.sound(SoundType.COPPER)));

// Tungsten
	public static final DeferredBlock<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore",
		() -> new DropExperienceBlock(DEB_4_5, STONE_ORES.strength(7.0f, 3.0f)));
    public static final DeferredBlock<Block> DEEPSLATE_TUNGSTEN_ORE = registerBlock("tungsten_deepslate_ore",
		() -> new DropExperienceBlock(DEB_5_6, DEEPSLATE_ORES.strength(8.0f, 3.0f)));
    public static final DeferredBlock<Block> END_TUNGSTEN_ORE = registerBlock("tungsten_end_ore",
		() -> new DropExperienceBlock(DEB_5_6, END_ORES.strength(40.0f, 9.0f)));
    public static final DeferredBlock<Block> RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ)
			.strength(45.0f).requiresCorrectToolForDrops()
			.instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block",
		() -> new Block(BlockBehaviour.Properties.of()
			.mapColor(MapColor.QUARTZ).strength(40.0f, 1200f).requiresCorrectToolForDrops()
			.sound(SoundType.NETHERITE_BLOCK).instrument(NoteBlockInstrument.HAT)));

// Electrum
	public static final DeferredBlock<Block> ELECTRUM_ORE = registerBlock("electrum_ore",
		() -> new DropExperienceBlock(DEB_6_8, STONE_ORES.strength(4.0f, 3.0f)));
	public static final DeferredBlock<Block> DEEPSLATE_ELECTRUM_ORE = registerBlock("electrum_deepslate_ore",
		() -> new DropExperienceBlock(DEB_6_8, DEEPSLATE_ORES.strength(4.5f, 3.0f)));
	public static final DeferredBlock<Block> RAW_ELECTRUM_BLOCK = registerBlock("raw_electrum_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD)
			.strength(6.5f).requiresCorrectToolForDrops()
			.instrument(NoteBlockInstrument.BASEDRUM)));
	public static final DeferredBlock<Block> ELECTRUM_BLOCK = registerBlock("electrum_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD)
			.strength(8.0f, 6.5f).requiresCorrectToolForDrops()
			.sound(SoundType.METAL)));

// Meat
	public static final DeferredBlock<Block> MEAT_ORE = registerBlock("meat_ore",
		() -> new DropExperienceBlock(DEB_2_3, STONE_ORES));
	public static final DeferredBlock<Block> DEEPSLATE_MEAT_ORE = registerBlock("meat_deepslate_ore",
		() -> new DropExperienceBlock(DEB_2_3, DEEPSLATE_ORES));
	public static final DeferredBlock<Block> NETHER_MEAT_ORE = registerBlock("meat_nether_ore",
		() -> new DropExperienceBlock(DEB_2_3, NETHERRACK_ORES));
	public static final DeferredBlock<Block> SOUL_MEAT_ORE = registerBlock("meat_soul_ore",
		() -> new DropExperienceBlock(DEB_6_8, SOUL_ORES));
	public static final DeferredBlock<Block> END_MEAT_ORE = registerBlock("meat_end_ore",
		() -> new DropExperienceBlock(DEB_2_3, END_ORES));
	public static final DeferredBlock<Block> MEAT_BLOCK = registerBlock("meat_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER)
			.strength(3.0f)
			.sound(SoundType.WART_BLOCK)));

// Lead
	public static final DeferredBlock<Block> LEAD_ORE = registerBlock("lead_ore",
		() -> new DropExperienceBlock(DEB_0_1, STONE_ORES.strength(3.0f)));
	public static final DeferredBlock<Block> DEEPSLATE_LEAD_ORE = registerBlock("lead_deepslate_ore",
		() -> new DropExperienceBlock(DEB_0_2, DEEPSLATE_ORES.strength(4.5f, 3.5f)));
	public static final DeferredBlock<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY)
			.strength(9f, 6.5f).requiresCorrectToolForDrops()
			.sound(SoundType.METAL).instrument(NoteBlockInstrument.BASEDRUM)));
	public static final DeferredBlock<Block> LEAD_BLOCK = registerBlock("lead_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_BLACK)
			.strength(15.0f, 6.5f).requiresCorrectToolForDrops()
			.sound(SoundType.COPPER).instrument(NoteBlockInstrument.COW_BELL)));

// Mithril
	public static final DeferredBlock<Block> NETHER_MITHRIL_ORE = registerBlock("mithril_nether_ore",
		() -> new DropExperienceBlock(DEB_3_6, NETHERRACK_ORES.strength(6.0f, 5.0f)));
	public static final DeferredBlock<Block> BLACKSTONE_MITHRIL_ORE = registerBlock("mithril_blackstone_ore",
		() -> new DropExperienceBlock(DEB_6_8, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
			.strength(45.0f, 30.0f).requiresCorrectToolForDrops()
			.sound(SoundType.GILDED_BLACKSTONE)));
	public static final DeferredBlock<Block> BASALT_MITHRIL_ORE = registerBlock("mithril_basalt_ore",
		() -> new DropExperienceBlock(DEB_6_8, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ)
			.strength(50.0f, 20.0f).requiresCorrectToolForDrops()
			.sound(SoundType.GILDED_BLACKSTONE)));
	public static final DeferredBlock<Block> RICH_BASALT = registerBlock("rich_basalt",
		() -> new DropExperienceBlock(DEB_6_8, BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ)
			.strength(6.0f, 5.0f).requiresCorrectToolForDrops()
			.sound(SoundType.GILDED_BLACKSTONE)));
	public static final DeferredBlock<Block> SOUL_MITHRIL_ORE = registerBlock("mithril_soul_ore",
		() -> new DropExperienceBlock(DEB_6_8, SOUL_ORES.strength(8.0f, 6.0f)));
	public static final DeferredBlock<Block> RAW_MITHRIL_BLOCK = registerBlock("raw_mithril_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_CYAN)
			.strength(15.0f,9.0f).requiresCorrectToolForDrops()
			.sound(SoundType.GILDED_BLACKSTONE).instrument(NoteBlockInstrument.BASEDRUM)));
	public static final DeferredBlock<Block> MITHRIL_BLOCK = registerBlock("mithril_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_CYAN)
			.strength(20.0f, 1200f).requiresCorrectToolForDrops()
			.sound(SoundType.NETHERITE_BLOCK).instrument(NoteBlockInstrument.HAT)));
// Steel
	public static final DeferredBlock<Block> STEEL_BLOCK = registerBlock("steel_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GRAY)
			.strength(5.5f, 6.5f).requiresCorrectToolForDrops()
			.sound(SoundType.COPPER_BULB).instrument(NoteBlockInstrument.BELL)));

// Foxite
	public static final DeferredBlock<Block> FOXITE_ORE = registerBlock("foxite_ore",
		() -> new DropExperienceBlock(DEB_1_2, STONE_ORES));
	public static final DeferredBlock<Block> DEEPSLATE_FOXITE_ORE = registerBlock("foxite_deepslate_ore",
		() -> new DropExperienceBlock(DEB_2_3, DEEPSLATE_ORES));
	public static final DeferredBlock<Block> NETHER_FOXITE_ORE = registerBlock("foxite_nether_ore",
		() -> new DropExperienceBlock(DEB_1_2, NETHERRACK_ORES));
	public static final DeferredBlock<Block> SOUL_FOXITE_ORE = registerBlock("foxite_soul_ore",
		() -> new DropExperienceBlock(DEB_4_5, SOUL_ORES));
	public static final DeferredBlock<Block> RAW_FOXITE_BLOCK = registerBlock("raw_foxite_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE)
			.strength(4.5f,7.5f).requiresCorrectToolForDrops()
			.sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
	public static final DeferredBlock<Block> FOXITE_BLOCK = registerBlock("foxite_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE)
			.strength(4.2f).requiresCorrectToolForDrops()
			.sound(SoundType.NETHERITE_BLOCK).instrument(NoteBlockInstrument.PLING)));

	public static final DeferredBlock<Block> BABULYMN_BLOCK = registerBlock("babulymn_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK)
			.strength(5.0f).requiresCorrectToolForDrops()
			.sound(SoundType.METAL).instrument(NoteBlockInstrument.BASS)));
	public static final DeferredBlock<Block> LYCALITE_BLOCK = registerBlock("lycalite_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
			.strength(5.0f).requiresCorrectToolForDrops()
			.sound(SoundType.METAL).instrument(NoteBlockInstrument.BASS)));
	public static final DeferredBlock<Block> OBERITE_BLOCK = registerBlock("oberite_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
			.strength(5.0f).requiresCorrectToolForDrops()
			.sound(SoundType.METAL).instrument(NoteBlockInstrument.BASS)));

// Tritonium
	public static final DeferredBlock<Block> TRITONIUM_ORE = registerBlock("tritonium_ore",
		() -> new DropExperienceBlock(DEB_5_6, STONE_ORES));
	public static final DeferredBlock<Block> DEEPSLATE_TRITONIUM_ORE = registerBlock("tritonium_deepslate_ore",
		() -> new DropExperienceBlock(DEB_6_8, DEEPSLATE_ORES));
	public static final DeferredBlock<Block> RAW_TRITONIUM_BLOCK = registerBlock("raw_tritonium_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM)
			.strength(5.5f,6.5f).requiresCorrectToolForDrops()
			.sound(SoundType.STONE).instrument(NoteBlockInstrument.BASEDRUM)));
	public static final DeferredBlock<Block> TRITONIUM_BLOCK = registerBlock("tritonium_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WARPED_STEM)
			.strength(3.6f).requiresCorrectToolForDrops()
			.sound(SoundType.METAL).instrument(NoteBlockInstrument.PLING)));

// Lagomite
	public static final DeferredBlock<Block> END_LAGOMITE_ORE = registerBlock("lagomite_end_ore",
		() -> new DropExperienceBlock(DEB_5_6, END_ORES
			.strength(40.0f, 60.0f)));
	public static final DeferredBlock<Block> OBSIDIAN_LAGOMITE_ORE = registerBlock("lagomite_obsidian_ore",
		() -> new DropExperienceBlock(DEB_5_6, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
			.strength(50.0f, 1200.0f).requiresCorrectToolForDrops()));
	public static final DeferredBlock<Block> RAW_LAGOMITE_BLOCK = registerBlock("raw_lagomite_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD)
			.strength(40.0f, 30.0f).requiresCorrectToolForDrops()
			.sound(SoundType.METAL).instrument(NoteBlockInstrument.BASEDRUM)));
	public static final DeferredBlock<Block> LAGOMITE_BLOCK = registerBlock("lagomite_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD)
			.strength(40.0f, 1200f).requiresCorrectToolForDrops()
			.sound(SoundType.METAL).instrument(NoteBlockInstrument.BIT)));

// Jade
	public static final DeferredBlock<Block> JADE_ORE = registerBlock("jade_ore",
		() -> new DropExperienceBlock(DEB_2_3, STONE_ORES.strength(4.0f)));
	public static final DeferredBlock<Block> DEEPSLATE_JADE_ORE = registerBlock("jade_deepslate_ore",
		() -> new DropExperienceBlock(DEB_2_3, DEEPSLATE_ORES.strength(5.5f, 3.5f)));
	public static final DeferredBlock<Block> JADE_BLOCK = registerBlock("jade_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GREEN)
			.strength(4.5f).requiresCorrectToolForDrops()
			.sound(SoundType.AMETHYST).instrument(NoteBlockInstrument.PLING)));

// Quingum
	public static final DeferredBlock<Block> QUINGUM_ORE = registerBlock("quingum_ore",
		() -> new DropExperienceBlock(DEB_2_3, STONE_ORES.strength(3.0f)));
	public static final DeferredBlock<Block> DEEPSLATE_QUINGUM_ORE = registerBlock("quingum_deepslate_ore",
		() -> new DropExperienceBlock(DEB_2_3, DEEPSLATE_ORES.strength(4.5f, 3.5f)));
	public static final DeferredBlock<Block> QUINGUM_BLOCK = registerBlock("quingum_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE)
			.strength(4.5f).requiresCorrectToolForDrops()
			.sound(SoundType.AMETHYST).instrument(NoteBlockInstrument.PLING)));

// Crimson Coal
	public static final DeferredBlock<Block> CRIMSON_COAL_ORE = registerBlock("crimson_coal_nether_ore",
		() -> new DropExperienceBlock(DEB_3_6, NETHERRACK_ORES.strength(3.0f)));
	public static final DeferredBlock<Block> CRIMSON_COAL_BLOCK = registerBlock("crimson_coal_block",
		() -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK)
			.strength(5.0f, 6.0f).requiresCorrectToolForDrops()
			.sound(SoundType.METAL).instrument(NoteBlockInstrument.BANJO)));

// Oreberry
	public static final DeferredBlock<Block> OREBERRY_BUSH_BLOCK = BLOCKS.register("oreberry_bush",
		() -> new OreberryBushBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH)
			.instrument(NoteBlockInstrument.BANJO)));
	public static final DeferredBlock<Block> OREBERRY_CRATE = registerBlock("oreberry_crate",
		() -> new Block(BlockBehaviour.Properties.of()
			.mapColor(MapColor.COLOR_GREEN).strength(1.0f, 1.5f)
			.sound(SoundType.WOOL).instrument(NoteBlockInstrument.BANJO)));

// Soul Stone
	public static final DeferredBlock<Block> SOUL_STONE = registerBlock("soul_stone", () -> new Block(SOUL_STONES));
	public static final DeferredBlock<Block> SOUL_STONE_STAIRS = registerBlock("soul_stone_stairs", () -> new StairBlock(SOUL_STONE.get().defaultBlockState(), SOUL_STONES));
	public static final DeferredBlock<Block> SOUL_STONE_SLAB = registerBlock("soul_stone_slab", () -> new SlabBlock(SOUL_STONES));
	public static final DeferredBlock<Block> SOUL_STONE_WALL = registerBlock("soul_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(SOUL_STONE.get()).forceSolidOn()));
	public static final DeferredBlock<Block> SOUL_STONE_BRICKS = registerBlock("soul_stone_bricks", () -> new Block(SOUL_STONES));
	public static final DeferredBlock<Block> SOUL_STONE_BRICK_STAIRS = registerBlock("soul_stone_brick_stairs", () -> new StairBlock(SOUL_STONE_BRICKS.get().defaultBlockState(), SOUL_STONES));
	public static final DeferredBlock<Block> SOUL_STONE_BRICK_SLAB = registerBlock("soul_stone_brick_slab", () -> new SlabBlock(SOUL_STONES));
	public static final DeferredBlock<Block> SOUL_STONE_BRICK_WALL = registerBlock("soul_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(SOUL_STONE_BRICKS.get()).forceSolidOn()));
	public static final DeferredBlock<Block> SOUL_STONE_BRICK_CRACKED = registerBlock("soul_stone_bricks_cracked", () -> new Block(SOUL_STONES));
	public static final DeferredBlock<Block> SOUL_STONE_TILES = registerBlock("soul_stone_tiles", () -> new Block(SOUL_STONES));
	public static final DeferredBlock<Block> SOUL_STONE_TILES_STAIRS = registerBlock("soul_stone_tile_stairs", () -> new StairBlock(SOUL_STONE_TILES.get().defaultBlockState(), SOUL_STONES));
	public static final DeferredBlock<Block> SOUL_STONE_TILES_SLAB = registerBlock("soul_stone_tile_slab", () -> new SlabBlock(SOUL_STONES));
	public static final DeferredBlock<Block> SOUL_STONE_TILES_WALL = registerBlock("soul_stone_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(SOUL_STONE_TILES.get()).forceSolidOn()));
	public static final DeferredBlock<Block> SOUL_STONE_TILES_CRACKED = registerBlock("soul_stone_tiles_cracked", () -> new Block(SOUL_STONES));

	public static final DeferredBlock<Block> SOUL_STONE_BUTTON = registerBlock("soul_stone_button", () -> new ButtonBlock(BlockSetType.STONE, 20, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)
		.mapColor(MapColor.NONE)));
	public static final DeferredBlock<Block> SOUL_STONE_LEVER = registerBlock("soul_stone_lever", () -> new WeakLeverBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LEVER)
		.mapColor(MapColor.NONE)));

	public static final DeferredBlock<Block> SOUL_COBBLESTONE = registerBlock("soul_cobblestone", () -> new Block(SOUL_COBBLES));
	public static final DeferredBlock<Block> SOUL_COBBLESTONE_STAIRS = registerBlock("soul_cobblestone_stairs", () -> new StairBlock(SOUL_COBBLESTONE.get().defaultBlockState(), SOUL_COBBLES));
	public static final DeferredBlock<Block> SOUL_COBBLESTONE_SLAB = registerBlock("soul_cobblestone_slab", () -> new SlabBlock(SOUL_COBBLES));
	public static final DeferredBlock<Block> SOUL_COBBLESTONE_WALL = registerBlock("soul_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(SOUL_COBBLESTONE.get()).forceSolidOn()));

	public static final DeferredBlock<Block> SOUL_GRAVEL = registerBlock("soul_gravel", () -> new ColoredFallingBlock(new ColorRGBA(28161008), BlockBehaviour.Properties.of()
		.strength(0.6f).mapColor(MapColor.COLOR_BROWN)
		.sound(SoundType.GRAVEL).instrument(NoteBlockInstrument.COW_BELL)));

//Slates
public static final DeferredBlock<Block> ROUGH_SLATE = registerBlock("rough_slate", () -> new ColoredFallingBlock(new ColorRGBA(15151515), BlockBehaviour.Properties.of().mapColor(MapColor.CLAY)
	.strength(1.2f, 0.75f).requiresCorrectToolForDrops()
	.sound(SoundType.DRIPSTONE_BLOCK)));
//	public static final DeferredBlock<Block> SUSPICIOUS_SLATE = registerBlock("suspicious_slate", () -> new BrushableBlock(ROUGH_SLATE.get(),
//		SoundEvents.BRUSH_SAND, SoundEvents.BRUSH_SAND_COMPLETED,
//		BlockBehaviour.Properties.ofFullCopy(Blocks.SUSPICIOUS_GRAVEL).mapColor(MapColor.CLAY)
//		.strength(1.3f, 0.1f)
//		.sound(SoundType.DRIPSTONE_BLOCK)));
	public static final DeferredBlock<Block> SLATE = registerBlock("slate", () -> new Block(SLATES));
	public static final DeferredBlock<Block> SLATE_STAIRS = registerBlock("slate_stairs", () -> new StairBlock(SLATE.get().defaultBlockState(), SLATES));
	public static final DeferredBlock<Block> SLATE_SLAB = registerBlock("slate_slab", () -> new SlabBlock(SLATES));
	public static final DeferredBlock<Block> SLATE_WALL = registerBlock("slate_wall", () -> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(SLATE.get()).forceSolidOn()));
	public static final DeferredBlock<Block> SLATE_BRICKS = registerBlock("slate_bricks", () -> new Block(SLATES));
	public static final DeferredBlock<Block> SLATE_BRICK_STAIRS = registerBlock("slate_brick_stairs", () -> new StairBlock(SLATE.get().defaultBlockState(), SLATES));
	public static final DeferredBlock<Block> SLATE_BRICK_SLAB = registerBlock("slate_brick_slab", () -> new SlabBlock(SLATES));
	public static final DeferredBlock<Block> SLATE_BRICK_WALL = registerBlock("slate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(SLATE_BRICKS.get()).forceSolidOn()));
	public static final DeferredBlock<Block> SLATE_BRICKS_CRACKED = registerBlock("slate_bricks_cracked", () -> new Block(SLATES));
	public static final DeferredBlock<Block> SLATE_TILES = registerBlock("slate_tiles", () -> new Block(SLATES));
	public static final DeferredBlock<Block> SLATE_TILE_STAIRS = registerBlock("slate_tile_stairs", () -> new StairBlock(SLATE.get().defaultBlockState(), SLATES));
	public static final DeferredBlock<Block> SLATE_TILE_SLAB = registerBlock("slate_tile_slab", () -> new SlabBlock(SLATES));
	public static final DeferredBlock<Block> SLATE_TILE_WALL = registerBlock("slate_tile_wall", () -> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(SLATE_TILES.get()).forceSolidOn()));
	public static final DeferredBlock<Block> SLATE_TILES_CRACKED = registerBlock("slate_tiles_cracked", () -> new Block(SLATES));
	public static final DeferredBlock<Block> SLATE_PILLAR = registerBlock("slate_pillar", () -> new RotatedPillarBlock(SLATES));

//Cobbleds
	public static final DeferredBlock<Block> COBBLED_BLACKSTONE = registerBlock("cobbled_blackstone", () -> new Block(BLACKSTONES));
	public static final DeferredBlock<Block> COBBLED_BLACKSTONE_STAIRS = registerBlock("cobbled_blackstone_stairs", () -> new StairBlock(COBBLED_BLACKSTONE.get().defaultBlockState(), BLACKSTONES));
	public static final DeferredBlock<Block> COBBLED_BLACKSTONE_SLAB = registerBlock("cobbled_blackstone_slab", () -> new SlabBlock(BLACKSTONES));
	public static final DeferredBlock<Block> COBBLED_BLACKSTONE_WALL = registerBlock("cobbled_blackstone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(COBBLED_BLACKSTONE.get()).forceSolidOn()));

	public static final DeferredBlock<Block> COBBLED_CALCITE = registerBlock("cobbled_calcite", () -> new Block(CALCITES));
	public static final DeferredBlock<Block> COBBLED_CALCITE_STAIRS = registerBlock("cobbled_calcite_stairs", () -> new StairBlock(COBBLED_CALCITE.get().defaultBlockState(), CALCITES));
	public static final DeferredBlock<Block> COBBLED_CALCITE_SLAB = registerBlock("cobbled_calcite_slab", () -> new SlabBlock(CALCITES));
	public static final DeferredBlock<Block> COBBLED_CALCITE_WALL = registerBlock("cobbled_calcite_wall", () -> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(COBBLED_CALCITE.get()).forceSolidOn()));

	public static final DeferredBlock<Block> COBBLED_GRANITE = registerBlock("cobbled_granite", () -> new Block(GRANITES));
	public static final DeferredBlock<Block> COBBLED_GRANITE_STAIRS = registerBlock("cobbled_granite_stairs", () -> new StairBlock(COBBLED_GRANITE.get().defaultBlockState(), GRANITES));
	public static final DeferredBlock<Block> COBBLED_GRANITE_SLAB = registerBlock("cobbled_granite_slab", () -> new SlabBlock(GRANITES));
	public static final DeferredBlock<Block> COBBLED_GRANITE_WALL = registerBlock("cobbled_granite_wall", () -> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(COBBLED_GRANITE.get()).forceSolidOn()));

	public static final DeferredBlock<Block> COBBLED_DIORITE = registerBlock("cobbled_diorite", () -> new Block(DIORITES));
	public static final DeferredBlock<Block> COBBLED_DIORITE_STAIRS = registerBlock("cobbled_diorite_stairs", () -> new StairBlock(COBBLED_DIORITE.get().defaultBlockState(), DIORITES));
	public static final DeferredBlock<Block> COBBLED_DIORITE_SLAB = registerBlock("cobbled_diorite_slab", () -> new SlabBlock(DIORITES));
	public static final DeferredBlock<Block> COBBLED_DIORITE_WALL = registerBlock("cobbled_diorite_wall", () -> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(COBBLED_DIORITE.get()).forceSolidOn()));


// Deepslate
	public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE = registerBlock("mossy_cobbled_deepslate", () -> new Block(DEEPSLATES));
	public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE_STAIRS = registerBlock("mossy_cobbled_deepslate_stairs", () -> new StairBlock(MOSSY_COBBLED_DEEPSLATE.get().defaultBlockState(), DEEPSLATES));
	public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE_SLAB = registerBlock("mossy_cobbled_deepslate_slab", () -> new SlabBlock(DEEPSLATES));
	public static final DeferredBlock<Block> MOSSY_COBBLED_DEEPSLATE_WALL = registerBlock("mossy_cobbled_deepslate_wall", () -> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(MOSSY_COBBLED_DEEPSLATE.get()).forceSolidOn()));
	public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks", () -> new Block(DEEPSLATES));
	public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICK_STAIRS = registerBlock("mossy_deepslate_brick_stairs", () -> new StairBlock(MOSSY_DEEPSLATE_BRICKS.get().defaultBlockState(), DEEPSLATES));
	public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICK_SLAB = registerBlock("mossy_deepslate_brick_slab", () -> new SlabBlock(DEEPSLATES));
	public static final DeferredBlock<Block> MOSSY_DEEPSLATE_BRICK_WALL = registerBlock("mossy_deepslate_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofLegacyCopy(MOSSY_DEEPSLATE_BRICKS.get()).forceSolidOn()));

	public static final DeferredBlock<Block> DEEP_GRAVEL = registerBlock("deep_gravel", () -> new ColoredFallingBlock(new ColorRGBA(8356741), BlockBehaviour.Properties.of()
		.strength(0.8f).mapColor(MapColor.DEEPSLATE)
		.sound(SoundType.GRAVEL).instrument(NoteBlockInstrument.SNARE)));
	public static final DeferredBlock<Block> DEEP_SAND = registerBlock("deep_sand", () -> new ColoredFallingBlock(new ColorRGBA(8356741), BlockBehaviour.Properties.of()
		.strength(0.6f).mapColor(MapColor.DEEPSLATE)
		.sound(SoundType.SAND).instrument(NoteBlockInstrument.SNARE)));

	public static final DeferredBlock<Block> BLACK_GRAVEL = registerBlock("black_gravel", () -> new ColoredFallingBlock(new ColorRGBA(8356741), BlockBehaviour.Properties.of()
		.strength(0.8f, 0.4f).mapColor(MapColor.COLOR_BLACK)
		.sound(SoundType.GRAVEL).instrument(NoteBlockInstrument.SNARE)));
	public static final DeferredBlock<Block> BLACK_SAND = registerBlock("black_sand", () -> new ColoredFallingBlock(new ColorRGBA(8356741), BlockBehaviour.Properties.of()
		.strength(0.6f, 0.3f).mapColor(MapColor.COLOR_BLACK)
		.sound(SoundType.SAND).instrument(NoteBlockInstrument.SNARE)));


	// Chains and Lanterns
	public static final DeferredBlock<Block> FOXITE_CHAIN = registerBlock("foxite_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));
	public static final DeferredBlock<Block> FOXITE_LANTERN = registerBlock("foxite_lantern", () -> new LanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LANTERN)));
	public static final DeferredBlock<Block> FOXITE_SOUL_LANTERN = registerBlock("foxite_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
	public static final DeferredBlock<Block> GOLD_CHAIN = registerBlock("gold_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));
	public static final DeferredBlock<Block> GOLD_LANTERN = registerBlock("gold_lantern", () -> new LanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LANTERN)));
	public static final DeferredBlock<Block> GOLD_SOUL_LANTERN = registerBlock("gold_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
	public static final DeferredBlock<Block> NETHERITE_CHAIN = registerBlock("netherite_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));
	public static final DeferredBlock<Block> NETHERITE_LANTERN = registerBlock("netherite_lantern", () -> new LanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LANTERN)));
	public static final DeferredBlock<Block> NETHERITE_SOUL_LANTERN = registerBlock("netherite_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
	public static final DeferredBlock<Block> SILVER_CHAIN = registerBlock("silver_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));
	public static final DeferredBlock<Block> SILVER_LANTERN = registerBlock("silver_lantern", () -> new LanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LANTERN)));
	public static final DeferredBlock<Block> SILVER_SOUL_LANTERN = registerBlock("silver_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
	public static final DeferredBlock<Block> TRITONIUM_CHAIN = registerBlock("tritonium_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));
	public static final DeferredBlock<Block> TRITONIUM_LANTERN = registerBlock("tritonium_lantern", () -> new LanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LANTERN)));
	public static final DeferredBlock<Block> TRITONIUM_SOUL_LANTERN = registerBlock("tritonium_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
	public static final DeferredBlock<Block> TUNGSTEN_CHAIN = registerBlock("tungsten_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));
	public static final DeferredBlock<Block> TUNGSTEN_LANTERN = registerBlock("tungsten_lantern", () -> new LanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LANTERN)));
	public static final DeferredBlock<Block> TUNGSTEN_SOUL_LANTERN = registerBlock("tungsten_soul_lantern", () -> new LanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN)));
// Bars
	public static final DeferredBlock<Block> LEAD_BARS = registerBlock("lead_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
	public static final DeferredBlock<Block> FOXITE_BARS = registerBlock("foxite_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
	public static final DeferredBlock<Block> SILVER_BARS = registerBlock("silver_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));
	public static final DeferredBlock<Block> TRITONIUM_BARS = registerBlock("tritonium_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS)));

// Dusty Lamps
public static ToIntFunction<BlockState> dustyLight(int lightLevel) {
	return (state) -> {return state.getValue(DustyLampBlock.LIT) ? lightLevel : 0;};}
	public static final DeferredBlock<Block> DUSTY_LAMP = registerBlock("dusty_lamp",
		() -> new DustyLampBlock(9, LAMPS.lightLevel(dustyLight(9))));
	public static final DeferredBlock<Block> DUSTY_AMETHYST_LAMP = registerBlock("dusty_amethyst_lamp",
		() -> new DustyLampBlock(12, LAMPS.lightLevel(dustyLight(12))));
	public static final DeferredBlock<Block> DUSTY_COAL_LAMP = registerBlock("dusty_coal_lamp",
		() -> new DustyLampBlock(6, LAMPS.lightLevel(dustyLight(6))));
	public static final DeferredBlock<Block> DUSTY_COPPER_LAMP = registerBlock("dusty_copper_lamp",
		() -> new DustyLampBlock(12, LAMPS.lightLevel(dustyLight(12))));
	public static final DeferredBlock<Block> DUSTY_CRIMSON_LAMP = registerBlock("dusty_crimson_lamp",
		() -> new DustyLampBlock(6, LAMPS.lightLevel(dustyLight(3))));
	public static final DeferredBlock<Block> DUSTY_DIAMOND_LAMP = registerBlock("dusty_diamond_lamp",
		() -> new DustyLampBlock(12, LAMPS.lightLevel(dustyLight(12))));
	public static final DeferredBlock<Block> DUSTY_ELECTRUM_LAMP = registerBlock("dusty_electrum_lamp",
		() -> new DustyLampBlock(12, LAMPS.lightLevel(dustyLight(12))));
	public static final DeferredBlock<Block> DUSTY_EMERALD_LAMP = registerBlock("dusty_emerald_lamp",
		() -> new DustyLampBlock(12, LAMPS.lightLevel(dustyLight(12))));
	public static final DeferredBlock<Block> DUSTY_FOXITE_LAMP = registerBlock("dusty_foxite_lamp",
		() -> new DustyLampBlock(6, LAMPS.lightLevel(dustyLight(6))));
	public static final DeferredBlock<Block> DUSTY_GOLD_LAMP = registerBlock("dusty_gold_lamp",
		() -> new DustyLampBlock(15, LAMPS.lightLevel(dustyLight(15))));
	public static final DeferredBlock<Block> DUSTY_IRON_LAMP = registerBlock("dusty_iron_lamp",
		() -> new DustyLampBlock(6, LAMPS.lightLevel(dustyLight(6))));
	public static final DeferredBlock<Block> DUSTY_JADE_LAMP = registerBlock("dusty_jade_lamp",
		() -> new DustyLampBlock(9, LAMPS.lightLevel(dustyLight(9))));
	public static final DeferredBlock<Block> DUSTY_LAPIS_LAMP = registerBlock("dusty_lapis_lamp",
		() -> new DustyLampBlock(6, LAMPS.lightLevel(dustyLight(6))));
	public static final DeferredBlock<Block> DUSTY_LEADED_QUARTZ_LAMP = registerBlock("dusty_leaded_quartz_lamp",
		() -> new DustyLampBlock(12, LAMPS.lightLevel(dustyLight(12))));
	public static final DeferredBlock<Block> DUSTY_LYCALITE_LAMP = registerBlock("dusty_lycalite_lamp",
		() -> new DustyLampBlock(6, LAMPS.lightLevel(dustyLight(6))));
	public static final DeferredBlock<Block> DUSTY_MITHRIL_LAMP = registerBlock("dusty_mithril_lamp",
		() -> new DustyLampBlock(12, LAMPS.lightLevel(dustyLight(12))));
	public static final DeferredBlock<Block> DUSTY_NETHERITE_LAMP = registerBlock("dusty_netherite_lamp",
		() -> new DustyLampBlock(6, LAMPS.lightLevel(dustyLight(6))));
	public static final DeferredBlock<Block> DUSTY_OBERITE_LAMP = registerBlock("dusty_oberite_lamp",
		() -> new DustyLampBlock(9, LAMPS.lightLevel(dustyLight(9))));
	public static final DeferredBlock<Block> DUSTY_QUARTZ_LAMP = registerBlock("dusty_quartz_lamp",
		() -> new DustyLampBlock(15, LAMPS.lightLevel(dustyLight(15))));
	public static final DeferredBlock<Block> DUSTY_SILVER_LAMP = registerBlock("dusty_silver_lamp",
		() -> new DustyLampBlock(12, LAMPS.lightLevel(dustyLight(12))));
	public static final DeferredBlock<Block> DUSTY_STEEL_LAMP = registerBlock("dusty_steel_lamp",
		() -> new DustyLampBlock(9, LAMPS.lightLevel(dustyLight(9))));
	public static final DeferredBlock<Block> DUSTY_TRITONIUM_LAMP = registerBlock("dusty_tritonium_lamp",
		() -> new DustyLampBlock(15, LAMPS.lightLevel(dustyLight(15))));
	public static final DeferredBlock<Block> DUSTY_TUNGSTEN_LAMP = registerBlock("dusty_tungsten_lamp",
		() -> new DustyLampBlock(12, LAMPS.lightLevel(dustyLight(12))));
	public static final DeferredBlock<Block> DUSTY_ZINC_LAMP = registerBlock("dusty_zinc_lamp",
		() -> new DustyLampBlock(6, LAMPS.lightLevel(dustyLight(6))));
	public static final DeferredBlock<Block> DUSTY_BRASS_LAMP = registerBlock("dusty_brass_lamp",
		() -> new DustyLampBlock(9, LAMPS.lightLevel(dustyLight(9))));

//Leaded Quartz Glass
	public static final DeferredBlock<Block> LEADED_QUARTZ_SAND = registerBlock("leaded_quartz_sand",
		() -> new ColoredFallingBlock(new ColorRGBA(28161008), BlockBehaviour.Properties.ofFullCopy(Blocks.SAND).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
			.strength(0.5f, 0.3f)));
	public static final DeferredBlock<Block> LEADED_GLASS = registerBlock("leaded_quartz_glass",
		() -> new LeadedQuartzGlassBlock(LQ_GLASS));
	public static final DeferredBlock<Block> WHITE_LEADED_GLASS = registerBlock("white_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.WHITE, LQ_GLASS));
	public static final DeferredBlock<Block> ORANGE_LEADED_GLASS = registerBlock("orange_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.ORANGE, LQ_GLASS));
	public static final DeferredBlock<Block> MAGENTA_LEADED_GLASS = registerBlock("magenta_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.MAGENTA, LQ_GLASS));
	public static final DeferredBlock<Block> LIGHT_BLUE_LEADED_GLASS = registerBlock("light_blue_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.LIGHT_BLUE, LQ_GLASS));
	public static final DeferredBlock<Block> YELLOW_LEADED_GLASS = registerBlock("yellow_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.YELLOW, LQ_GLASS));
	public static final DeferredBlock<Block> LIME_LEADED_GLASS = registerBlock("lime_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.LIME, LQ_GLASS));
	public static final DeferredBlock<Block> PINK_LEADED_GLASS = registerBlock("pink_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.PINK, LQ_GLASS));
	public static final DeferredBlock<Block> GRAY_LEADED_GLASS = registerBlock("gray_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.GRAY, LQ_GLASS));
	public static final DeferredBlock<Block> LIGHT_GRAY_LEADED_GLASS = registerBlock("light_gray_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.LIGHT_GRAY, LQ_GLASS));
	public static final DeferredBlock<Block> CYAN_LEADED_GLASS = registerBlock("cyan_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.CYAN, LQ_GLASS));
	public static final DeferredBlock<Block> PURPLE_LEADED_GLASS = registerBlock("purple_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.PURPLE, LQ_GLASS));
	public static final DeferredBlock<Block> BLUE_LEADED_GLASS = registerBlock("blue_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.BLUE, LQ_GLASS));
	public static final DeferredBlock<Block> BROWN_LEADED_GLASS = registerBlock("brown_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.BROWN, LQ_GLASS));
	public static final DeferredBlock<Block> GREEN_LEADED_GLASS = registerBlock("green_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.GREEN, LQ_GLASS));
	public static final DeferredBlock<Block> RED_LEADED_GLASS = registerBlock("red_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.RED, LQ_GLASS));
	public static final DeferredBlock<Block> BLACK_LEADED_GLASS = registerBlock("black_leaded_quartz_glass",
		() -> new StainedLeadedQuartzGlassBlock(DyeColor.BLACK, LQ_GLASS));

	public static final DeferredBlock<Block> LEADED_GLASS_PANE = registerBlock("leaded_quartz_glass_pane",
		() -> new LeadedQuartzGlassPaneBlock(LQ_GLASS));
	public static final DeferredBlock<Block> WHITE_LEADED_GLASS_PANE = registerBlock("white_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.WHITE, LQ_GLASS));
	public static final DeferredBlock<Block> ORANGE_LEADED_GLASS_PANE = registerBlock("orange_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.ORANGE, LQ_GLASS));
	public static final DeferredBlock<Block> MAGENTA_LEADED_GLASS_PANE = registerBlock("magenta_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.MAGENTA, LQ_GLASS));
	public static final DeferredBlock<Block> LIGHT_BLUE_LEADED_GLASS_PANE = registerBlock("light_blue_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.LIGHT_BLUE, LQ_GLASS));
	public static final DeferredBlock<Block> YELLOW_LEADED_GLASS_PANE = registerBlock("yellow_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.YELLOW, LQ_GLASS));
	public static final DeferredBlock<Block> LIME_LEADED_GLASS_PANE = registerBlock("lime_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.LIME, LQ_GLASS));
	public static final DeferredBlock<Block> PINK_LEADED_GLASS_PANE = registerBlock("pink_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.PINK, LQ_GLASS));
	public static final DeferredBlock<Block> GRAY_LEADED_GLASS_PANE = registerBlock("gray_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.GRAY, LQ_GLASS));
	public static final DeferredBlock<Block> LIGHT_GRAY_LEADED_GLASS_PANE = registerBlock("light_gray_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.LIGHT_GRAY, LQ_GLASS));
	public static final DeferredBlock<Block> CYAN_LEADED_GLASS_PANE = registerBlock("cyan_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.CYAN, LQ_GLASS));
	public static final DeferredBlock<Block> PURPLE_LEADED_GLASS_PANE = registerBlock("purple_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.PURPLE, LQ_GLASS));
	public static final DeferredBlock<Block> BLUE_LEADED_GLASS_PANE = registerBlock("blue_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.BLUE, LQ_GLASS));
	public static final DeferredBlock<Block> BROWN_LEADED_GLASS_PANE = registerBlock("brown_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.BROWN, LQ_GLASS));
	public static final DeferredBlock<Block> GREEN_LEADED_GLASS_PANE = registerBlock("green_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.GREEN, LQ_GLASS));
	public static final DeferredBlock<Block> RED_LEADED_GLASS_PANE = registerBlock("red_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.RED, LQ_GLASS));
	public static final DeferredBlock<Block> BLACK_LEADED_GLASS_PANE = registerBlock("black_leaded_quartz_glass_pane",
		() -> new StainedLeadedQuartzGlassPaneBlock(DyeColor.BLACK, LQ_GLASS));






	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}



	private static boolean always(BlockState state, BlockGetter getter, BlockPos pos) {
		return true;
	}
	private static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
		return false;
	}
}
