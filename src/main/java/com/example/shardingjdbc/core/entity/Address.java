package com.example.shardingjdbc.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author tbx
 * @since 2020-04-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_address")
public class Address extends Model<Address> {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 父id
     */
    private String pid;

    /**
     * 1国家2省3市4县区
     */
    private Integer type;

    private Integer lit;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
