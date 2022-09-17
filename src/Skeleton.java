public class Skeleton extends Boss{
    private int strela;

    public int getStrela() {
        return strela;
    }

    public void setStrela(int strela) {
        this.strela = strela;
    }

    @Override
    public String info(){
        return "Skelet Health: "+getHealth()+", Skelet Attack: "+ getAttack()+", Skelet Ability: "+getAbility()+
                ", Ваше количество стрел: "+ strela;

        }
    }

