package com.maciej916.indreb.common.block.impl.generators.generator;

import com.maciej916.indreb.common.block.BlockElectricMachine;
import com.maciej916.indreb.common.config.ServerConfig;
import com.maciej916.indreb.common.enums.EnergyTier;
import com.maciej916.indreb.common.enums.EnumLang;
import com.maciej916.indreb.common.interfaces.block.IHasContainer;
import com.maciej916.indreb.common.interfaces.block.IStateActive;
import com.maciej916.indreb.common.interfaces.block.IStateFacing;
import com.maciej916.indreb.common.util.BlockStateHelper;
import com.maciej916.indreb.common.util.TextComponentUtil;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class BlockGenerator extends BlockElectricMachine implements IStateFacing, IHasContainer, IStateActive {

    public BlockGenerator() {
        super(EnergyTier.BASIC, 12, 0);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new BlockEntityGenerator(pos, state);
    }

    public ContainerGenerator getContainer(int windowId, Level level, BlockPos pos, Inventory playerInventory, Player playerEntity) {
        return new ContainerGenerator(windowId, level, pos, playerInventory, playerEntity);
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, Random rand) {
        if (stateIn.getValue(BlockStateHelper.activeProperty)) {
            double d0 = (double)pos.getX() + 0.5D;
            double d1 = (double)pos.getY();
            double d2 = (double)pos.getZ() + 0.5D;

            Direction direction = this.getDirection(stateIn);
            Direction.Axis direction$axis = direction.getAxis();
            double d3 = 0.52D;
            double d4 = rand.nextDouble() * 0.6D - 0.3D;
            double d5 = direction$axis == Direction.Axis.X ? (double)direction.getStepX() * 0.52D : d4;
            double d6 = rand.nextDouble() * 6.0D / 16.0D;
            double d7 = direction$axis == Direction.Axis.Z ? (double)direction.getStepZ() * 0.52D : d4;
            worldIn.addParticle(ParticleTypes.SMOKE, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
            worldIn.addParticle(ParticleTypes.FLAME, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
        super.appendHoverText(pStack, pLevel, pTooltip, pFlag);

        pTooltip.add(TextComponentUtil.build(
            new TranslatableComponent(EnumLang.GENERATE.getTranslationKey()).withStyle(ChatFormatting.GRAY),
            new TranslatableComponent(EnumLang.POWER_TICK.getTranslationKey(), TextComponentUtil.getFormattedEnergyUnit(ServerConfig.generator_tick_generate.get())).withStyle(getEnergyTier().getColor())
        ));

        pTooltip.add(TextComponentUtil.build(
            new TranslatableComponent(EnumLang.OUTPUT.getTranslationKey()).withStyle(ChatFormatting.GRAY),
            new TranslatableComponent(EnumLang.POWER_TICK.getTranslationKey(), TextComponentUtil.getFormattedEnergyUnit(ServerConfig.basic_tier_transfer.get())).withStyle(getEnergyTier().getColor()),
            new TextComponent(" "),
            new TranslatableComponent(EnumLang.CAPACITY.getTranslationKey()).withStyle(ChatFormatting.GRAY),
            new TranslatableComponent(EnumLang.POWER.getTranslationKey(), TextComponentUtil.getFormattedEnergyUnit(ServerConfig.generator_energy_capacity.get())).withStyle(getEnergyTier().getColor())
        ));

    }
}
