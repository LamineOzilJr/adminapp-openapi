package com.groupeisi.generated.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-04T14:45:54.422661700Z[Atlantic/Reykjavik]")

@Controller
@RequestMapping("${openapi.aPIDeGestionDesUtilisateursRolesEtProduits.base-path:/backend-admin/api}")
public class ProduitApiController implements ProduitApi {

    private final ProduitApiDelegate delegate;

    public ProduitApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ProduitApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ProduitApiDelegate() {});
    }

    @Override
    public ProduitApiDelegate getDelegate() {
        return delegate;
    }

}
