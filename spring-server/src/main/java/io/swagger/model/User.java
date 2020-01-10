package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 用户信息
 */
@ApiModel(description = "用户信息")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class User   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nickName")
  private String nickName = null;

  public User id(String id) {
    this.id = id;
    return this;
  }

  /**
   * 用户id
   * @return id
  **/
  @ApiModelProperty(value = "用户id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public User nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

  /**
   * 用户昵称
   * @return nickName
  **/
  @ApiModelProperty(value = "用户昵称")


  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.nickName, user.nickName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nickName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
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

