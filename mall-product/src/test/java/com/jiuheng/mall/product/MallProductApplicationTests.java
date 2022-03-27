package com.jiuheng.mall.product;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.jiuheng.mall.product.entity.BrandEntity;
import com.jiuheng.mall.product.service.BrandService;
import com.jiuheng.mall.product.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Resource
    private BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("nova7 128+8G");
        // boolean save = brandService.save(brandEntity);
//        if (save){
//            System.out.println("保存成功......");
//        }
        List<BrandEntity> list1 = brandService.list();
        list1.forEach(System.out::println);
        brandService.removeById(1);
        List<BrandEntity> list = brandService.list();
        list.forEach(System.out::println);
    }

}
