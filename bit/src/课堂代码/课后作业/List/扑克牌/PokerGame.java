package 课堂代码.课后作业.List.扑克牌;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokerGame {
    public static final String[] suits = {"♥", "♠", "♣", "♦"};

    private static List<Card> buyPoker() {

        ArrayList<Card> poker = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j <= 10; j++) {
                poker.add(new Card(suits[i], "" + j));
            }
            poker.add(new Card(suits[i], "J"));
            poker.add(new Card(suits[i], "Q"));
            poker.add(new Card(suits[i], "K"));
            poker.add(new Card(suits[i], "A"));
        }
        poker.add(new Card("", "big Joker"));
        poker.add(new Card("", "small Joker"));
        return poker;
    }

    private static void shuffle(List<Card> poker) {
        Random random = new Random();
        for (int i = 0; i < poker.size(); i++) {
            swap(poker, i, random.nextInt(poker.size()));
        }
    }

    private static void swap(List<Card> poker, int i, int j) {
        Card tmp = poker.get(i);
        poker.set(i, poker.get(j));
        poker.set(j, tmp);
    }

    public static void main(String[] args) {
        List<Card> poker = buyPoker();
        //洗牌
        shuffle(poker);
        //创建玩家集合
        List<List<Card>> players = new ArrayList<>();
        //玩家手牌集合
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        //每次发牌要将牌库的牌删除掉,避免重复发牌
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 3; j++) {
                /*
                Card top = poker.remove(0);
                List<Card> player = players.get(j);
                player.add(top);
                */
                //发牌过程
                players.get(j).add(poker.remove(0));
            }
        }
        int k = 0;
        for (List<Card> i : players) {
            System.out.print("玩家 " + (++k) + " 的手牌为: ");
            for (int j = 0; j < 18; j++) {
                System.out.print(" |" + i.get(j).suit + i.get(j).rank + "|");
            }
            System.out.println();
        }
    }
}

