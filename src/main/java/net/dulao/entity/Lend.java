package net.dulao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 借
 * (Lend)实体类
 *
 * @author makejava
 * @date 2020/07/23
 * @since 2020-07-21 18:18:50
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Lend implements Serializable {
    private static final long serialVersionUID = 162859199297032476L;

    private Integer lId;

    private Integer lStudent;

    private Integer lBook;

    private Date lLendtime;

    private Date lBacktime;



}