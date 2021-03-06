package com.github.leleact.jtest.spring.cloud.feign.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * common page query.
 *
 * @author leleact
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class QueryRequest extends BaseRequest {

    private Integer page;

    private Integer rows;

    private String orderBy;
}
