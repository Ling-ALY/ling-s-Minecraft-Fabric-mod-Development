package bilibili.lingaly.tutorial.block.advanced;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class WeakBlock extends Block {

    public WeakBlock(FabricBlockSettings settings) {
        super(settings);
    }

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        if (level.isClientSide()){
            if (interactionHand == InteractionHand.MAIN_HAND){
                player.sendMessage(new TextComponent("Client, mainhand"), player.getUUID());
            } else {
                player.sendMessage(new TextComponent("Client, offhand"), player.getUUID());
            }
        } else {
            if (interactionHand == InteractionHand.MAIN_HAND){
                player.sendMessage(new TextComponent("Server, mainhand"), player.getUUID());
            }
            if (interactionHand == InteractionHand.OFF_HAND){
                player.sendMessage(new TextComponent("Server, offhand"), player.getUUID());
            }
        }

        return InteractionResult.SUCCESS;
    }

    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        if (!level.isClientSide()){
            if (entity instanceof LivingEntity){
                LivingEntity livingEntity = ((LivingEntity) entity);
                livingEntity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1200));
            }
        }

        super.stepOn(level, blockPos, blockState, entity);
    }
}
