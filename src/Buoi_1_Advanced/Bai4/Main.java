package Buoi_1_Advanced.Bai4;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Người chơi 1");
        Player p2 = new Player("Người chơi 2");

        System.out.println("=== Trò chơi Đấu tay đôi ===");

        // 3 lượt đánh
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n--- Lượt " + i + " ---");
            p1.attack(p2);
            p2.attack(p1);
        }

        System.out.println("\n=== Kết thúc trận đấu ===");
        System.out.printf("%s còn %d máu.%n", p1.getName(), p1.getHealth());
        System.out.printf("%s còn %d máu.%n", p2.getName(), p2.getHealth());
    }
}