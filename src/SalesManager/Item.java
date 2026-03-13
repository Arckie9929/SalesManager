package SalesManager;

public abstract class Item implements Reportable {
    public static final String CompanyName = "고자자동차";
    private String productName; // 제품명
    private String area; // 지역
    private double retailPrice; // 판매가
    private double price; // 원가

    public Item(String productName, String area, double retailPrice, double price) {
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

    public double getRetailPrice() {
        return retailPrice;
    }

    public double getPrice() {
        return price;
    }
}
