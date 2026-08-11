// 雛形中の戻り値はコンパイルのための仮の値である．必要に応じて変更すること．
// 一部の問題については追記箇所を明示していない．

import java.util.ArrayList;

// [問1]
class Team{
    // [問1-(ウ)]
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
    }

    // [問1-(オ)，(カ)]
    Team(String data){
    }

    // [問1-(ア)]
    public double winRate(){
        // 値は適宜変更すること
        return 0.0;
    }

    // [問1-(イ)]
    public int getPoints(){
        // 値は適宜変更すること
        return 0;
    }

}


// [問2-(ア)]



// [問2-(イ)]
// 必要に応じて書き換えること
class TeamQueue{

    protected ArrayList<Team> queue;

    // [問2-(ウ)]
    TeamQueue(ArrayList<Team> queue){
    }

    // [問2-(エ)]
    public void print(){
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
class Tournament{

    // [問3-(ア)]
    // runMatch を追加

    // [問3-(ウ)]
    // コンストラクタを追加

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