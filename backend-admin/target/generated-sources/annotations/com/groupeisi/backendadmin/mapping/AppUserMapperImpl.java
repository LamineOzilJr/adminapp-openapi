package com.groupeisi.backendadmin.mapping;

import com.groupeisi.backendadmin.entities.AppUserEntity;
import com.groupeisi.backendadmin.entities.AppUserEntity.AppUserEntityBuilder;
import com.groupeisi.generated.model.AppUserDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-04T14:53:06+0000",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.9 (Oracle Corporation)"
)
@Component
public class AppUserMapperImpl implements AppUserMapper {

    @Override
    public AppUserDTO toAppUserDTO(AppUserEntity appUserEntity) {
        if ( appUserEntity == null ) {
            return null;
        }

        AppUserDTO appUserDTO = new AppUserDTO();

        appUserDTO.setIdUser( appUserEntity.getIdUser() );
        appUserDTO.setNom( appUserEntity.getNom() );
        appUserDTO.setPrenom( appUserEntity.getPrenom() );
        appUserDTO.setEmail( appUserEntity.getEmail() );
        appUserDTO.setPassword( appUserEntity.getPassword() );
        appUserDTO.setEtat( appUserEntity.getEtat() );

        return appUserDTO;
    }

    @Override
    public AppUserEntity toAppUserEntity(AppUserDTO appUserDTO) {
        if ( appUserDTO == null ) {
            return null;
        }

        AppUserEntityBuilder appUserEntity = AppUserEntity.builder();

        if ( appUserDTO.getIdUser() != null ) {
            appUserEntity.idUser( appUserDTO.getIdUser() );
        }
        appUserEntity.nom( appUserDTO.getNom() );
        appUserEntity.prenom( appUserDTO.getPrenom() );
        appUserEntity.email( appUserDTO.getEmail() );
        appUserEntity.password( appUserDTO.getPassword() );
        if ( appUserDTO.getEtat() != null ) {
            appUserEntity.etat( appUserDTO.getEtat() );
        }

        return appUserEntity.build();
    }
}
