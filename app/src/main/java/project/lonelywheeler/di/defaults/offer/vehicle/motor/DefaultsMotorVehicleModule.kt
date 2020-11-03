package project.lonelywheeler.di.defaults.offer.vehicle.motor

import android.graphics.Bitmap
import androidx.databinding.ObservableField
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import project.lonelywheeler.model.domain.offer.Condition
import project.lonelywheeler.model.domain.offer.vehicle.motor.*
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultProductCondition

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultCarBodyType

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultCarFuelType

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultCarEmissionStandard

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultCarGearboxType

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultCarSteeringWheelSide

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultCarDrivetrain

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultPictureList

@Module
@InstallIn(ActivityRetainedComponent::class)
class DefaultCarAttributesModule {

    @DefaultProductCondition
    @Provides
    fun provideDefaultProductCondition(): ObservableField<Condition> {
        return ObservableField(Condition.Used)
    }

    @DefaultPictureList
    @Provides
    fun provideDefaultListOfCarPictures(): MutableList<Bitmap> {
        return mutableListOf()
    }

    @DefaultCarBodyType
    @Provides
    fun provideDefaultCarBodyType(): ObservableField<CarBodyType> {
        return ObservableField(CarBodyType.Coupe)
    }

    @DefaultCarFuelType
    @Provides
    fun provideDefaultCarFuelType(): ObservableField<FuelType> {
        return ObservableField(FuelType.Diesel)
    }

    @DefaultCarEmissionStandard
    @Provides
    fun provideDefaultCarEmissionStandard(): ObservableField<EmissionStandard> {
        return ObservableField(EmissionStandard.Euro3)
    }

    @DefaultCarGearboxType
    @Provides
    fun provideDefaultCarGearboxType(): ObservableField<GearboxType> {
        return ObservableField(GearboxType.Manual)
    }

    @DefaultCarSteeringWheelSide
    @Provides
    fun provideDefaultCarSteeringWheelSide(): ObservableField<SteeringWheelSide> {
        return ObservableField(SteeringWheelSide.Left)
    }

    @DefaultCarDrivetrain
    @Provides
    fun provideDefaultCarDrivetrain(): ObservableField<Drivetrain> {
        return ObservableField(Drivetrain.RWD)
    }
}