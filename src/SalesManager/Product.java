package SalesManager;

public class Product extends Item {

    private int unitSales;

    public Product(String productName, String area, int retailPrice, int price, int unitSales) {
        super(productName, area, retailPrice, price);
        this.unitSales = unitSales;
    }

    @Override
    public void itemSummary() {
        System.out.println("[### " + Item.CompanyName + " " + getProductName() + " 요약 ###]");
        System.out.println("[### 판매 지역 : " + getArea() + " ###]");
        System.out.println("[### 권장 소비자가격 : " + getRetailPrice() + " ###]");
        System.out.println("[### 제작 원가 : " + getPrice() + " ###]");
        System.out.println("[### 요약 종료 ###]");
    }

    @Override
    public void displayItemType() {
        System.out.println("[### 고자자동차 " + getProductName() + " 현재고 ###]");
        System.out.println("[### 판매 지역 : " + getArea() + "대 ###]");
        System.out.println("[### 요약 종료 ###]");
    }

    public void setUnitSales(int unitSales) {
        this.unitSales = unitSales;
    }

    public int getUnitSales() {
        return unitSales;
    }
}

