package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.User;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommentReplyList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

public class CommentReplyList   {
  @JsonProperty("user")
  private User user = null;

  @JsonProperty("replyUser")
  private User replyUser = null;

  @JsonProperty("repayContent")
  private String repayContent = null;

  public CommentReplyList user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")

  @Valid

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public CommentReplyList replyUser(User replyUser) {
    this.replyUser = replyUser;
    return this;
  }

  /**
   * Get replyUser
   * @return replyUser
  **/
  @ApiModelProperty(value = "")

  @Valid

  public User getReplyUser() {
    return replyUser;
  }

  public void setReplyUser(User replyUser) {
    this.replyUser = replyUser;
  }

  public CommentReplyList repayContent(String repayContent) {
    this.repayContent = repayContent;
    return this;
  }

  /**
   * 
   * @return repayContent
  **/
  @ApiModelProperty(value = "")


  public String getRepayContent() {
    return repayContent;
  }

  public void setRepayContent(String repayContent) {
    this.repayContent = repayContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentReplyList commentReplyList = (CommentReplyList) o;
    return Objects.equals(this.user, commentReplyList.user) &&
        Objects.equals(this.replyUser, commentReplyList.replyUser) &&
        Objects.equals(this.repayContent, commentReplyList.repayContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, replyUser, repayContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentReplyList {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    replyUser: ").append(toIndentedString(replyUser)).append("\n");
    sb.append("    repayContent: ").append(toIndentedString(repayContent)).append("\n");
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

