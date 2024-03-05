package com.yupi.project.model.dto.interfaceinfo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * invoker请求
 *
 *
 *
 */
@Data
public class InterfaceInfoInvokerRequest implements Serializable {

    /**
     * 主键
     */

    private Long id;


    /**
     * 请求参数
     */
    private String userRequestParams;


    private static final long serialVersionUID = 1L;
}