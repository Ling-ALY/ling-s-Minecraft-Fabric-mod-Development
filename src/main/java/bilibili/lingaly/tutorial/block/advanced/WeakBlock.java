package bilibili.lingaly.tutorial.block.advanced;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WeakBlock extends Block {

    public WeakBlock(Settings settings) {
        super(settings);
    }

    /*
    玩家站上去后持续获得持续1分钟的虚弱效果
     */
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient()){
            if (entity instanceof LivingEntity){
                LivingEntity livingEntity = ((LivingEntity) entity);
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 1200));
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
