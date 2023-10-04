package com.platform.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class PageableRequest {
    private int page = 1;
    private int size = 20;
    private String search;
    private List<OrderBy> orderBys;
    private Filter filter;
}
