package behavioral.memento;

public class MyGame {

    public static void main(String[] args) {
        Game game = new Game();
        game.set("Level 2", 30000);
        System.out.println(game);

        File file =new File();
        file.setSave(game.save());
        game.set("Level 4", 55000);
        System.out.println(game);
        game.load(file.getSave());
        System.out.println(game);
    }
}
