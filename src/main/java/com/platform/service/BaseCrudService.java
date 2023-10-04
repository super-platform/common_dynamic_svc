package com.platform.service;


import com.platform.dto.BaseDTO;
import com.platform.dto.request.PageableRequest;
import com.platform.dto.response.PageResponse;
import com.platform.entities.BaseEntity;

public interface BaseCrudService<T extends BaseEntity, DTO extends BaseDTO, C> {

    DTO findById(Long id);
    DTO save(C createDTO);
    PageResponse<DTO> paginate(PageableRequest pageableRequest);
}
