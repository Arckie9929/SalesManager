package SalesManager;

import java.util.Scanner;

public class SalesManager {
    static void main(String[] args) {
// === 지역변수 선언부 ======================================================= //
        int[] salesQty = new int[2]; // 실제 판매량
        int mProfit;
        int realProfit; // 순이익
        int profit; // 매출
        String locale = "";

        int salesQty_C2 = 0;
        int mProfit_C2 = 0;
        int profit_C2 = 0;
        int realProfit_C2 = 0;

        int mProfit_C3 = 0;
        int profit_C3 = 0;
        int realProfit_C3 = 0;
        int mProfit_C3_2 = 0;
        int profit_C3_2 = 0;
        int realProfit_C3_2 = 0;

        int MsalesQty_C2 = 0;
        int MmProfit_C2 = 0;
        int Mprofit_C2 = 0;
        int MrealProfit_C2 = 0;

        int totalQty_C2 = 0;
        int totalmProfit_C2 = 0; // 매출총액
        int totalProfit_C2 = 0; // 매출원가
        int totalrealProfit_C2 =0; // 순이익
// ======================================================================== //
        Scanner scan = new Scanner(System.in);

        // 입력한 데이터를 토대로 판매지역의 판매량에 대한 매출 계획과 매출원가에 대한 이익률, 그리고 달성률을 비교하는 것을 정의하는 Main Class이다.
        // 이익률만 보자.

        Product vehicleItem = new Product("샤미드", "지역", 1200, 880, 0);
        Product vehicleItem2 = new Product("부스터", "지역", 1500, 1200, 0);

        int korandoRetailSales = vehicleItem.getRetailPrice();
        int korandoSales = vehicleItem.getPrice();
        int mussoReatilSales = vehicleItem2.getRetailPrice();
        int mussoSales = vehicleItem2.getPrice();
        System.out.println("####### 입력받은 정보는 다음과 같습니다. #######");
        System.out.println();

        Item[] item = {
                new Product("샤미드", "스페인", 1200, 880, 78),
                new Product("샤미드", "포르투갈", 1200, 880, 52),
                new Product("샤미드", "프랑스", 1200, 880, 100),
                new Product("샤미드", "독일", 1200, 880, 35),
        };

        for (int i = 0; i < item.length; i++) {
            salesQty[0] += ((Product) item[i]).getUnitSales();
        }

        Item[] item2 = {
                new Product("부스터", "스페인", 1500, 1200, 48),
                new Product("부스터", "포르투갈", 1500, 1200, 88),
                new Product("부스터", "프랑스", 1500, 1200, 28),
                new Product("부스터", "독일", 1500, 1200, 123),
        };

        for (int i = 0; i < item2.length; i++) {
            salesQty[1] += ((Product) item2[i]).getUnitSales();
        }

        System.out.println("[### 진행하고자 하는 메뉴를 선택하십시오. ###]");
        System.out.println("[### #1. 제품별 매출보고서 출력 ###]");
        System.out.println("[### #2. 지역별 매출보고서 출력 ###]");
        System.out.println("[### #3. 전체 매출보고서 출력 ###]");
        System.out.print("### 입력(1-3) : ");

        int switchNum;
        switchNum = scan.nextInt();

        scan.nextLine(); // 버퍼 정리

        switch (switchNum) {
            case 1:
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        mProfit = vehicleItem.getRetailPrice() * salesQty[i];
                        profit = vehicleItem.getPrice() * salesQty[i];
                        realProfit = (vehicleItem.getRetailPrice() * salesQty[i]) - (vehicleItem.getPrice() * salesQty[i]);

                        System.out.println("[### 제품명 : " + vehicleItem.getProductName() + " ###]");
                        System.out.printf("[### 전체 판매량 : %,d대 ###]%n", salesQty[i]);
                        System.out.printf("[### 매출 : %,d만원 ###]%n", mProfit);
                        System.out.printf("[### 매출원가 : %,d만원 ###]%n", profit);
                        System.out.printf("[### 순이익 : %,d만원 ###]%n", realProfit);
                        System.out.println();
                    } else if (i == 1) {
                        mProfit = vehicleItem2.getRetailPrice() * salesQty[i];
                        profit = vehicleItem2.getPrice() * salesQty[i];
                        realProfit = (vehicleItem2.getRetailPrice() * salesQty[i]) - (vehicleItem2.getPrice() * salesQty[i]);

                        System.out.println("[### 제품명 : " + vehicleItem2.getProductName() + " ###]");
                        System.out.printf("[### 전체 판매량 : %,d대 ###]%n", salesQty[i]);
                        System.out.printf("[### 매출 : %,d만원 ###]%n", mProfit);
                        System.out.printf("[### 매출원가 : %,d만원 ###]%n", profit);
                        System.out.printf("[### 순이익 : %,d만원 ###]%n", realProfit);
                        System.out.println();
                    }
                }
                System.out.println(Item.CompanyName + " 매출에 대한 보고를 종료합니다.");
                break;

