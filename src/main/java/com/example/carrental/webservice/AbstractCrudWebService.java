package com.example.carrental.webservice;

import com.example.carrental.service.AbstractCrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import java.util.List;

@RequiredArgsConstructor
public abstract class AbstractCrudWebService<T, DTO, ID> {
    protected abstract AbstractCrudService<T, DTO, ID> getService();

    public DTO findById(ID id) {
        return getService().findById(id);
    }

    public List<DTO> findAll() {
        return getService().findAll();
    }

    public DTO create(DTO dto) {
        return getService().create(dto);
    }

    public DTO update(ID id, DTO dto) {
        return getService().update(id, dto);
    }

    public void deleteById(ID id) {
        getService().deleteById(id);
    }
}
