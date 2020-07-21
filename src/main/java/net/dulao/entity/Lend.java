package net.dulao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Lend)实体类
 *
 * @author makejava
 * @since 2020-07-21 18:18:50
 */
public class Lend implements Serializable {
    private static final long serialVersionUID = 162859199297032476L;

    private Integer lId;

    private Integer lStudent;

    private Integer lBook;

    private Date lLendtime;

    private Date lBacktime;


    public Integer getLId() {
        return lId;
    }

    public void setLId(Integer lId) {
        this.lId = lId;
    }

    public Integer getLStudent() {
        return lStudent;
    }

    public void setLStudent(Integer lStudent) {
        this.lStudent = lStudent;
    }

    public Integer getLBook() {
        return lBook;
    }

    public void setLBook(Integer lBook) {
        this.lBook = lBook;
    }

    public Date getLLendtime() {
        return lLendtime;
    }

    public void setLLendtime(Date lLendtime) {
        this.lLendtime = lLendtime;
    }

    public Date getLBacktime() {
        return lBacktime;
    }

    public void setLBacktime(Date lBacktime) {
        this.lBacktime = lBacktime;
    }

}