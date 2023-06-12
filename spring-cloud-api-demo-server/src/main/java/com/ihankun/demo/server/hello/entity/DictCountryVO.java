package com.ihankun.demo.server.hello.entity;

import com.ihankun.core.base.api.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author hankun
 */
@EqualsAndHashCode(callSuper = true)
@ApiModel("国家字典vo")
@Data
public class DictCountryVO extends BaseVO {

    /**
     * 国家字典主键ID
     */
    @ApiModelProperty(value = "查国家字典主键ID")
    private Long id;

    /**
     * 国家名称
     */
    @ApiModelProperty(value = "国家名称")
    private String name;

    /**
     * 中文名称
     */
    @ApiModelProperty(value = "中文名称")
    private String cname;

    /**
     * 英文名称
     */
    @ApiModelProperty(value = "英文名称")
    private String ename;

    /**
     * 简拼
     */
    @ApiModelProperty(value = "简拼")
    private String inputCode;

    /**
     * 全拼
     */
    @ApiModelProperty(value = "全拼")
    private String fullCode;

    /**
     * 五笔
     */
    @ApiModelProperty(value = "五笔")
    private String wbCode;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    private Integer orderNo;

    /**
     * 作废标记
     */
    @ApiModelProperty(value = "作废标记")
    private String invalidFlag;

    /**
     * 首都
     */
    @ApiModelProperty(value = "首都")
    private String capital;

    /**
     * 国歌
     */
    @ApiModelProperty(value = "国歌")
    private String nationalAnthem;

    /**
     * 货币
     */
    @ApiModelProperty(value = "货币")
    private String currency;

    /**
     * 国家代码
     */
    @ApiModelProperty(value = "国家代码")
    private String code;

    /**
     * 时区
     */
    @ApiModelProperty(value = "时区")
    private String timeZone;

    /**
     * 国际电话区号
     */
    @ApiModelProperty(value = "国际电话区号")
    private String areaCode;

    /**
     * 国际域名缩写
     */
    @ApiModelProperty(value = "国际域名缩写")
    private String domain;

    /**
     * 所在州
     */
    @ApiModelProperty(value = "所在州")
    private String continent;

    /**
     * 国旗
     */
    @ApiModelProperty(value = "国旗")
    private String nationalFlag;

    /**
     * 国花
     */
    @ApiModelProperty(value = "国花")
    private String nationalFlower;

    /**
     * 是否是国家
     */
    @ApiModelProperty(value = "是否是国家")
    private String countryFlag;

    /**
     * 首字母
     */
    @ApiModelProperty(value = "首字母")
    private String initial;

    /**
     * 附加信息
     */
    @ApiModelProperty(value = "附加信息")
    private String extra;

    /**
     * 语言
     */
    @ApiModelProperty(value = "语言")
    private String language;
}
