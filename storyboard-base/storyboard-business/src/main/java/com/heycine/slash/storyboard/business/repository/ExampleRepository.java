package com.heycine.slash.storyboard.business.repository;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.heycine.slash.storyboard.business.entity.ExampleEntity;
import com.heycine.slash.storyboard.business.mapper.ExampleMapper;
import org.springframework.stereotype.Service;

/**
 * 任务表
 *
 * @author zhiji.zhou
 * @date 2022/1/11
 */
@Service
public class ExampleRepository extends ServiceImpl<ExampleMapper, ExampleEntity> {

}
