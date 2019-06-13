package com.tiantian.ticket.model;

import java.time.LocalDateTime;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class Account {
    /**
     * 
     */
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 
     */
    private String email;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户电话
     */
    private String tel;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    private Date updateAt;
}