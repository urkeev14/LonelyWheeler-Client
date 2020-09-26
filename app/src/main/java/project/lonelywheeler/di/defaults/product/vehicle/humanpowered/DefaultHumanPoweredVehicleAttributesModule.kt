package project.lonelywheeler.di.defaults.product.vehicle.humanpowered

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import project.lonelywheeler.model.domain.product.humanvehicle.HumanPoweredVehicleType
import javax.inject.Qualifier


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultHumanPoweredVehicleType

@Module
@InstallIn(ActivityRetainedComponent::class)
class DefaultHumanPoweredVehicleAttributesModule {

    @DefaultHumanPoweredVehicleType
    @Provides
    fun provideHumanPoweredVehicleType(): HumanPoweredVehicleType {
        return HumanPoweredVehicleType.Other
    }


}