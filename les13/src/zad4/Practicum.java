package zad4;

import java.util.HashMap;
import java.util.Map;

public class Practicum {
    // Создадим хеш-таблицу для хранения заказов.
    // В качестве ключа будет имя клиента.
    // В качестве значения — количество заказов от этого клиента.
    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        Practicum pizzeria = new Practicum();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    // Начинаем принимать заказы! 🍕
    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {
        int currentCount = orders.getOrDefault(clientName,0);
        orders.put(clientName, currentCount + 1);
    }

    private void printStatistics() {
        int totalOrders = 0;
        for (Map.Entry<String, Integer> entry : orders.entrySet()){
            String clientName = entry.getKey();
            int orderCount = entry.getValue();
            System.out.println("Заказов от " + clientName + ": " + orderCount);
            totalOrders += orderCount;

        }
        System.out.println("Всего заказов: " + totalOrders);
    }
}
