package de.eom.init;

import de.eom.EOM;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

public class EOMBlocks {
	/** The block register is a register where we register all our blocks. */
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EOM.MODID);
	/** The block register is a register where we register all our blocks. */
	private static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EOM.MODID);
	
	public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", () -> new OreBlock(Block.Properties.of(Material.STONE)));
	public static final RegistryObject<Item> LEAD_ORE_ITEM = BLOCK_ITEMS.register("lead_ore", () -> new BlockItem(LEAD_ORE.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	//Purity for ores? With different textures?
	//Interactive periodic table:
	//https://www.rsc.org/periodic-table/
	
	/*
	 * Name of elements followed by their ore and what they consist of:
	 * https://www.jagranjosh.com/general-knowledge/minerals-and-ores-natural-materials-1456201467-1
	 * -----------------------------------------------------------------
	 * Oxides:
	 * Aluminium			Bauxite				Al2O3.2(H2o)
	 * Copper				Cuprites			Cu2O
	 * Iron					Hematite			Fe2O3
	 * Tin					Casseterite			SnO2
	 * -----------------------------------------------------------------
	 * Carbonate ores:
	 * Calcium				Limestone			CACO3
	 * Zinc					Calamine			ZnCO3
	 * Iron					Siderite			FeCO3
	 * -----------------------------------------------------------------
	 * Sulphide:
	 * Zinc					Zinc blende			Cu2S
	 * Copper				Copper glance		Cu2S
	 * Lead					Galena				PbS
	 * Mercury				Cinnabar			HgS
	 * -----------------------------------------------------------------
	 * Halide Ores:
	 * Sodium				Rock Salt			NaCl
	 * Fluoride				Fluorspar			CaF2
	 * Silver				Horn Silver			AgCl
	 * 
	 * 
	 * 
	 * Iron ore types:
	 * https://www.tf.uni-kiel.de/matwis/amat/iss/kap_a/advanced/aa_2_1.html
	 * 
	 * https://en.wikipedia.org/wiki/Ore#Important_ore_minerals
	 */
	
	//Copper
	
	//Tin
	public static final Block TIN_ORE = rBH("tin_ore", new OreBlock(Block.Properties.of(Material.STONE)));
	
	//Aluminium
	
	//Cinnabar HgS used for production of mercury
	
	//Lead
	
	//Silver
	
	//Tungsten
	
	//Bauxite
	
	//Uranium
	
	//Ididum
	
	
	//Sapphire
	//Ruby
	
	public static void registerBlocks() {
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCK_ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	public static void registerBlocks(final RegistryEvent.Register<Block> bre) {
		IForgeRegistry<Block> reg = bre.getRegistry();
		
		reg.register(TIN_ORE);
	}
	
	/**
	 * Helper method to register blocks.<br>
	 * (registerBlocksHelper)
	 * @param registryName the registry name of the block
	 * @param block the block to register
	 * @return the block
	 */
	private static Block rBH(String registryName, Block block) {
		return block.setRegistryName(EOM.MODID, registryName);
	}
}
