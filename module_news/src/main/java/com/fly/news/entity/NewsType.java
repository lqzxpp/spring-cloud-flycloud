package com.fly.news.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Description: <NewsType><br>
 * Author:    门心叼龙<br>
 * Date:      2019/6/11<br>
 * Version:    V1.0.0<br>
 * Update:     <br>
 */
@Entity
@Table(name = "news_type")
public class NewsType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "typename", nullable = false)
    private String typename;

    public NewsType() {
    }

    /**
     * 创建时间
     */
    @CreatedDate
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name = "addtime", updatable = false, nullable = true)
    private Date addtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}
