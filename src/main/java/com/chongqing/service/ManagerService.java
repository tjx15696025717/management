package com.chongqing.service;

import com.chongqing.domain.House;
import com.chongqing.domain.Management;
import com.chongqing.domain.News;
import com.chongqing.domain.User;
import org.apache.catalina.Manager;

import java.util.List;
import java.util.Map;

/**
 * Created by 小谭 on 2021/2/19.
 */
public interface ManagerService {
    
    String insertManager(Management manager);

    String UpdateManager(Management manager);

    String deleteManager(Long managerId);

    List<Management> selectByMap(Map map);

    Integer insertNews(News news);

    Integer updateNews(News news);

    Integer deleteNews(Long newsId);

    List<News> selectByNewsMap(Map map);
}
