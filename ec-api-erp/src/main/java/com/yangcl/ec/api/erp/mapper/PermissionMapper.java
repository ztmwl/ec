package com.yangcl.ec.api.erp.mapper;

import com.yangcl.ec.common.entity.erp.domain.Permission;

import java.util.List;

public interface PermissionMapper {
    public List<Permission> selectByRoleSysno(long sysno);
}
