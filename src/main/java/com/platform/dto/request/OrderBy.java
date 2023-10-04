package com.platform.dto.request;


import com.platform.dto.enums.Sort;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderBy {
    private String field;
    private Sort sort = Sort.ASC;

    // Build OrderBy
    public org.springframework.data.domain.Sort getOrderBy(){
        return null;
    }
}
