package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RecommendsRecommend;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Recommends
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class Recommends   {
  @JsonProperty("recommend")
  @Valid
  private List<RecommendsRecommend> recommend = null;

  public Recommends recommend(List<RecommendsRecommend> recommend) {
    this.recommend = recommend;
    return this;
  }

  public Recommends addRecommendItem(RecommendsRecommend recommendItem) {
    if (this.recommend == null) {
      this.recommend = new ArrayList<RecommendsRecommend>();
    }
    this.recommend.add(recommendItem);
    return this;
  }

  /**
   * Get recommend
   * @return recommend
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RecommendsRecommend> getRecommend() {
    return recommend;
  }

  public void setRecommend(List<RecommendsRecommend> recommend) {
    this.recommend = recommend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recommends recommends = (Recommends) o;
    return Objects.equals(this.recommend, recommends.recommend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recommends {\n");
    
    sb.append("    recommend: ").append(toIndentedString(recommend)).append("\n");
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

