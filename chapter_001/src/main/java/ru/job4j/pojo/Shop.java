package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        showArr(products);

        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1");
        //удаляем значение из ячейки с индексом 1
        products[1] = null;
        showArr(products);

        System.out.println();
        System.out.println("Записываем ячейку в ячейку с индексом 1 значение ячейки с индексом 2 и удяляем значение из ячейки с индексом 2");
        //записываем ячейку в ячейку с индексом 1 значение ячейки с индексом 2.
        products[1] = products[2];
        //удяляем значение из ячейки с индексом 2.
        products[2] = null;
        showArr(products);
        System.out.println();

        delete(products, 0);
        showArr(products);
    }

    public static Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (; index < products.length - 1; index++) {
            products[index] = products[index + 1];
        }
        return products;
    }

    private static void showArr(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}