package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysLate;

/**
 * 夜归管理Mapper接口
 * 
 * @author ruoyi
 * @date 2022-07-14
 */
public interface SysLateMapper 
{
    /**
     * 查询夜归管理
     * 
     * @param lateId 夜归管理主键
     * @return 夜归管理
     */
    public SysLate selectSysLateByLateId(Long lateId);

    /**
     * 查询夜归管理列表
     * 
     * @param sysLate 夜归管理
     * @return 夜归管理集合
     */
    public List<SysLate> selectSysLateList(SysLate sysLate);

    /**
     * 新增夜归管理
     * 
     * @param sysLate 夜归管理
     * @return 结果
     */
    public int insertSysLate(SysLate sysLate);

    /**
     * 修改夜归管理
     * 
     * @param sysLate 夜归管理
     * @return 结果
     */
    public int updateSysLate(SysLate sysLate);

    /**
     * 删除夜归管理
     * 
     * @param lateId 夜归管理主键
     * @return 结果
     */
    public int deleteSysLateByLateId(Long lateId);

    /**
     * 批量删除夜归管理
     * 
     * @param lateIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysLateByLateIds(Long[] lateIds);
}
