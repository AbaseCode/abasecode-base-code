package com.abasecode.opencode.base.code.annotation;

import com.abasecode.opencode.base.code.config.CodeExceptionAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Jon
 * e-mail: ijonso123@gmail.com
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://github.com/abasecode">project github</a>
 * url: <a href="https://abasecode.com">AbaseCode.com</a>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(CodeExceptionAutoConfiguration.class)
@Documented
@Inherited
public @interface EnableCodeException {
}