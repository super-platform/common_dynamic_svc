package com.platform.service;


import com.platform.common.dto.request.PageableRequest;
import com.platform.common.dto.response.PageResponse;
import com.platform.entities.BaseEntity;

public interface BaseCrudService<T extends BaseEntity, DTO , C> {

    DTO findById(Long id);
    DTO save(C createDTO);
    PageResponse<DTO> paginate(PageableRequest pageableRequest);
}
