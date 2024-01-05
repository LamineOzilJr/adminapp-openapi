package com.groupeisi.generated.api;

import com.groupeisi.generated.model.ProduitDTO;
import com.groupeisi.generated.model.ProduitsResultListDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ProduitApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-04T14:45:54.422661700Z[Atlantic/Reykjavik]")

public interface ProduitApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /produits : Get All Products
     *
     * @param currentPage  (required)
     * @param sizePage  (required)
     * @return SUCCESS (status code 200)
     *         or NOT FOUND (status code 404)
     *         or BAD REQUEST (status code 400)
     * @see ProduitApi#getAllProducts
     */
    default ResponseEntity<ProduitsResultListDTO> getAllProducts(Integer currentPage,
        Integer sizePage) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"produitsList\" : [ { \"idProduit\" : 0, \"name\" : \"name\", \"user\" : { \"idUser\" : 6, \"produits\" : [ null, null ], \"password\" : \"password\", \"nom\" : \"nom\", \"prenom\" : \"prenom\", \"etat\" : 1, \"email\" : \"email\" } }, { \"idProduit\" : 0, \"name\" : \"name\", \"user\" : { \"idUser\" : 6, \"produits\" : [ null, null ], \"password\" : \"password\", \"nom\" : \"nom\", \"prenom\" : \"prenom\", \"etat\" : 1, \"email\" : \"email\" } } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /produits/{id} : Retrieve an product
     *
     * @param idProduit  (required)
     * @return SUCCESS (status code 200)
     *         or NOT FOUND (status code 404)
     *         or BAD REQUEST (status code 400)
     * @see ProduitApi#getProduit
     */
    default ResponseEntity<ProduitDTO> getProduit(Integer idProduit) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"idProduit\" : 0, \"name\" : \"name\", \"user\" : { \"idUser\" : 6, \"produits\" : [ null, null ], \"password\" : \"password\", \"nom\" : \"nom\", \"prenom\" : \"prenom\", \"etat\" : 1, \"email\" : \"email\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
