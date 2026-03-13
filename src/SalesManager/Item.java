package SalesManager;

public abstract class Item implements Reportable {
    public static final String CompanyName = "이브이자동차";
    private String productName; // 제품명
    private String area; // 지역
    private int retailPrice; // 판매가
    private int price; // 원가

    public Item(String productName, String area, int retailPrice, int price) {
        this.productName = productName;
        this.area = area;
        this.retailPrice = retailPrice;
        this.price = price;
    }

    public void itemSummary() {
    }

    public void displayItemType() {
    }

    public String getProductName() {
        return productName;
    }

    public String getArea() {
        return area;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public int getPrice() {
        return price;
    }
}
