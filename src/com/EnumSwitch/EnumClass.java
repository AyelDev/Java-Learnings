public class EnumClass{
    // #70 Enum Class in Java
    public static void main(String[] args){
        Skills Akali = Skills.DASH;
        
        int a =  Akali.getManaCost();
        
        for(Skills skill : Skills.values()){
            System.out.println(skill + " " + skill.getManaCost());
        }

    }
}

enum Skills{
    //SKILL AND MANA COST
   DASH(20),FIRE(40), FLICK(50), RUN(60), CRAWL;

   private int manaCost;

   Skills(int manaCost){
    this.manaCost = manaCost;
    System.out.println(" in Skills " + this.name());
   }

   Skills(){
    manaCost = 400;
   }

public int getManaCost() {
    return manaCost;
}

public void setManaCost(int manaCost) {
    this.manaCost = manaCost;
}

   
}