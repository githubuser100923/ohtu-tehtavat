package ohtu;

public class TennisGame {
    
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1") {
            m_score1 += 1;
        } else {
            m_score2 += 1;
        }
    }

    private String tie(int m_score) {
        String s = name(m_score);
        if(s=="Deuce") return s;
        return s + "-All";
    }

    private String won(int m_score1, int m_score2) {
        String score = "";
        int minusResult = m_score1 - m_score2;
        if (minusResult==1) {
            score = "Advantage player1";
        } else if (minusResult==-1) {
            score = "Advantage player2";
        } else if (minusResult>=2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }

    private String inProgress(int m_score1, int m_score2) {
        return name(m_score1) + "-" + name(m_score2);
    }

    private String name(int score) {
        switch(score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "Deuce";
        }
    }

    public String getScore() {
        String score = "";
        if (m_score1==m_score2) {
            score = tie(m_score1);
        } else if (m_score1>=4 || m_score2>=4) {
            score = won(m_score1,m_score2);
        } else {
            score = inProgress(m_score1,m_score2);
        }
        return score;
    }
}