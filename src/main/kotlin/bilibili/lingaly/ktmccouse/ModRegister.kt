package bilibili.lingaly.ktmccouse

import bilibili.lingaly.ktmccouse.items.ModItems
import net.fabricmc.fabric.api.registry.FuelRegistry

object ModRegister {

    fun modRegister(){
        registerFuel()
    }

    private fun registerFuel() {
        val fuelRegistry = FuelRegistry.INSTANCE

        fuelRegistry.add(
            ModItems
                .PROBE,
            200
        )
    }

}