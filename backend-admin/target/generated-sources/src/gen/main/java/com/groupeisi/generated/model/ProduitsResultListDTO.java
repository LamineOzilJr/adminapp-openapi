package com.groupeisi.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.groupeisi.generated.model.ProduitDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProduitsResultListDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-04T14:45:54.422661700Z[Atlantic/Reykjavik]")

public class ProduitsResultListDTO   {
  @JsonProperty("produitsList")
  @Valid
  private List<ProduitDTO> produitsList = null;

  public ProduitsResultListDTO produitsList(List<ProduitDTO> produitsList) {
    this.produitsList = produitsList;
    return this;
  }

  public ProduitsResultListDTO addProduitsListItem(ProduitDTO produitsListItem) {
    if (this.produitsList == null) {
      this.produitsList = new ArrayList<>();
    }
    this.produitsList.add(produitsListItem);
    return this;
  }

  /**
   * The List of the Products
   * @return produitsList
  */
  @ApiModelProperty(value = "The List of the Products")

  @Valid

  public List<ProduitDTO> getProduitsList() {
    return produitsList;
  }

  public void setProduitsList(List<ProduitDTO> produitsList) {
    this.produitsList = produitsList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProduitsResultListDTO produitsResultListDTO = (ProduitsResultListDTO) o;
    return Objects.equals(this.produitsList, produitsResultListDTO.produitsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(produitsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProduitsResultListDTO {\n");
    
    sb.append("    produitsList: ").append(toIndentedString(produitsList)).append("\n");
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

