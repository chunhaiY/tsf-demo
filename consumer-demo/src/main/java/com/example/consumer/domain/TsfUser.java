package com.example.consumer.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName tsf_user
 */
@TableName(value ="tsf_user")
@Data
public class TsfUser implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    @TableField(value = "xm")
    private String xm;

    /**
     * 
     */
    @TableField(value = "cjsj")
    private LocalDateTime cjsj;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}