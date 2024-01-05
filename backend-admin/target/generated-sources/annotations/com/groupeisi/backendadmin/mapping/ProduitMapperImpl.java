package com.groupeisi.backendadmin.mapping;

import com.groupeisi.backendadmin.entities.ProduitEntity;
import com.groupeisi.backendadmin.entities.ProduitEntity.ProduitEntityBuilder;
import com.groupeisi.generated.model.ProduitDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-04T14:53:06+0000",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.9 (Oracle Corporation)"
)
@Component
public class ProduitMapperImpl implements ProduitMapper {

    @Override
    public ProduitDTO toProduitDTO(ProduitEntity produitEntity) {
        if ( produitEntity == null ) {
            return null;
        }

        ProduitDTO produitDTO = new ProduitDTO();

        produitDTO.setIdProduit( produitEntity.getIdProduit() );
        produitDTO.setName( produitEntity.getName() );

        return produitDTO;
    }

    @Override
    public ProduitEntity toProduitEntity(ProduitDTO produitDTO) {
        if ( produitDTO == null ) {
            return null;
        }

        ProduitEntityBuilder produitEntity = ProduitEntity.builder();

        if ( produitDTO.getIdProduit() != null ) {
            produitEntity.idProduit( produitDTO.getIdProduit() );
        }
        produitEntity.name( produitDTO.getName() );

        return produitEntity.build();
    }
}
