package Buoi_2.Bai4;

import java.util.Random;

class Player {
    // Biến instance
    private String name;
    private int health;

    // Biến static
    private static final int MAX_HEALTH = 100;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.health = MAX_HEALTH;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    // Phương thức attack
    public void attack(Player enemy) {
        Random rand = new Random();
        int damage = rand.nextInt(21) + 10; // 10–30

        // Trừ máu đối phương
        enemy.health -= damage;
        if (enemy.health < 0) {
            enemy.health = 0; // không âm
        }

        // In kết quả
        System.out.printf("%s tấn công %s gây %d sát thương. Máu %s còn: %d%n",
                this.name, enemy.name, damage, enemy.name, enemy.health);
    }
}