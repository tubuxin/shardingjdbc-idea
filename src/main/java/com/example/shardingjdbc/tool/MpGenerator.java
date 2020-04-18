package com.example.shardingjdbc.tool;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;


public class MpGenerator {

	  /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        //填写要生成代码的数据库的表名   改成自己的
        String[] tables=new String[]{"t_user","t_address"};
        //String[] tables=new String[]{"user","student"};
        generaterCode(tables);
    }
 
    public static void generaterCode(String[] tableNames) {
        AutoGenerator mpg = new AutoGenerator();
        // 选择 freemarker 模板引擎，默认 Veloctiy，如果用的是Veloctiy模板引擎就不需要这句代码
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
 
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("tbx");
        //改成自己的项目路径
        gc.setOutputDir("D:\\workspace\\shardingjdbc\\src\\main\\java");
        gc.setFileOverride(true);// 是否覆盖同名文件，默认是false
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setDateType(DateType.ONLY_DATE);
 
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sDAO");
        gc.setXmlName("%sDAOMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
 
        mpg.setGlobalConfig(gc);
 
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(com.baomidou.mybatisplus.annotation.DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert() {
        });
        //数据源参数改一下
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://localhost:3306/order1?useUnicode=true&characterEncoding=utf8&serverTimezone=PRC");
        mpg.setDataSource(dsc);
 
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setTablePrefix(new String[] { "t_"});// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setEntityLombokModel(true); // 启用lombok增加实体类的get，set方法简化代码；如果不启用可以改为false
 
        strategy.setInclude(tableNames); // 需要生成的表
 
        mpg.setStrategy(strategy);
 
        // 包配置
        PackageConfig pc = new PackageConfig();
        //在哪个父包下生成  改成自己的
        pc.setParent("com.example.shardingjdbc.core");
        pc.setEntity("entity");
        pc.setMapper("dao");
        pc.setXml("dao.xml");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setController("controller");
 
        mpg.setPackageInfo(pc);
 
        // 执行生成
        mpg.execute();
    }
}