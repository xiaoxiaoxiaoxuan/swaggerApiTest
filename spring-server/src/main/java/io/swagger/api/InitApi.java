/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.11).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.math.BigDecimal;
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

@Api(value = "init", description = "the init API")
@RequestMapping(value = "/api")
public interface InitApi {

    @ApiOperation(value = "初始化，mainTab 第一期本地写死，后期会通过后台配置", nickname = "initGet", notes = "", response = InlineResponse200.class, tags={ "init", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class) })
    @RequestMapping(value = "/init",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse200> initGet() {
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
            log.warn("ObjectMapper or HttpServletRequest not configured in default InitApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "开屏广告图", nickname = "initLaunchAdGet", notes = "", response = InlineResponse200.class, tags={ "init", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class) })
    @RequestMapping(value = "/init/launchAd",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse200> initLaunchAdGet(@NotNull @ApiParam(value = "屏幕宽度", required = true) @Valid @RequestParam(value = "width", required = true) BigDecimal width,@NotNull @ApiParam(value = "屏幕高度", required = true) @Valid @RequestParam(value = "height", required = true) BigDecimal height) {
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
            log.warn("ObjectMapper or HttpServletRequest not configured in default InitApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "版本更新", nickname = "initUpdateGet", notes = "", response = InlineResponse200.class, tags={ "init", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class) })
    @RequestMapping(value = "/init/update",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse200> initUpdateGet() {
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
            log.warn("ObjectMapper or HttpServletRequest not configured in default InitApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
