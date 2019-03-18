package com.iulus.JLTest.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.iulus.JLTest.utils.LocalDateTimeJsonDeserializer;
import com.iulus.JLTest.utils.LocalDateTimeJsonSerializable;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@TableName("content")
public class Content extends Model<Content> {

    /**
     * id
     */
    private Long id;
    /**
     * 内容
     */
    private String Content;
    /**
     * 创建时间
     */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    @JsonSerialize(using = LocalDateTimeJsonSerializable.class)
    @JsonDeserialize(using = LocalDateTimeJsonDeserializer.class)
    private LocalDateTime createTime;
    /**
     * 修改时间
     */
    @TableField(value = "update_time",fill = FieldFill.INSERT)
    @JsonSerialize(using = LocalDateTimeJsonSerializable.class)
    @JsonDeserialize(using = LocalDateTimeJsonDeserializer.class)
    private LocalDateTime udpateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
