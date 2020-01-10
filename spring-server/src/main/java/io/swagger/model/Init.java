package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MainTab;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Init
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class Init   {
  @JsonProperty("mainTabs")
  @Valid
  private List<MainTab> mainTabs = null;

  public Init mainTabs(List<MainTab> mainTabs) {
    this.mainTabs = mainTabs;
    return this;
  }

  public Init addMainTabsItem(MainTab mainTabsItem) {
    if (this.mainTabs == null) {
      this.mainTabs = new ArrayList<MainTab>();
    }
    this.mainTabs.add(mainTabsItem);
    return this;
  }

  /**
   * Get mainTabs
   * @return mainTabs
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MainTab> getMainTabs() {
    return mainTabs;
  }

  public void setMainTabs(List<MainTab> mainTabs) {
    this.mainTabs = mainTabs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Init init = (Init) o;
    return Objects.equals(this.mainTabs, init.mainTabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainTabs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Init {\n");
    
    sb.append("    mainTabs: ").append(toIndentedString(mainTabs)).append("\n");
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

