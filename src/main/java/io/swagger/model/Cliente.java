package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cliente
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-14T00:09:29.487Z")
@Entity
@Table(name="TB_PRODUTO")
public class Cliente   {
  @JsonProperty("cpf")
  @Id
  private Long cpf = null;

  @JsonProperty("titular")
  private String titular = null;

  @JsonProperty("endereço")
  private String endereo = null;

  public Cliente cpf(Long cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * Get cpf
   * @return cpf
  **/
  @ApiModelProperty(example = "234", value = "")


  public Long getCpf() {
    return cpf;
  }

  public void setCpf(Long cpf) {
    this.cpf = cpf;
  }

  public Cliente titular(String titular) {
    this.titular = titular;
    return this;
  }

  /**
   * Get titular
   * @return titular
  **/
  @ApiModelProperty(example = "Janete Silva", value = "")


  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public Cliente endereo(String endereo) {
    this.endereo = endereo;
    return this;
  }

  /**
   * Get endereo
   * @return endereo
  **/
  @ApiModelProperty(example = "Rua Genova", value = "")


  public String getEndereo() {
    return endereo;
  }

  public void setEndereo(String endereo) {
    this.endereo = endereo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cliente cliente = (Cliente) o;
    return Objects.equals(this.cpf, cliente.cpf) &&
        Objects.equals(this.titular, cliente.titular) &&
        Objects.equals(this.endereo, cliente.endereo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, titular, endereo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cliente {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    titular: ").append(toIndentedString(titular)).append("\n");
    sb.append("    endereo: ").append(toIndentedString(endereo)).append("\n");
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