            case 2:
                System.out.print("찾고자 하는 지역을 입력하십시오.(프랑스, 포르투갈, 스페인, 독일) : ");
                locale = scan.nextLine();
                if(locale.equals("프랑스") || locale.equals("독일") || locale.equals("포르투갈") || locale.equals("스페인")){

                    for (int i = 0; i < item.length; i++) {
                        if(locale.equals(((Product)item[i]).getArea())){
                            salesQty_C2 += ((Product)item[i]).getUnitSales();
                            mProfit_C2 += korandoRetailSales * salesQty_C2;
                            profit_C2 += korandoSales * salesQty_C2;
                            realProfit_C2 = mProfit_C2 - profit_C2;

                        }
                        if(locale.equals(((Product)item2[i]).getArea())){
                            MsalesQty_C2 += ((Product)item2[i]).getUnitSales(); // 지역별 판매량 더하기
                            MmProfit_C2 += mussoReatilSales * MsalesQty_C2; // 지역별 매출 더하기
                            Mprofit_C2 += mussoSales * MsalesQty_C2; // 지역별 원가 이익 더하기
                            MrealProfit_C2 = MmProfit_C2 - Mprofit_C2; // 순이익
                        }
                    }

                    totalQty_C2 = salesQty_C2 + MsalesQty_C2;
                    totalmProfit_C2 = mProfit_C2 + MmProfit_C2;
                    totalProfit_C2 = profit_C2 + Mprofit_C2;
                    totalrealProfit_C2 = realProfit_C2 + MrealProfit_C2;

                    System.out.println("[### " + locale + " 지역 판매보고서 ###]");
                    System.out.printf("[### 전차종 판매량 : %,d대 ###]%n", totalQty_C2);
                    System.out.printf("[### 전체 매출 : %,d만원 ###]%n", totalmProfit_C2);
                    System.out.printf("[### 전체 매출원가 : %,d만원 ###]%n", totalProfit_C2);
                    System.out.printf("[### 전체 순이익 : %,d만원 ###]%n", totalrealProfit_C2);
                    System.out.println();
                    break;
                }
                else{
                    System.out.println("잘못된 지역명입니다! 프로그램을 종료합니다.");
                    break;
                }

            case 3:

                System.out.println("[### 전체 상품에 대한 보고서를 출력합니다. ###]");

                int superTotalQty = 0;
                int superTotalmProfit = 0;
                int superTotalProfit = 0;
                int superTotalRealProfit = 0;

                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        mProfit_C3 = vehicleItem.getRetailPrice() * salesQty[i];
                        profit_C3 = vehicleItem.getPrice() * salesQty[i];
                        realProfit_C3 = (vehicleItem.getRetailPrice() * salesQty[i]) - (vehicleItem.getPrice() * salesQty[i]);

                    } else if (i == 1) {
                        mProfit_C3_2 += vehicleItem2.getRetailPrice() * salesQty[i];
                        profit_C3_2 = vehicleItem2.getPrice() * salesQty[i];
                        realProfit_C3_2 = (vehicleItem2.getRetailPrice() * salesQty[i]) - (vehicleItem2.getPrice() * salesQty[i]);

                    }
                }
                superTotalQty = salesQty[0] + salesQty[1];
                superTotalmProfit = mProfit_C3 + mProfit_C3_2;
                superTotalProfit = profit_C3 + profit_C3_2;
                superTotalRealProfit = realProfit_C3 + realProfit_C3_2;

                System.out.println("[### 전체 매출 보고서 ###]");
                System.out.printf("[### 전체 판매량 : %,d대 ###]%n", superTotalQty);
                System.out.printf("[### 매출 : %,d만원 ###]%n", superTotalmProfit);
                System.out.printf("[### 매출원가 : %,d만원 ###]%n", superTotalProfit);
                System.out.printf("[### 순이익 : %,d만원 ###]%n", superTotalRealProfit);
                System.out.println();
                System.out.println(Item.CompanyName + "의 전체 매출에 대한 보고를 종료합니다.");
                break;

            default:
                System.out.print("잘못된 입력입니다! 프로그램을 종료합니다!");
                break;
        }
    }
}
