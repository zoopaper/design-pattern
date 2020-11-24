package com.pattern.prototype;

/**
 * 包裹信息原型
 * User: krisjin
 * Date: 2016/9/20
 */
public class PackageInfo implements Cloneable {

    private int id;
    private String fromName;
    private String toName;
    private String address;
    private String telephone;

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PackageInfo clone() {
        try {
            return (PackageInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }


    public static PackageInfo clonePackage(String username) {
        PackageInfo prototype = PackageInfoCache.get("jingui");
        prototype = prototype.clone();
        prototype.setId(2222);
        return prototype;
    }

}
