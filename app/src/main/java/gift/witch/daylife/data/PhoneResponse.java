package daylife.sbnnest.com.daylife.data;

/**
 * Created by xiaosi on 15/10/11.
 */
public class PhoneResponse {

    private int errNum;
    private String retMsg;
    private PhoneRetData phoneRetData;


    public int getErrNum() {
        return errNum;
    }

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public PhoneRetData getPhoneRetData() {
        return phoneRetData;
    }

    public void setPhoneRetData(PhoneRetData phoneRetData) {
        this.phoneRetData = phoneRetData;
    }

    public static class PhoneRetData{

        private String phone;
        private String prefix;
        private String supplier;
        private String province;
        private String city;
        private String suit;


        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getSupplier() {
            return supplier;
        }

        public void setSupplier(String supplier) {
            this.supplier = supplier;
        }

        public String getSuit() {
            return suit;
        }

        public void setSuit(String suit) {
            this.suit = suit;
        }
    }
}
