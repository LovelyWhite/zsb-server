package cn.maixedu.zsb.wxpaysdk;

import java.io.InputStream;

/**
 * @Description:
 * @Author:lw
 * @Date:2020/10/31
 */
public class MyWxPayConfig extends WXPayConfig {
    @Override
    String getAppID() {
        return "wx04753140ee90a047";
    }

    @Override
    String getMchID() {
        return "1600272921";
    }

    @Override
    String getKey() {
        return "5ea946402f207dfbf9231598100fc9ef";
    }

    @Override
    InputStream getCertStream() {
        return null;
    }

    @Override
    IWXPayDomain getWXPayDomain() {
        return new IWXPayDomain() {
            @Override
            public void report(String domain, long elapsedTimeMillis, Exception ex) {

            }

            @Override
            public DomainInfo getDomain(WXPayConfig config) {
                return new IWXPayDomain.DomainInfo(WXPayConstants.DOMAIN_API,true);
            }
        };
    }
}
