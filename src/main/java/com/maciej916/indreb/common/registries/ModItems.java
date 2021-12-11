package com.maciej916.indreb.common.registries;

import com.maciej916.indreb.common.enums.EnergyTier;
import com.maciej916.indreb.common.enums.EnumEnergyType;
import com.maciej916.indreb.common.enums.ModArmorMaterials;
import com.maciej916.indreb.common.item.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ModItems {

    public static Item RAW_TIN;
    public static Item TIN_INGOT;
    public static Item SILVER_INGOT;
    public static Item BRONZE_INGOT;
    public static Item STEEL_INGOT;
    public static Item MIXED_METAL_INGOT;

    public static Item CRUSHED_TIN;
    public static Item CRUSHED_COPPER;
    public static Item CRUSHED_IRON;
    public static Item CRUSHED_GOLD;

    public static Item COAL_DUST;
    public static Item DIAMOND_DUST;
    public static Item ENERGIUM_DUST;
    public static Item SILVER_DUST;
    public static Item STONE_DUST;
    public static Item DEEPSLATE_DUST;

    public static Item STICKY_RESIN;
    public static Item RUBBER;

    public static Item ELECTRONIC_CIRCUIT;
    public static Item ADVANCED_CIRCUIT;

    public static Item BATTERY;
    public static Item ADVANCED_BATTERY;
    public static Item ENERGY_CRYSTAL;
    public static Item LAPOTRON_CRYSTAL;

    public static Item FLUID_CELL;

    public static Item SAWDUST;
    public static Item IRON_ROD;

    public static Item COPPER_PLATE;
    public static Item TIN_PLATE;
    public static Item IRON_PLATE;
    public static Item GOLD_PLATE;
    public static Item BRONZE_PLATE;
    public static Item STEEL_PLATE;
    public static Item IRIDIUM_PLATE;

    public static Item CARBON_FIBERS;
    public static Item COMBINED_CARBON_FIBERS;
    public static Item CARBON_PLATE;

    public static Item ADVANCED_ALLOY;

    public static Item NIGHTVISION_GOGGLES;
    public static Item RUBBER_BOOTS;

    public static Item BRONZE_HELMET;
    public static Item BRONZE_CHESTPLATE;
    public static Item BRONZE_LEGGINGS;
    public static Item BRONZE_BOOTS;

    public static Item BRONZE_SWORD;
    public static Item BRONZE_PICKAXE;
    public static Item BRONZE_AXE;
    public static Item BRONZE_SHOVEL;
    public static Item BRONZE_HOE;

    public static Item NANO_HELMET;
    public static Item NANO_CHESTPLATE;
    public static Item NANO_LEGGINGS;
    public static Item NANO_BOOTS;
    public static Item NANO_SABER;

    public static Item TREETAP;
    public static Item WRENCH;
    public static Item HAMMER;
    public static Item CUTTER;

    public static Item FOAM_SPRAYER;
    public static Item PAINTER;
    public static Item PAINTER_WHITE;
    public static Item PAINTER_RED;
    public static Item PAINTER_ORANGE;
    public static Item PAINTER_PINK;
    public static Item PAINTER_YELLOW;
    public static Item PAINTER_LIME;
    public static Item PAINTER_GREEN;
    public static Item PAINTER_LIGHT_BLUE;
    public static Item PAINTER_CYAN;
    public static Item PAINTER_BLUE;
    public static Item PAINTER_MAGENTA;
    public static Item PAINTER_PURPLE;
    public static Item PAINTER_BROWN;
    public static Item PAINTER_GRAY;
    public static Item PAINTER_LIGHT_GRAY;
    public static Item PAINTER_BLACK;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

        RAW_TIN = registerItem(new ItemBasic(), "raw_tin");
        TIN_INGOT = registerItem(new ItemBasic(), "tin_ingot");
        BRONZE_INGOT = registerItem(new ItemBasic(), "bronze_ingot");
        STEEL_INGOT = registerItem(new ItemBasic(), "steel_ingot");
        MIXED_METAL_INGOT = registerItem(new ItemBasic(), "mixed_metal_ingot");
        SILVER_INGOT = registerItem(new ItemBasic(), "silver_ingot");

        CRUSHED_TIN = registerItem(new ItemBasic(), "crushed_tin");
        CRUSHED_COPPER = registerItem(new ItemBasic(), "crushed_copper");
        CRUSHED_IRON = registerItem(new ItemBasic(), "crushed_iron");
        CRUSHED_GOLD = registerItem(new ItemBasic(), "crushed_gold");

        COAL_DUST = registerItem(new ItemBasic(), "coal_dust");
        DIAMOND_DUST = registerItem(new ItemBasic(), "diamond_dust");
        ENERGIUM_DUST = registerItem(new ItemBasic(), "energium_dust");
        SILVER_DUST = registerItem(new ItemBasic(), "silver_dust");
        STONE_DUST = registerItem(new ItemBasic(), "stone_dust");
        DEEPSLATE_DUST = registerItem(new ItemBasic(), "deepslate_dust");

        STICKY_RESIN = registerItem(new ItemBasic(), "sticky_resin");
        RUBBER = registerItem(new ItemBasic(), "rubber");

        ELECTRONIC_CIRCUIT = registerItem(new ItemBasic(), "electronic_circuit");
        ADVANCED_CIRCUIT = registerItem(new ItemBasic(), "advanced_circuit");

        BATTERY = registerItem(new ItemEnergy(0, 10000, EnumEnergyType.BOTH, EnergyTier.BASIC), "battery");
        ADVANCED_BATTERY = registerItem(new ItemEnergy(0, 40000, EnumEnergyType.BOTH, EnergyTier.STANDARD), "advanced_battery");
        ENERGY_CRYSTAL = registerItem(new ItemEnergy(0, 100000, EnumEnergyType.BOTH, EnergyTier.ADVANCED), "energy_crystal");
        LAPOTRON_CRYSTAL = registerItem(new ItemEnergy(0, 1000000, EnumEnergyType.BOTH, EnergyTier.SUPER), "lapotron_crystal");

        FLUID_CELL = registerItem(new ItemCell(), "fluid_cell");

        SAWDUST = registerItem(new ItemBasic(), "sawdust");
        IRON_ROD = registerItem(new ItemBasic(), "iron_rod");

        COPPER_PLATE = registerItem(new ItemBasic(), "copper_plate");
        TIN_PLATE = registerItem(new ItemBasic(), "tin_plate");
        IRON_PLATE = registerItem(new ItemBasic(), "iron_plate");
        GOLD_PLATE = registerItem(new ItemBasic(), "gold_plate");
        BRONZE_PLATE = registerItem(new ItemBasic(), "bronze_plate");
        STEEL_PLATE = registerItem(new ItemBasic(), "steel_plate");
        IRIDIUM_PLATE = registerItem(new ItemBasic(), "iridium_plate");

        CARBON_FIBERS = registerItem(new ItemBasic(), "carbon_fibers");
        COMBINED_CARBON_FIBERS = registerItem(new ItemBasic(), "combined_carbon_fibers");
        CARBON_PLATE = registerItem(new ItemBasic(), "carbon_plate");

        ADVANCED_ALLOY = registerItem(new ItemBasic(), "advanced_alloy");

        NIGHTVISION_GOGGLES = registerItem(new IndRebArmour(ModArmorMaterials.NIGHTVISION, EquipmentSlot.HEAD), "nightvision_goggles");
        RUBBER_BOOTS = registerItem(new IndRebArmour(ModArmorMaterials.RUBBER, EquipmentSlot.FEET), "rubber_boots");

        BRONZE_HELMET = registerItem(new IndRebArmour(ModArmorMaterials.BRONZE, EquipmentSlot.HEAD), "bronze_helmet");
        BRONZE_CHESTPLATE = registerItem(new IndRebArmour(ModArmorMaterials.BRONZE, EquipmentSlot.CHEST), "bronze_chestplate");
        BRONZE_LEGGINGS = registerItem(new IndRebArmour(ModArmorMaterials.BRONZE, EquipmentSlot.LEGS), "bronze_leggings");
        BRONZE_BOOTS = registerItem(new IndRebArmour(ModArmorMaterials.BRONZE, EquipmentSlot.FEET), "bronze_boots");

        BRONZE_SWORD = registerItem(new IndRebSword(Tiers.IRON, 3, -2.4F), "bronze_sword");
        BRONZE_PICKAXE = registerItem(new IndRebPickaxe(Tiers.IRON, 1, -2.8F), "bronze_pickaxe");
        BRONZE_AXE = registerItem(new IndRebAxe(Tiers.IRON, 6.0F, -3.1F), "bronze_axe");
        BRONZE_SHOVEL = registerItem(new IndRebShovel(Tiers.IRON, 1.5F, -3.0F), "bronze_shovel");
        BRONZE_HOE = registerItem(new IndRebHoe(Tiers.IRON, -2, -1.0F), "bronze_hoe");

        NANO_HELMET = registerItem(new ItemNanoArmour(EquipmentSlot.HEAD, 0, 1000000, EnumEnergyType.RECEIVE, EnergyTier.ADVANCED), "nano_helmet");
        NANO_CHESTPLATE = registerItem(new ItemNanoArmour(EquipmentSlot.CHEST, 0, 1000000, EnumEnergyType.RECEIVE, EnergyTier.ADVANCED), "nano_chestplate");
        NANO_LEGGINGS = registerItem(new ItemNanoArmour(EquipmentSlot.LEGS, 0, 1000000, EnumEnergyType.RECEIVE, EnergyTier.ADVANCED), "nano_leggings");
        NANO_BOOTS = registerItem(new ItemNanoArmour(EquipmentSlot.FEET, 0, 1000000, EnumEnergyType.RECEIVE, EnergyTier.ADVANCED), "nano_boots");
        NANO_SABER = registerItem(new ItemNanosaber(1, -3F, 0, 160000, EnumEnergyType.RECEIVE, EnergyTier.ADVANCED), "nano_saber");

        TREETAP = registerItem(new ItemTreetap(20), "treetap");
        WRENCH = registerItem(new ItemWrench(120), "wrench");
        HAMMER = registerItem(new ItemTool(80), "hammer");
        CUTTER = registerItem(new ItemTool(60), "cutter");

//        FOAM_SPRAYER = registerItem(new ItemWIP(), "foam_sprayer");
        PAINTER = registerItem(new ItemTool(1), "painter");
        PAINTER_WHITE = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_WHITE.defaultBlockState()), "painter_white");
        PAINTER_RED = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_RED.defaultBlockState()), "painter_red");
        PAINTER_ORANGE = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_ORANGE.defaultBlockState()), "painter_orange");
        PAINTER_PINK = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_PINK.defaultBlockState()), "painter_pink");
        PAINTER_YELLOW = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_YELLOW.defaultBlockState()), "painter_yellow");
        PAINTER_LIME = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_LIME.defaultBlockState()), "painter_lime");
        PAINTER_GREEN = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_GREEN.defaultBlockState()), "painter_green");
        PAINTER_LIGHT_BLUE = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_LIGHT_BLUE.defaultBlockState()), "painter_light_blue");
        PAINTER_CYAN = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_CYAN.defaultBlockState()), "painter_cyan");
        PAINTER_BLUE = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_BLUE.defaultBlockState()), "painter_blue");
        PAINTER_MAGENTA = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_MAGENTA.defaultBlockState()), "painter_magenta");
        PAINTER_PURPLE = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_PURPLE.defaultBlockState()), "painter_purple");
        PAINTER_BROWN = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_BROWN.defaultBlockState()), "painter_brown");
        PAINTER_GRAY = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_GRAY.defaultBlockState()), "painter_gray");
        PAINTER_LIGHT_GRAY = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_LIGHT_GRAY.defaultBlockState()), "painter_light_gray");
        PAINTER_BLACK = registerItem(new ItemPainter(ModBlocks.CONSTRUCTION_FOAM_WALL_BLACK.defaultBlockState()), "painter_black");



    }

    public static Item registerItem(Item item, String name) {
        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

}