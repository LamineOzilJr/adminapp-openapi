package com.groupeisi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.groupeisi.generated.model.AppUserDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProduitDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-04T14:45:54.422661700Z[Atlantic/Reykjavik]")

public class ProduitDTO   {
  @JsonProperty("idProduit")
  private Integer idProduit;

  @JsonProperty("name")
  private String name;

  @JsonProperty("user")
  private AppUserDTO user;

  public ProduitDTO idProduit(Integer idProduit) {
    this.idProduit = idProduit;
    return this;
  }

  /**
   * Fonctionnel id of the classe
   * @return idProduit
  */
  @ApiModelProperty(value = "Fonctionnel id of the classe")


  public Integer getIdProduit() {
    return idProduit;
  }

  public void setIdProduit(Integer idProduit) {
    this.idProduit = idProduit;
  }

  public ProduitDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * the name of the classe
   * @return name
  */
  @ApiModelProperty(value = "the name of the classe")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProduitDTO user(AppUserDTO user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @ApiModelProperty(value = "")

  @Valid

  public AppUserDTO getUser() {
    return user;
  }

  public void setUser(AppUserDTO user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProduitDTO produitDTO = (ProduitDTO) o;
    return Objects.equals(this.idProduit, produitDTO.idProduit) &&
        Objects.equals(this.name, produitDTO.name) &&
        Objects.equals(this.user, produitDTO.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduit, name, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProduitDTO {\n");
    
    sb.append("    idProduit: ").append(toIndentedString(idProduit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

