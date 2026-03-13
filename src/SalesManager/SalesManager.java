package SalesManager;

public class SalesManager {
    static void main(String[] args) {

        int maxQty; // 재고량
        int[] salesQty = new int[2]; // 실제 판매량
        int targetQty; // 목표 판매량
        double salesAmount; // 판매량
        double realProfit; // 순이익
        double profit; // 매출

        // 입력한 데이터를 토대로 판매지역의 판매량에 대한 매출 계획과 매출원가에 대한 이익률, 그리고 달성률을 비교하는 것을 정의하는 Main Class이다.
        // 이익률만 보자.

        System.out.println("####### 입력받은 정보는 다음과 같습니다. #######");

        Item[] item = {
                new Product("코란도 패밀리","스페인", 10000000, 8800000),
                new Product("코란도 패밀리","포르투갈", 12000000, 8800000),
                new Product("코란도 패밀리","프랑스", 14000000, 8800000),
                new Product("코란도 패밀리","독일", 20000000, 8800000),
        };

        ((Product)item[0]).setUnitSales(78);
        ((Product)item[1]).setUnitSales(52));
        ((Product)item[2]).setUnitSales(100);
        ((Product)item[3]).setUnitSales(35);

        for (int i = 0; i < item.length; i++) {
            salesQty[0] += ((Product)item[i]).getUnitSales();
        }

        Item[] item2 = {
                new Product("무쏘","스페인", 10000000, 8800000),
                new Product("무쏘","포르투갈", 12000000, 8800000),
                new Product("무쏘","프랑스", 14000000, 8800000),
                new Product("무쏘","독일", 20000000, 8800000),
        };

        ((Product)item2[0]).setUnitSales(48);
        ((Product)item2[1]).setUnitSales(88);
        ((Product)item2[2]).setUnitSales(28);
        ((Product)item2[3]).setUnitSales(123);

        for (int i = 0; i < item2.length; i++) {
            salesQty[1] += ((Product)item2[i]).getUnitSales();
        }

        for (int i = 0; i < item2.length; i++) {
            salesQty[1] += ((Product)item2[i]).getUnitSales();
        }

        for(Item i : item){
                System.out.println("[### 제품명 : " + item[i].getProductName() + " ###]");
                System.out.println("[### 판매량 : " + +" ###]");
            }
        }
    }
