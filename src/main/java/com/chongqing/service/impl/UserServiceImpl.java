package com.chongqing.service.impl;

import com.chongqing.dao.PhysicalExaminationMapper;
import com.chongqing.dao.RecordMapper;
import com.chongqing.dao.UserMapper;
import com.chongqing.domain.PhysicalExamination;
import com.chongqing.domain.Record;
import com.chongqing.domain.User;
import com.chongqing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 小谭 on 2021/2/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RecordMapper recordMapper;

    @Autowired
    private PhysicalExaminationMapper physicalExaminationMapper;

    /***
     * 更新user 信息
     * @param user
     * @return
     */
    @Override
    public String UpdateUser(User user) {
        int res = this.userMapper.updateByPrimaryKeySelective(user);
        if (res >=0){
            return "更新成功";
        }
        return "更新失败";
    }

    @Override
    public String deleteUser(Long userId) {
        int res = this.userMapper.deleteByPrimaryKey(userId);
        if (res >=0){
            return "注销成功";
        }
        return "注销失败";
    }

    @Override
    public List<User> selectByMap(Map map) {
        return this.userMapper.selectSelective(map);
    }

    @Override
    public List<Record> selectRecordMap(Map map) {
        return this.recordMapper.selectSelective(map);
    }

    @Override
    public int UpdateRecord(Record record) {
        return this.recordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public String insertRecod(Record record) {
        int index = this.recordMapper.insert(record);
        if (index>0){
            return "插入成功";
        }
        return "插入失败";
    }

    @Override
    public List<PhysicalExamination> selectPhysicalMap(Map map) {
        return this.physicalExaminationMapper.selectByMap(map);
    }

    @Override
    public int UpdatePhysical(PhysicalExamination physicalExamination) {
        return this.physicalExaminationMapper.updateByPrimaryKeySelective(physicalExamination);
    }

    @Override
    public int insertPhysical(PhysicalExamination physicalExamination) {
        return this.physicalExaminationMapper.insert(physicalExamination);
    }

    @Override
    public int deletePhysical(Long id) {
        return this.physicalExaminationMapper.deleteByPrimaryKey(id);
    }
}
