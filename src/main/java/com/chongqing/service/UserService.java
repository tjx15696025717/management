package com.chongqing.service;

import com.chongqing.domain.PhysicalExamination;
import com.chongqing.domain.Record;
import com.chongqing.domain.User;
import org.apache.catalina.Manager;

import java.util.List;
import java.util.Map;

/**
 * Created by 小谭 on 2021/2/19.
 */
public interface UserService {

    String UpdateUser(User user);

    String deleteUser(Long userId);

    List<User> selectByMap(Map map);

    List<Record> selectRecordMap(Map map);

    int UpdateRecord(Record record);

    String insertRecod(Record record);

    List<PhysicalExamination> selectPhysicalMap(Map map);

    int UpdatePhysical(PhysicalExamination physicalExamination);

    int insertPhysical(PhysicalExamination physicalExamination);

    int deletePhysical(Long id);
}
