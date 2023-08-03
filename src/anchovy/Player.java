package anchovy;

public class Player {
    public String name; // 이름
    public int hp; //현제 체력
    public int muscle; // 근육량
    public int protein; // 단백질
    public int level; //레벨
    public int[] equip = {0,0,0,0,0};
    public int key = 0;



    

    public Player(String name, int hp, int muscle, int protein, int level, int[] equip){
        this.name = name;
        this.hp = hp;
        this.muscle = muscle;
        this.protein = protein;
        this.level = level;
        this.equip = equip;
        this.key = key;
    }

}
