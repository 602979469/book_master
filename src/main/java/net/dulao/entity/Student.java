package net.dulao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 学生
 * (Student)实体类
 *
 * @author makejava
 * @date 2020/07/23
 * @since 2020-07-21 18:18:50
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private static final long serialVersionUID = 474452574985578100L;

    private Integer sId;

    private String sUsername;

    private String sPassword;


}