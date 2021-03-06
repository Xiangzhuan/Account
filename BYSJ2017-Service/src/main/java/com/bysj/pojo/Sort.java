package com.bysj.pojo;

/**
 * 分类
 * @author chenxin
 *
 */
public class Sort {
	/**id */
    private Integer id;
    /**父id */
    private Integer parentid;
    /**名称 */
    private String name;
    /**描述 */
    private String descp;
    /**类型（收入/支出）*/
    private String type;
    /**图片*/
    private String img;

    public String getDescp() {
		return descp;
	}

	public void setDescp(String descp) {
		this.descp = descp;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDesc() {
        return descp;
    }

    public void setDesc(String desc) {
        this.descp = desc == null ? null : desc.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}