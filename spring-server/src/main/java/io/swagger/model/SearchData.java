package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SearchTabs;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class SearchData   {
  @JsonProperty("tabs")
  @Valid
  private List<SearchTabs> tabs = null;

  @JsonProperty("list")
  @Valid
  private List<Object> list = null;

  public SearchData tabs(List<SearchTabs> tabs) {
    this.tabs = tabs;
    return this;
  }

  public SearchData addTabsItem(SearchTabs tabsItem) {
    if (this.tabs == null) {
      this.tabs = new ArrayList<SearchTabs>();
    }
    this.tabs.add(tabsItem);
    return this;
  }

  /**
   * 无请求参数type时，需返回该字段
   * @return tabs
  **/
  @ApiModelProperty(value = "无请求参数type时，需返回该字段")

  @Valid

  public List<SearchTabs> getTabs() {
    return tabs;
  }

  public void setTabs(List<SearchTabs> tabs) {
    this.tabs = tabs;
  }

  public SearchData list(List<Object> list) {
    this.list = list;
    return this;
  }

  public SearchData addListItem(Object listItem) {
    if (this.list == null) {
      this.list = new ArrayList<Object>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")


  public List<Object> getList() {
    return list;
  }

  public void setList(List<Object> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchData searchData = (SearchData) o;
    return Objects.equals(this.tabs, searchData.tabs) &&
        Objects.equals(this.list, searchData.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tabs, list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchData {\n");
    
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

