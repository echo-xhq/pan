package top.xhq.pan.request;

/**
 * 增加分享请求实体
 *
 * @author: xhq
 * @date: 2019/9/27
 */
public class AddShareViewCountRequest {
    private String shareId;

    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    @Override
    public String toString() {
        return "AddShareViewCountRequest{" +
                "shareId='" + shareId + '\'' +
                '}';
    }
}
