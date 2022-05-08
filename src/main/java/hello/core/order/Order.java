package hello.core.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int itemProce;
    private int discountPrice;

    public Order(Long memberId, String itemName, int itemProce, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemProce = itemProce;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice(){
        return itemProce - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemProce() {
        return itemProce;
    }

    public void setItemProce(int itemProce) {
        this.itemProce = itemProce;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemProce=" + itemProce +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
