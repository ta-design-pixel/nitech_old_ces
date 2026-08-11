// 雛形中の戻り値はコンパイルのための仮の値である．必要に応じて変更すること．
// 一部の問題については追記箇所を明示していない．

import java.util.ArrayList;

// [問1]
class Team{
    // [問1-(ウ)]
    private static int counter = 0;
    private String name;
    private int id;
    private int games;
    private int wins;
    private int losses;
    private int draws;
    private int goalsFor;
    private int goalsAgainst;

    // [問1-(エ)]
    Team(){
        this.id = ++counter;
    }

    // [問1-(オ)，(カ)]
    Team(String data){
        Team id = new Team();
        name = data.split(name,1);
    }

    // [問1-(ア)]
    public double winRate(){
        // 値は適宜変更すること
        return wins/games;
    }

    // [問1-(イ)]
    public int getPoints(){
        // 値は適宜変更すること
        int point = 3*wins + 1*draws + 0*losses;
        return point;
    }

}


// [問2-(ア)]
interface Queueable {
    boolean enqueue( Object o);
    void dequeue();
    int size();
}

// [問2-(イ)]
// 必要に応じて書き換えること
abstract class TeamQueue implements Queueable{


    protected ArrayList<Team> queue;

    // [問2-(ウ)]
    TeamQueue(ArrayList<Team> queue){
        for(int i = 0; i < queue.size(); i++){
            this.queue.add(queue.get(i));
        }

    }

    // [問2-(エ)]
    public void print(){
        for(ArrayList<String> team:queue){
            System.out.println("");
        }
    }

    // [問2-(オ)]
    public boolean enqueue(Object team){
        // 値は適宜変更すること
        return false;
    }

    // [問2-(カ)]
    public Object dequeue(){
        // 値は適宜変更すること
        return null;
    }
}

// [問3-(イ)]
// 必要に応じて書き換えること
class Tournament extends TeamQueue{
int size(){
    return queue.size();
}
    // [問3-(ア)]
    // runMatch を追加
    public String runMatch(Team t1, Tema t2){
        Team winner = null;
        if(t1.wuns > t2.wins){
            return t1;
        }else if(t1.wins < t2.wins){
            return t2;
        }else if((t1.goalsFor - t1.goalsAgainst) > (t2.goalsFor - t2.goalsAgainst)){
            return t1;
        }else if((t1.goalsFor - t1.goalsAgainst) < (t2.goalsFor - t2.goalsAgainst)){
            return t2;
        }
    }

    // [問3-(ウ)]
    // コンストラクタを追加
    Tournament(ArayList<Team> queue){
        super(queue);
    }
    // [問3-(エ)]
    public Team runTournament(){
        // 値は適宜変更すること
        return null;
    }

    // [問3-(オ)]
    public void print(){
    }
}

public class Main{
    public static void main(String[] args){

        String[] data = {
            "Spain:8,7,0,1,14,1",
            "Argentina:8,6,1,1,15,5",
            "Brazil:8,5,2,1,13,7",
            "France:8,5,2,1,12,8",
            "Germany:8,4,2,2,10,6",
            "Japan:8,3,2,3,9,8",
            "England:8,4,3,1,10,9",
            "Portugal:8,2,4,2,8,10"
        };

        ArrayList<Team> teams =
                new ArrayList<Team>();

        // 必要に応じてテストコードを追加
    }
}