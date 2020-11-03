package project.lonelywheeler.di.defaults.offer.equipment

import androidx.databinding.ObservableField
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import project.lonelywheeler.model.domain.offer.equipment.EquipmentType
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultEquipmentType

@Module
@InstallIn(ActivityRetainedComponent::class)
class DefaultEquipmentAttributesModule {

    @DefaultEquipmentType
    @Provides
    fun provideDefaultEquipmentType(): ObservableField<EquipmentType> {
        return ObservableField(EquipmentType.Other)
    }

}