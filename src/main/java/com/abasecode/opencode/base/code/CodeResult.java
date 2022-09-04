package com.abasecode.opencode.base.code;

import com.abasecode.opencode.base.code.enums.ResultMessageEnum;
import com.abasecode.opencode.base.code.enums.ResultStatusEnum;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.http.HttpStatus;

import java.io.Serializable;

/**
 * @author Jon
 * e-mail: ijonso123@gmail.com
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://github.com/abasecode">project github</a>
 * url: <a href="https://abasecode.com">AbaseCode.com</a>
 */
@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CodeResult<T> implements Serializable {
    private static final long serialVersionUID = 6374486752803150412L;
    private T data;
    private Integer code;
    private String message;
    private String errorInfo;
    private ResultStatusEnum status;
    private Long total;
    private Long page;
    private Long pageSize;

    public CodeResult() {
        this.code = 0;
        this.message = ResultMessageEnum.SYSTEM_OK.getValue();
        this.errorInfo = null;
        this.status = ResultStatusEnum.SUCCESS;
        this.total = null;
        this.page = null;
        this.pageSize = null;
    }

    private CodeResult(Integer code, String message, ResultStatusEnum status) {
        this.code = code;
        this.message = message;
        this.errorInfo = null;
        this.status = status;
        this.total = null;
        this.page = null;
        this.pageSize = null;
    }

    private CodeResult(Integer code, String message, String errorInfo, ResultStatusEnum status) {
        this.code = code;
        this.message = message;
        this.errorInfo = errorInfo;
        this.status = status;
        this.total = null;
        this.page = null;
        this.pageSize = null;
    }

    private CodeResult(Integer code, String message, ResultStatusEnum status, T data) {
        this.code = code;
        this.message = message;
        this.errorInfo = null;
        this.status = status;
        this.data = data;
        this.total = null;
        this.page = null;
        this.pageSize = null;
    }

    private CodeResult(Integer code, String message, String errorInfo, ResultStatusEnum status, T data) {
        this.code = code;
        this.message = message;
        this.errorInfo = errorInfo;
        this.status = status;
        this.data = data;
        this.total = null;
        this.page = null;
        this.pageSize = null;
    }

    private CodeResult(Integer code, String message, ResultStatusEnum status, T data, long total, long page, long pageSize) {
        this.code = code;
        this.message = message;
        this.status = status;
        this.data = data;
        this.total = total;
        this.page = page;
        this.pageSize = pageSize;
    }

    /**
     * Get CodeResult while error
     *
     * @param <T> the type of target
     * @return CodeResult
     */
    public static <T> CodeResult<T> error() {
        return new CodeResult(HttpStatus.SC_INTERNAL_SERVER_ERROR, ResultMessageEnum.SYSTEM_ERROR.getValue(), ResultStatusEnum.FAIL);
    }

    /**
     * Get CodeResult while error
     *
     * @param message error message
     * @param <T>     the type of target
     * @return CodeResult
     */
    public static <T> CodeResult<T> error(String message) {
        return new CodeResult(HttpStatus.SC_INTERNAL_SERVER_ERROR, message, ResultStatusEnum.FAIL);
    }

    /**
     * Get CodeResult while error
     *
     * @param message   message error message
     * @param errorInfo error info
     * @param <T>       the type of target
     * @return CodeResult
     */
    public static <T> CodeResult<T> error(String message, String errorInfo) {
        return new CodeResult(HttpStatus.SC_INTERNAL_SERVER_ERROR, message, errorInfo, ResultStatusEnum.FAIL);
    }

    /**
     * Get CodeResult while error
     *
     * @param code    error code
     * @param message error message
     * @param <T>     the type of target
     * @return CodeResult
     */
    public static <T> CodeResult<T> error(int code, String message) {
        return new CodeResult(code, message, ResultStatusEnum.FAIL);
    }

    /**
     * Get CodeResult while error
     *
     * @param code      error code
     * @param message   error message
     * @param errorInfo error info
     * @param <T>       the type of target
     * @return CodeResult
     */
    public static <T> CodeResult<T> error(int code, String message, String errorInfo) {
        return new CodeResult(code, message, errorInfo, ResultStatusEnum.FAIL);
    }

    /**
     * Get CodeResult just ok
     *
     * @param <T> the type of target
     * @return CodeResult
     */
    public static <T> CodeResult<T> ok() {
        return new CodeResult();
    }

    /**
     * Get CodeResult only one param message
     *
     * @param message message
     * @param <T>     the type of target
     * @return CodeResult
     */
    public static <T> CodeResult<T> ok(String message) {
        return new CodeResult(0, message, ResultStatusEnum.SUCCESS);
    }

    /**
     * Get CodeResult for message and data
     *
     * @param message message
     * @param data    data body
     * @param <T>     the type of target
     * @return CodeResult
     */
    public static <T> CodeResult<T> ok(String message, T data) {
        return new CodeResult(0, message, ResultStatusEnum.SUCCESS, data);
    }

    /**
     * Get CodeResult for message and data with page info
     *
     * @param message  message
     * @param data     data
     * @param total    total num
     * @param page     page num
     * @param pageSize pagesize
     * @param <T>      data
     * @return CodeResult
     */
    public static <T> CodeResult<T> ok(String message, T data, long total, long page, long pageSize) {
        return new CodeResult(0, message, ResultStatusEnum.SUCCESS, data, total, page, pageSize);
    }

    /**
     * Get CodeResult only one param with data body
     *
     * @param data data body
     * @param <T>  the type of target
     * @return CodeResult
     */
    public static <T> CodeResult<T> okx(T data) {
        return new CodeResult(0, ResultMessageEnum.SYSTEM_SUCCESS.getValue(), ResultStatusEnum.SUCCESS, data);
    }

    /**
     * Get CodeResult with data body and code
     *
     * @param data body
     * @param code code
     * @param <T>  the type of target
     * @return CodeResult
     */
    public static <T> CodeResult<T> okx(T data, int code) {
        return new CodeResult(code, ResultMessageEnum.SYSTEM_SUCCESS.getValue(), ResultStatusEnum.SUCCESS, data);
    }

    /**
     * Get CodeResult with data body and message
     *
     * @param data    body
     * @param message message
     * @param <T>     the type of target
     * @return CodeResult
     */
    public static <T> CodeResult<T> okx(T data, String message) {
        return new CodeResult(0, message, ResultStatusEnum.SUCCESS, data);
    }

    /**
     * Get CodeResult with data body, code, message
     *
     * @param data    body
     * @param code    code
     * @param message message
     * @param <T>     the type of target
     * @return CodeResult
     */
    public static <T> CodeResult<T> okx(T data, int code, String message) {
        return new CodeResult(code, message, ResultStatusEnum.SUCCESS, data);
    }

}