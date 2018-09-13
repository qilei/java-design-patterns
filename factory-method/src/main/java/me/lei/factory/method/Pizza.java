package me.lei.factory.method;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品接口
 * clam
 * veggie
 * cheese
 *
 * tossing dough crust
 * thin thick
 * sauce
 * toppings
 */
public abstract class Pizza {
    String name;
    /**
     * 面团
     */
    String dough;

    /**
     * 披萨酱
     */
    String sauce;

    /**
     * 佐料
     */
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("开始制作披萨：" + name);
        System.out.println("使用面饼：" + dough);
        System.out.println("添加番茄酱");
        for (String item : toppings) {
            System.out.println("添加佐料:" + item);
        }
    }

    void bake() {
        System.out.println("烘焙披萨，烤25分钟");
    }

    void cut() {
        System.out.println("披萨切成三角形");
    }

    void box() {
        System.out.println("披萨装盒");
    }
}
