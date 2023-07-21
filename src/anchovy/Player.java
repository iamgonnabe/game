package anchovy;

public class Player {
    public String name; // 이름
    public int hp; //현제 체력
    public int muscle; // 근육량

    public int protein; // 단백질


    public Player(String name, int hp, int muscle, int protein){
        this.name = name;
        this.hp = hp;
        this.muscle = muscle;
        this.protein = protein;
    }

}
