package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.SpuInfoDao;
import com.example.entity.SpuInfoEntity;
import com.example.service.SpuInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service("spuInfoService")
@Slf4j
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfoEntity> implements SpuInfoService {


}