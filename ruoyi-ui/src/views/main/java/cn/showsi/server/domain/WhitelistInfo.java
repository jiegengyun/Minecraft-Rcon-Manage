package cn.showsi.server.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 白名单对象 whitelist_info
 * 
 * @author ruoyi
 * @date 2023-12-26
 */
public class WhitelistInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 申请时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 游戏名称 */
    @Excel(name = "游戏名称")
    private String userName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String userUuid;

    /** 正版标识 */
    @Excel(name = "正版标识")
    private Long onlineFlag;

    /** 用户QQ号 */
    @Excel(name = "用户QQ号")
    private String qqNum;

    /** 审核用户 */
    @Excel(name = "审核用户")
    private String reviewUsers;

    /** 审核状态 */
    @Excel(name = "审核状态")
    private String status;

    /** 添加状态 */
    @Excel(name = "添加状态")
    private String addState;

    /** 添加时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "添加时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date addTime;

    /** 移除原因 */
    @Excel(name = "移除原因")
    private String removeReason;

    /** 移除时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "移除时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date removeTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setUserUuid(String userUuid) 
    {
        this.userUuid = userUuid;
    }

    public String getUserUuid() 
    {
        return userUuid;
    }
    public void setOnlineFlag(Long onlineFlag) 
    {
        this.onlineFlag = onlineFlag;
    }

    public Long getOnlineFlag() 
    {
        return onlineFlag;
    }
    public void setQqNum(String qqNum) 
    {
        this.qqNum = qqNum;
    }

    public String getQqNum() 
    {
        return qqNum;
    }
    public void setReviewUsers(String reviewUsers) 
    {
        this.reviewUsers = reviewUsers;
    }

    public String getReviewUsers() 
    {
        return reviewUsers;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setAddState(String addState) 
    {
        this.addState = addState;
    }

    public String getAddState() 
    {
        return addState;
    }
    public void setAddTime(Date addTime) 
    {
        this.addTime = addTime;
    }

    public Date getAddTime() 
    {
        return addTime;
    }
    public void setRemoveReason(String removeReason) 
    {
        this.removeReason = removeReason;
    }

    public String getRemoveReason() 
    {
        return removeReason;
    }
    public void setRemoveTime(Date removeTime) 
    {
        this.removeTime = removeTime;
    }

    public Date getRemoveTime() 
    {
        return removeTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("time", getTime())
            .append("userName", getUserName())
            .append("userUuid", getUserUuid())
            .append("onlineFlag", getOnlineFlag())
            .append("qqNum", getQqNum())
            .append("remark", getRemark())
            .append("reviewUsers", getReviewUsers())
            .append("status", getStatus())
            .append("addState", getAddState())
            .append("addTime", getAddTime())
            .append("removeReason", getRemoveReason())
            .append("removeTime", getRemoveTime())
            .toString();
    }
}
