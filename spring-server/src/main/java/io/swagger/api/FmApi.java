/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.11).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-09T13:04:02.667Z")

@Api(value = "fm", description = "the fm API")
@RequestMapping(value = "/api")
public interface FmApi {

    @ApiOperation(value = "评论", nickname = "fmCommentVideoIdGet", notes = "", response = InlineResponse200.class, tags={ "fm", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class) })
    @RequestMapping(value = "/fm/comment/{videoId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse200> fmCommentVideoIdGet(@NotNull @ApiParam(value = "3：短音频 4：长音频", required = true) @Valid @RequestParam(value = "type", required = true) Integer type,@ApiParam(value = "视频id",required=true) @PathVariable("videoId") String videoId,@ApiParam(value = "页码") @Valid @RequestParam(value = "page", required = false) String page) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"Common\" : {    \"code\" : 0,    \"message\" : \"message\"  }}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default FmApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "搜索", nickname = "fmFeedGet", notes = "", response = InlineResponse200.class, tags={ "fm", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class) })
    @RequestMapping(value = "/fm/feed",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse200> fmFeedGet(@NotNull @ApiParam(value = "类型 0：推荐 1：情感 2：社会", required = true) @Valid @RequestParam(value = "type", required = true) Integer type,@ApiParam(value = "数据位置标识，首次请求不需要该参数，值为上次返回字段 pcursor 的值") @Valid @RequestParam(value = "pcursor", required = false) String pcursor) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"Common\" : {    \"code\" : 0,    \"message\" : \"message\"  }}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default FmApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "音频垂类", nickname = "fmTabsGet", notes = "", response = InlineResponse200.class, tags={ "fm", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class) })
    @RequestMapping(value = "/fm/tabs",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse200> fmTabsGet() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"Common\" : {    \"code\" : 0,    \"message\" : \"message\"  }}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default FmApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
