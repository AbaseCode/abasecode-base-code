package com.abasecode.opencode.base.code;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.apache.http.HttpStatus;

/**
 * @author Jon
 * e-mail: ijonso123@gmail.com
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://github.com/abasecode">project github</a>
 * url: <a href="https://abasecode.com">AbaseCode.com</a>
 */
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CodeException extends RuntimeException {
    private static final long serialVersionUID = 4056355647005042739L;
    private String message;
    private String errorInfo;
    private String status;
    private Integer code = HttpStatus.SC_INTERNAL_SERVER_ERROR;

    /**
     * CodeException with message
     *
     * @param message message
     */
    public CodeException(String message) {
        super(message);
        this.message = message;
        this.errorInfo = null;
    }

    /**
     * CodeException with message, errorInfo
     *
     * @param message   message
     * @param errorInfo errorInfo
     */
    public CodeException(String message, String errorInfo) {
        super(message);
        this.message = message;
        this.errorInfo = errorInfo;
    }

    /**
     * CodeException with message, throwable
     *
     * @param message message
     * @param e       throwable
     */
    public CodeException(String message, Throwable e) {
        super(message, e);
        this.message = message;
        this.errorInfo = null;
    }

    /**
     * CodeException with message, code
     *
     * @param message message
     * @param code    error code
     */
    public CodeException(String message, int code) {
        super(message);
        this.message = message;
        this.errorInfo = null;
        this.code = code;
    }

    /**
     * CodeException with message, errorInfo, code
     *
     * @param message   message
     * @param errorInfo error info
     * @param code      error code
     */
    public CodeException(String message, String errorInfo, int code) {
        super(message);
        this.message = message;
        this.errorInfo = errorInfo;
        this.code = code;
    }

    /**
     * CodeException with message, code, throwable
     *
     * @param message message
     * @param code    error code
     * @param e       throwable
     */
    public CodeException(String message, int code, Throwable e) {
        super(message, e);
        this.message = message;
        this.errorInfo = null;
        this.code = code;
    }

    /**
     * CodeException with message, errorInfo, code, throwable
     *
     * @param message   message
     * @param errorInfo error info
     * @param code      code
     * @param e         throwable
     */
    public CodeException(String message, String errorInfo, int code, Throwable e) {
        super(message, e);
        this.message = message;
        this.errorInfo = errorInfo;
        this.code = code;
    }

}