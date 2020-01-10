package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HomeList;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Home
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class Home   {
  @JsonProperty("list")
  @Valid
  private List<HomeList> list = null;

  @JsonProperty("pcursor")
  private String pcursor = null;

  public Home list(List<HomeList> list) {
    this.list = list;
    return this;
  }

  public Home addListItem(HomeList listItem) {
    if (this.list == null) {
      this.list = new ArrayList<HomeList>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<HomeList> getList() {
    return list;
  }

  public void setList(List<HomeList> list) {
    this.list = list;
  }

  public Home pcursor(String pcursor) {
    this.pcursor = pcursor;
    return this;
  }

  /**
   * 数据标识
   * @return pcursor
  **/
  @ApiModelProperty(value = "数据标识")


  public String getPcursor() {
    return pcursor;
  }

  public void setPcursor(String pcursor) {
    this.pcursor = pcursor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Home home = (Home) o;
    return Objects.equals(this.list, home.list) &&
        Objects.equals(this.pcursor, home.pcursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, pcursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Home {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    pcursor: ").append(toIndentedString(pcursor)).append("\n");
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

