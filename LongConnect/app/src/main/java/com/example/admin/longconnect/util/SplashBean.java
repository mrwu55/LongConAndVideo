package com.example.admin.longconnect.util;

import java.io.Serializable;

public class SplashBean implements Serializable {

    /**
     * data : {"id":"1096","home_url":" https://vnsr.an5vvvvvwwwwvvvvvvww5.com/?intr=1371","kc_url":"https://www.v889888.com","service_url":"https://kf1.learnsaas.com/chat/chatClient/chatbox.jsp?companyID=818839&configID=64639&jid=6003376229&s=1","buttonarr":"主页,后退,客服,快充,刷新","buttonimage":"http://142.4.117.17:8001/index/6.9/11.png,http://142.4.117.17:8001/index/6.9/12.png,http://142.4.117.17:8001/index/6.9/13.png,http://142.4.117.17:8001/index/6.9/14.png,http://142.4.117.17:8001/index/6.9/15.png","app_id":"2018063023","platform":"百度","version":"2.0","active":"1"}
     * status : 1
     * msg : 查询成功！
     */

    private DataBean data;
    private int status;
    private String msg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean implements Serializable {
        /**
         * id : 1096
         * home_url :  https://vnsr.an5vvvvvwwwwvvvvvvww5.com/?intr=1371
         * kc_url : https://www.v889888.com
         * service_url : https://kf1.learnsaas.com/chat/chatClient/chatbox.jsp?companyID=818839&configID=64639&jid=6003376229&s=1
         * buttonarr : 主页,后退,客服,快充,刷新
         * buttonimage : http://142.4.117.17:8001/index/6.9/11.png,http://142.4.117.17:8001/index/6.9/12.png,http://142.4.117.17:8001/index/6.9/13.png,http://142.4.117.17:8001/index/6.9/14.png,http://142.4.117.17:8001/index/6.9/15.png
         * app_id : 2018063023
         * platform : 百度
         * version : 2.0
         * active : 1
         */

        private String id;
        private String home_url;
        private String kc_url;
        private String service_url;
        private String buttonarr;
        private String buttonimage;
        private String app_id;
        private String platform;
        private String version;
        private String active;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getHome_url() {
            return home_url;
        }

        public void setHome_url(String home_url) {
            this.home_url = home_url;
        }

        public String getKc_url() {
            return kc_url;
        }

        public void setKc_url(String kc_url) {
            this.kc_url = kc_url;
        }

        public String getService_url() {
            return service_url;
        }

        public void setService_url(String service_url) {
            this.service_url = service_url;
        }

        public String getButtonarr() {
            return buttonarr;
        }

        public void setButtonarr(String buttonarr) {
            this.buttonarr = buttonarr;
        }

        public String getButtonimage() {
            return buttonimage;
        }

        public void setButtonimage(String buttonimage) {
            this.buttonimage = buttonimage;
        }

        public String getApp_id() {
            return app_id;
        }

        public void setApp_id(String app_id) {
            this.app_id = app_id;
        }

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getActive() {
            return active;
        }

        public void setActive(String active) {
            this.active = active;
        }
    }
}
