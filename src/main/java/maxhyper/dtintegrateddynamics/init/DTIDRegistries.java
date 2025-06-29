package maxhyper.dtintegrateddynamics.init;

import com.ferreusveritas.dynamictrees.api.cell.CellKit;
import com.ferreusveritas.dynamictrees.api.registry.RegistryEvent;
import com.ferreusveritas.dynamictrees.api.registry.TypeRegistryEvent;
import com.ferreusveritas.dynamictrees.block.rooty.SoilProperties;
import com.ferreusveritas.dynamictrees.tree.family.Family;
import maxhyper.dtintegrateddynamics.DynamicTreesIntegratedDynamics;
import maxhyper.dtintegrateddynamics.cellkits.DTIDCellKits;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, modid = DynamicTreesIntegratedDynamics.MOD_ID)
public class DTIDRegistries {

    public static void setup(IEventBus modBus) {

    }

    public static void setupConnectables (){

    }

    @SubscribeEvent
    public static void onCellKitRegistry(RegistryEvent<CellKit> event) {
        DTIDCellKits.register(event.getRegistry());
    }


    @SubscribeEvent
    public static void registerFamilyTypes (final TypeRegistryEvent<Family> event) {
//        event.registerType(DynamicTreesTinkersConstruct.location("slime_mangrove"), SlimeMangroveFamily.TYPE);
    }

    @SubscribeEvent
    public static void registerSoilPropertiesTypes (final TypeRegistryEvent<SoilProperties> event) {

    }

}
