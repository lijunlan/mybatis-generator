package com.sdll18.mybatis.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ProjectLayout {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.layout_id
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private Integer layoutId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.pid
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.layout_pic_id
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private Integer layoutPicId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.layout_name
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private String layoutName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.layout_structure
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private Integer layoutStructure;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.building_area
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private BigDecimal buildingArea;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.inside_area
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private BigDecimal insideArea;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.free_area
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private BigDecimal freeArea;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.layout_orientation
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private String layoutOrientation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.layout_feature
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private String layoutFeature;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.layout_intro
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private String layoutIntro;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.sale_status
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private Byte saleStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.avg
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private BigDecimal avg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.high
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private BigDecimal high;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.low
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private BigDecimal low;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.sum_avg
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private BigDecimal sumAvg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.sum_high
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private BigDecimal sumHigh;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.sum_low
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private BigDecimal sumLow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.price_time
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private Date priceTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.create_time
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.update_time
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.creator
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private Integer creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_layout.editor
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    private Integer editor;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.layout_id
     *
     * @return the value of project_layout.layout_id
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public Integer getLayoutId() {
        return layoutId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.layout_id
     *
     * @param layoutId the value for project_layout.layout_id
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setLayoutId(Integer layoutId) {
        this.layoutId = layoutId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.pid
     *
     * @return the value of project_layout.pid
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.pid
     *
     * @param pid the value for project_layout.pid
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.layout_pic_id
     *
     * @return the value of project_layout.layout_pic_id
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public Integer getLayoutPicId() {
        return layoutPicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.layout_pic_id
     *
     * @param layoutPicId the value for project_layout.layout_pic_id
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setLayoutPicId(Integer layoutPicId) {
        this.layoutPicId = layoutPicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.layout_name
     *
     * @return the value of project_layout.layout_name
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public String getLayoutName() {
        return layoutName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.layout_name
     *
     * @param layoutName the value for project_layout.layout_name
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setLayoutName(String layoutName) {
        this.layoutName = layoutName == null ? null : layoutName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.layout_structure
     *
     * @return the value of project_layout.layout_structure
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public Integer getLayoutStructure() {
        return layoutStructure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.layout_structure
     *
     * @param layoutStructure the value for project_layout.layout_structure
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setLayoutStructure(Integer layoutStructure) {
        this.layoutStructure = layoutStructure;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.building_area
     *
     * @return the value of project_layout.building_area
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public BigDecimal getBuildingArea() {
        return buildingArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.building_area
     *
     * @param buildingArea the value for project_layout.building_area
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setBuildingArea(BigDecimal buildingArea) {
        this.buildingArea = buildingArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.inside_area
     *
     * @return the value of project_layout.inside_area
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public BigDecimal getInsideArea() {
        return insideArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.inside_area
     *
     * @param insideArea the value for project_layout.inside_area
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setInsideArea(BigDecimal insideArea) {
        this.insideArea = insideArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.free_area
     *
     * @return the value of project_layout.free_area
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public BigDecimal getFreeArea() {
        return freeArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.free_area
     *
     * @param freeArea the value for project_layout.free_area
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setFreeArea(BigDecimal freeArea) {
        this.freeArea = freeArea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.layout_orientation
     *
     * @return the value of project_layout.layout_orientation
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public String getLayoutOrientation() {
        return layoutOrientation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.layout_orientation
     *
     * @param layoutOrientation the value for project_layout.layout_orientation
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setLayoutOrientation(String layoutOrientation) {
        this.layoutOrientation = layoutOrientation == null ? null : layoutOrientation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.layout_feature
     *
     * @return the value of project_layout.layout_feature
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public String getLayoutFeature() {
        return layoutFeature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.layout_feature
     *
     * @param layoutFeature the value for project_layout.layout_feature
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setLayoutFeature(String layoutFeature) {
        this.layoutFeature = layoutFeature == null ? null : layoutFeature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.layout_intro
     *
     * @return the value of project_layout.layout_intro
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public String getLayoutIntro() {
        return layoutIntro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.layout_intro
     *
     * @param layoutIntro the value for project_layout.layout_intro
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setLayoutIntro(String layoutIntro) {
        this.layoutIntro = layoutIntro == null ? null : layoutIntro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.sale_status
     *
     * @return the value of project_layout.sale_status
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public Byte getSaleStatus() {
        return saleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.sale_status
     *
     * @param saleStatus the value for project_layout.sale_status
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setSaleStatus(Byte saleStatus) {
        this.saleStatus = saleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.avg
     *
     * @return the value of project_layout.avg
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public BigDecimal getAvg() {
        return avg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.avg
     *
     * @param avg the value for project_layout.avg
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setAvg(BigDecimal avg) {
        this.avg = avg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.high
     *
     * @return the value of project_layout.high
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public BigDecimal getHigh() {
        return high;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.high
     *
     * @param high the value for project_layout.high
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.low
     *
     * @return the value of project_layout.low
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public BigDecimal getLow() {
        return low;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.low
     *
     * @param low the value for project_layout.low
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setLow(BigDecimal low) {
        this.low = low;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.sum_avg
     *
     * @return the value of project_layout.sum_avg
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public BigDecimal getSumAvg() {
        return sumAvg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.sum_avg
     *
     * @param sumAvg the value for project_layout.sum_avg
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setSumAvg(BigDecimal sumAvg) {
        this.sumAvg = sumAvg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.sum_high
     *
     * @return the value of project_layout.sum_high
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public BigDecimal getSumHigh() {
        return sumHigh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.sum_high
     *
     * @param sumHigh the value for project_layout.sum_high
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setSumHigh(BigDecimal sumHigh) {
        this.sumHigh = sumHigh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.sum_low
     *
     * @return the value of project_layout.sum_low
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public BigDecimal getSumLow() {
        return sumLow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.sum_low
     *
     * @param sumLow the value for project_layout.sum_low
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setSumLow(BigDecimal sumLow) {
        this.sumLow = sumLow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.price_time
     *
     * @return the value of project_layout.price_time
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public Date getPriceTime() {
        return priceTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.price_time
     *
     * @param priceTime the value for project_layout.price_time
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setPriceTime(Date priceTime) {
        this.priceTime = priceTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.create_time
     *
     * @return the value of project_layout.create_time
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.create_time
     *
     * @param createTime the value for project_layout.create_time
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.update_time
     *
     * @return the value of project_layout.update_time
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.update_time
     *
     * @param updateTime the value for project_layout.update_time
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.creator
     *
     * @return the value of project_layout.creator
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.creator
     *
     * @param creator the value for project_layout.creator
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_layout.editor
     *
     * @return the value of project_layout.editor
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public Integer getEditor() {
        return editor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_layout.editor
     *
     * @param editor the value for project_layout.editor
     *
     * @mbg.generated Tue Oct 18 15:41:26 CST 2016
     */
    public void setEditor(Integer editor) {
        this.editor = editor;
    }
}