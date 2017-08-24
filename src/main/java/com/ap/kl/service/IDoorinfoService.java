package com.ap.kl.service;

import java.util.List;

import com.ap.kl.entity.Deviceinfo;
import com.ap.kl.entity.Doorinfo;
import com.baomidou.framework.service.ISuperService;

/**
 *
 * Doorinfo 表数据服务层接口
 *
 */
public interface IDoorinfoService {

  List<Doorinfo> selectAllDoorInfo(int pageSize,int startIndex);
  
  int selectAllDoorCount();
}