package io.swagger.api;

import io.swagger.model.JsonApiBody;
import io.swagger.model.VerifyAccountError;
import io.swagger.model.VerifyAccountResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-09T15:21:16.839Z")

@Controller
public class VerifyAccountOwnerApiController implements VerifyAccountOwnerApi {

    private static final Logger log = LoggerFactory.getLogger(VerifyAccountOwnerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public VerifyAccountOwnerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<VerifyAccountResponse> verifyAccountOwner(@ApiParam(value = "" ,required=true )  @Valid @RequestBody JsonApiBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VerifyAccountResponse>(objectMapper.readValue("{  \"header\" : {    \"id\" : \"id\",    \"type\" : \"type\"  },  \"messageId\" : \"messageId\",  \"ownerAccountName\" : \"ownerAccountName\",  \"transactionDate\" : \"transactionDate\"}", VerifyAccountResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VerifyAccountResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VerifyAccountResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
