package bilibili.lingaly.ktmccouse

import bilibili.lingaly.easyfabricregisterlib.EFRLModRegister
import bilibili.lingaly.ktmccouse.items.ModItems

object ModRegister {

    fun modRegister(){
        registerFuel()
    }

    private fun registerFuel() {
        EFRLModRegister.registerFuel(
            ModItems
                .PROBE,
            200
        )
    }

}