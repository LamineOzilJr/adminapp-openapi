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
 * AppUserDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-04T14:45:54.422661700Z[Atlantic/Reykjavik]")

public class AppUserDTO   {
  @JsonProperty("idUser")
  private Integer idUser;

  @JsonProperty("nom")
  private String nom;

  @JsonProperty("prenom")
  private String prenom;

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

  @JsonProperty("etat")
  private Integer etat;

  @JsonProperty("produits")
  @Valid
  private List<ProduitDTO> produits = null;

  public AppUserDTO idUser(Integer idUser) {
    this.idUser = idUser;
    return this;
  }

  /**
   * Fonctionnel id of the classe
   * @return idUser
  */
  @ApiModelProperty(value = "Fonctionnel id of the classe")


  public Integer getIdUser() {
    return idUser;
  }

  public void setIdUser(Integer idUser) {
    this.idUser = idUser;
  }

  public AppUserDTO nom(String nom) {
    this.nom = nom;
    return this;
  }

  /**
   * the name of the user
   * @return nom
  */
  @ApiModelProperty(value = "the name of the user")


  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public AppUserDTO prenom(String prenom) {
    this.prenom = prenom;
    return this;
  }

  /**
   * the firstName of the user
   * @return prenom
  */
  @ApiModelProperty(value = "the firstName of the user")


  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public AppUserDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * the email of the user
   * @return email
  */
  @ApiModelProperty(value = "the email of the user")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AppUserDTO password(String password) {
    this.password = password;
    return this;
  }

  /**
   * the password of the user
   * @return password
  */
  @ApiModelProperty(value = "the password of the user")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public AppUserDTO etat(Integer etat) {
    this.etat = etat;
    return this;
  }

  /**
   * the state of the user
   * @return etat
  */
  @ApiModelProperty(value = "the state of the user")


  public Integer getEtat() {
    return etat;
  }

  public void setEtat(Integer etat) {
    this.etat = etat;
  }

  public AppUserDTO produits(List<ProduitDTO> produits) {
    this.produits = produits;
    return this;
  }

  public AppUserDTO addProduitsItem(ProduitDTO produitsItem) {
    if (this.produits == null) {
      this.produits = new ArrayList<>();
    }
    this.produits.add(produitsItem);
    return this;
  }

  /**
   * Get produits
   * @return produits
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ProduitDTO> getProduits() {
    return produits;
  }

  public void setProduits(List<ProduitDTO> produits) {
    this.produits = produits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUserDTO appUserDTO = (AppUserDTO) o;
    return Objects.equals(this.idUser, appUserDTO.idUser) &&
        Objects.equals(this.nom, appUserDTO.nom) &&
        Objects.equals(this.prenom, appUserDTO.prenom) &&
        Objects.equals(this.email, appUserDTO.email) &&
        Objects.equals(this.password, appUserDTO.password) &&
        Objects.equals(this.etat, appUserDTO.etat) &&
        Objects.equals(this.produits, appUserDTO.produits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUser, nom, prenom, email, password, etat, produits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUserDTO {\n");
    
    sb.append("    idUser: ").append(toIndentedString(idUser)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    prenom: ").append(toIndentedString(prenom)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    etat: ").append(toIndentedString(etat)).append("\n");
    sb.append("    produits: ").append(toIndentedString(produits)).append("\n");
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

