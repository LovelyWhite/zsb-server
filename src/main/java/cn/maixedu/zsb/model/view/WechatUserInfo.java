package cn.maixedu.zsb.model.view;

/**
 * @Description: 微信通过 getuserinfo得到的信息
 * @Author:lw
 * @Date:2020/8/29
 */
public class WechatUserInfo {
    String encryptedData;
    String errMsg;
    String iv;
    String rawData;
    String signature;
    String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEncryptedData() {
        return encryptedData;
    }

    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getIv() {
        return iv;
    }

    public void setIv(String iv) {
        this.iv = iv;
    }

    public String getRawData() {
        return rawData;
    }

    public void setRawData(String rawData) {
        this.rawData = rawData;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "WechatUserInfoDetail{" +
                "encryptedData='" + encryptedData + '\'' +
                ", errMsg='" + errMsg + '\'' +
                ", iv='" + iv + '\'' +
                ", rawData='" + rawData + '\'' +
                ", signature='" + signature + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}